# Ransalu POS - Shop Sales & Inventory Management System

This is your NetBeans project with the **interface left exactly as you built
it** (all 3 `.form` files / layouts are untouched) - only the Java code behind
the buttons, fields and tables has been written, plus a matching MySQL
database.

## 1. Setup steps (do these before running)

1. **Add the MySQL Connector/J driver to the project.**
   The project has no JDBC driver bundled. Download "MySQL Connector/J"
   (a `.jar` file) from the official MySQL site, then in NetBeans:
   Right-click the project → **Properties → Libraries → Compile → Add JAR/Folder**
   → select the downloaded jar.

2. **Create the database.** Import `ransalu_db.sql` (in this same folder)
   into MySQL, e.g.:
   ```
   mysql -u root -p < ransalu_db.sql
   ```
   or open it in phpMyAdmin / MySQL Workbench and run it.

   **Already have the database set up from before?** You only need the new
   `expense` table - run just this part instead of the whole file:
   ```sql
   USE ransalu_db;
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
   ```

3. **Check the DB connection settings** in
   `src/pos/DBConnection.java` (top of the file) - by default it connects to
   `localhost:3306`, database `ransalu_db`, user `root`, no password. Edit
   those 3 lines if your MySQL setup is different.

4. Run the project (`Login.java` → `main`).

## 2. Default logins (from the seed data)

| Role    | Username | Password    |
|---------|----------|-------------|
| Admin   | admin    | admin123    |
| Cashier | cashier  | cashier123  |

Change these from the Employees screen after your first login.

## 3. What was implemented

- **Login** - checks the `employee` table, password is checked as a SHA-256
  hash (never stored or compared in plain text), and the Role dropdown is
  cross-checked against the employee's real role in the database.
- **Admin → Sales/billing** - today's sales total, transaction count and a
  live list of recently sold items.
- **Admin → Fabric/Stock** - Add / Update / Delete / Search, backed by the
  `product` table.
- **Admin → Employees** - Register / Update / Delete, with username
  uniqueness and password-confirmation checks. Passwords are hashed before
  saving.
- **Admin → Transactions** - "Today" and "Find Invoice" load bills from the
  `invoice` table; clicking a bill shows its items from `invoice_item`.
- **Admin → Reports** - all 4 original tabs (Employee List, Low Stock,
  Available Stock, Daily Sales) are wired to live data, plus a new
  **Profit & Loss** tab (see below).
- **Admin → Expenses** *(new)* - a sidebar panel to record daily business
  expenses (Light Bill, Rent, Transport, Refreshments, Salaries,
  Maintenance, Other - or type your own category). Add / Update / Delete,
  filter by date range or jump to "Today" / "Show All", with a running
  total. Backed by a new `expense` table (see `ransalu_db.sql`).
- **Admin → Reports → Profit & Loss** *(new)* - pick a date range (or use
  the "Today" / "This Month" shortcuts) to see:
  - **Total Revenue** - sum of invoice totals in that range.
  - **Cost of Goods Sold** - quantity sold × each product's current buying
    price (an approximation, since the cost at the exact time of sale
    isn't stored per invoice line).
  - **Daily Expenses** - sum of the `expense` table in that range.
  - **Net Profit / Loss** - Revenue − (COGS + Expenses), shown in green
    for a profit and red for a loss.
- **Cashier billing** - type a Fabric ID and press Enter to look it up, type
  a quantity and press Enter to add it to the cart, **Calculate** works out
  the balance from the cash entered, **Print Bill** saves the invoice +
  items to the database, deducts the sold quantity from stock, and opens
  the system print dialog with a formatted receipt.
- **Logout** button on the Admin sidebar.
- **Ransalu logo / branding** *(new)* - the actual Ransalu logo (needle +
  thread mark, "RANSALU - Fabrics that inspire") now shows on the Login
  screen, in the Admin sidebar, and as the window/taskbar icon for the
  Login, Admin and Cashier windows. The images live in
  `src/pos/resources/logo.png` (full logo) and `logo_icon.png` (mark
  only, used for the small window icon), loaded through the new
  `AppIcon` helper class - swap those two PNG files if you ever want to
  change the branding.

## 4. Small things you should know about (no layout/design was changed)

- Two report tabs ("Employee List" and "Low Stock") and the "Daily Sales"
  tab were empty placeholder panels in your form - the tables that were
  already sitting unused in the designer (`jTable6`-`jTable9`) have simply
  been placed inside them in code, so the design itself wasn't touched.
- The top header bar (above the tabs) was empty, so it now shows
  "Logged in as: ... | Role: ..." using a label added in code.
- A few dropdown items that were still placeholder text ("Item 1", "Item 2"…)
  were replaced at runtime with real fabric categories / roles - the
  `.form` files themselves are unchanged.
- There's no "Reorder Level" or "Image upload" input anywhere in your
  Fabric/Employee forms, so new fabrics default to a reorder level of 10
  (editable directly in the database), and product/employee images aren't
  used since there's no UI control for them.
- `Cashier.java` is a `JPanel`, not a window by itself - `Login.java` now
  wraps it in a plain `JFrame` when a cashier logs in (it could not display
  at all before this fix).
