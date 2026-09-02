-- ============================================================
--  Ransalu Clothing Store - Sales & Inventory Management System
--  Database: ransalu_db
--
--  Import this in phpMyAdmin / MySQL Workbench / mysql CLI, e.g.:
--      mysql -u root -p < ransalu_db.sql
--
--  Matches the connection settings in pos/DBConnection.java
--  (localhost:3306, user "root", no password by default - edit
--  DBConnection.java if your MySQL setup is different).
-- ============================================================

CREATE DATABASE IF NOT EXISTS ransalu_db;
USE ransalu_db;

-- ------------------------------------------------------------
-- Employees (Admin / Cashier login + registration)
-- ------------------------------------------------------------
CREATE TABLE IF NOT EXISTS employee (
    employee_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name  VARCHAR(100) NOT NULL,
    last_name   VARCHAR(100) NOT NULL,
    nic         VARCHAR(20)  NOT NULL,
    contact     VARCHAR(20),
    address     TEXT,
    username    VARCHAR(100) NOT NULL UNIQUE,
    password    VARCHAR(255) NOT NULL,   -- SHA-256 hash, see pos/PasswordUtil.java
    role        VARCHAR(50)  NOT NULL,   -- 'Admin' or 'Cashier'
    image       LONGBLOB,                -- not used yet (no upload field in the UI)
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- ------------------------------------------------------------
-- Products (fabrics) - quantity / reorder_level are in metres
-- ------------------------------------------------------------
CREATE TABLE IF NOT EXISTS product (
    product_id     VARCHAR(20) PRIMARY KEY,
    name           VARCHAR(150) NOT NULL,
    category       VARCHAR(100),
    buying_price   DECIMAL(10,2) NOT NULL DEFAULT 0,
    selling_price  DECIMAL(10,2) NOT NULL DEFAULT 0,
    quantity       DECIMAL(10,2) NOT NULL DEFAULT 0,   -- metres available
    reorder_level  DECIMAL(10,2) NOT NULL DEFAULT 10,  -- below this = "Low Stock"
    image          LONGBLOB                             -- not used yet (no upload field in the UI)
);

-- ------------------------------------------------------------
-- Invoices (one row per completed sale / bill)
-- ------------------------------------------------------------
CREATE TABLE IF NOT EXISTS invoice (
    invoice_id   INT PRIMARY KEY AUTO_INCREMENT,
    invoice_no   VARCHAR(30) NOT NULL UNIQUE,
    invoice_date DATE NOT NULL,
    invoice_time TIME NOT NULL,
    employee_id  INT,
    total        DECIMAL(10,2) NOT NULL DEFAULT 0,
    cash         DECIMAL(10,2) NOT NULL DEFAULT 0,
    balance      DECIMAL(10,2) NOT NULL DEFAULT 0,
    FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);

-- ------------------------------------------------------------
-- Invoice line items
-- ------------------------------------------------------------
CREATE TABLE IF NOT EXISTS invoice_item (
    id          INT PRIMARY KEY AUTO_INCREMENT,
    invoice_id  INT,
    product_id  VARCHAR(20),
    qty         DECIMAL(10,2) NOT NULL,
    unit_price  DECIMAL(10,2) NOT NULL,
    total       DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (invoice_id) REFERENCES invoice(invoice_id),
    FOREIGN KEY (product_id) REFERENCES product(product_id)
);

-- ------------------------------------------------------------
-- Daily Expenses (Light Bill, Rent, Transport, Refreshments, etc.)
-- Used by the "Expenses" sidebar panel and the Profit & Loss report.
-- ------------------------------------------------------------
CREATE TABLE IF NOT EXISTS expense (
    expense_id   INT PRIMARY KEY AUTO_INCREMENT,
    category     VARCHAR(100) NOT NULL,
    amount       DECIMAL(10,2) NOT NULL,
    expense_date DATE NOT NULL,
    description  TEXT,
    employee_id  INT,
    created_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);

-- ============================================================
--  SEED DATA - so the app isn't empty the first time you run it
-- ============================================================

-- Default logins:
--   Admin    -> username: admin    | password: admin123
--   Cashier  -> username: cashier  | password: cashier123
-- (Change these from the Employees screen after your first login!)

INSERT INTO employee (first_name, last_name, nic, contact, address, username, password, role) VALUES
('Ransalu', 'Perera', '901234567V', '0771234567', 'No 12, Galle Road, Colombo', 'admin',   '240be518fabd2724ddb6f04eeb1da5967448d7e831c08c8fa822809f74c720a9', 'Admin'),
('Nimal',   'Silva',  '951122334V', '0719876543', 'No 45, Main Street, Baddegama', 'cashier', 'b4c94003c562bb0d89535eca77f07284fe560fd48a7cc1ed99f0a56263d616ba', 'Cashier');

INSERT INTO product (product_id, name, category, buying_price, selling_price, quantity, reorder_level) VALUES
('F001', 'White Cotton', 'Cotton',     250.00, 350.00, 120.0, 20),
('F002', 'Pure Silk',     'Silk',      950.00, 1350.00, 45.0, 15),
('F003', 'Denim Blue',    'Denim',     400.00, 600.00,  80.0, 20),
('F004', 'Linen Beige',   'Linen',     500.00, 750.00,   8.0, 10),
('F005', 'Polyester Red', 'Polyester', 200.00, 300.00, 150.0, 25),
('F006', 'Wool Grey',     'Wool',      700.00, 1000.00,  6.0, 10);

INSERT INTO expense (category, amount, expense_date, description, employee_id) VALUES
('Rent',         50000.00, CURDATE(), 'Monthly shop rent', 1),
('Light Bill',    8500.00, CURDATE(), 'Electricity bill', 1),
('Transport',     2000.00, CURDATE(), 'Fabric delivery transport', 1);
