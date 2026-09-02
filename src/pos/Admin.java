
package pos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Admin extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Admin.class.getName());

    
    private Integer selectedEmployeeId = null;
    private String selectedProductId = null;

    // ------------------------------------------------------------------
    //  EXPENSES (added) - sidebar panel + Profit & Loss report fields
    // ------------------------------------------------------------------
    private Integer selectedExpenseId = null;
    private final java.util.List<Integer> expenseIds = new java.util.ArrayList<>();
    private javax.swing.JPanel pExpenses;
    private javax.swing.JButton jButton18;
    private javax.swing.JComboBox<String> cmbExpenseCategory;
    private javax.swing.JTextField txtExpenseAmount;
    private javax.swing.JTextField txtExpenseDate;
    private javax.swing.JTextArea txtExpenseDesc;
    private javax.swing.JTable tblExpenses;
    private javax.swing.JLabel lblExpenseTotal;

    private javax.swing.JTextField txtPLFrom;
    private javax.swing.JTextField txtPLTo;
    private javax.swing.JLabel lblPLRevenue;
    private javax.swing.JLabel lblPLCogs;
    private javax.swing.JLabel lblPLExpenses;
    private javax.swing.JLabel lblPLNet;

    public Admin() {
        initComponents();
        setupExtra();
        java.awt.Image icon = AppIcon.windowIcon(64);
        if (icon != null) {
            setIconImage(icon);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane7 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        Left = new javax.swing.JPanel();
        pnlLogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlLogout = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        pnlButtons = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Right = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        pnlMain = new javax.swing.JPanel();
        pSales = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        pFabric = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        pEmployee = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel23 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel24 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        pDailyTransfer = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        pReports = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();

        jTable6.setBackground(new java.awt.Color(204, 204, 204));
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Category", "Availlable (m)", "Sell Price", "Buy Price", "Stock Value"
            }
        ));
        jScrollPane7.setViewportView(jTable6);

        jTable7.setBackground(new java.awt.Color(204, 204, 204));
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fabric ID", "Name", "Category", "Current (M)"
            }
        ));
        jScrollPane8.setViewportView(jTable7);

        jTable8.setBackground(new java.awt.Color(204, 204, 204));
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Full Name", "NIC", "Contact", "User Name", "Role"
            }
        ));
        jScrollPane9.setViewportView(jTable8);

        jTable9.setBackground(new java.awt.Color(204, 204, 204));
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Invoice No", "Time", "Cashier", "Total (LKR)", "Cash (LKR)", "Balance (LKR)"
            }
        ));
        jScrollPane10.setViewportView(jTable9);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));

        Left.setBackground(new java.awt.Color(51, 51, 51));
        Left.setMinimumSize(new java.awt.Dimension(250, 720));
        Left.setPreferredSize(new java.awt.Dimension(250, 720));
        Left.setLayout(new java.awt.BorderLayout());

        pnlLogo.setBackground(new java.awt.Color(0, 0, 0));
        pnlLogo.setPreferredSize(new java.awt.Dimension(250, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/resources/admin.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Left.add(pnlLogo, java.awt.BorderLayout.PAGE_START);

        pnlLogout.setBackground(new java.awt.Color(0, 0, 0));
        pnlLogout.setPreferredSize(new java.awt.Dimension(250, 60));
        pnlLogout.setLayout(new java.awt.GridLayout(1, 1));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 0, 0));
        jButton6.setText("Logout");
        jButton6.setBorder(null);
        pnlLogout.add(jButton6);

        Left.add(pnlLogout, java.awt.BorderLayout.PAGE_END);

        pnlButtons.setBackground(new java.awt.Color(0, 0, 0));
        pnlButtons.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 1, 1, 1));
        pnlButtons.setLayout(new java.awt.GridLayout(8, 1, 0, 5));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sales/billing");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 40, 1, 1));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(this::jButton1ActionPerformed);
        pnlButtons.add(jButton1);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Fabric/Stock");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 40, 1, 1));
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(this::jButton2ActionPerformed);
        pnlButtons.add(jButton2);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Employees");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 40, 1, 1));
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(this::jButton3ActionPerformed);
        pnlButtons.add(jButton3);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Transactions");
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 40, 1, 1));
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(this::jButton4ActionPerformed);
        pnlButtons.add(jButton4);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Reports");
        jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 40, 1, 1));
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addActionListener(this::jButton5ActionPerformed);
        pnlButtons.add(jButton5);

        Left.add(pnlButtons, java.awt.BorderLayout.CENTER);

        getContentPane().add(Left, java.awt.BorderLayout.LINE_START);

        Right.setLayout(new java.awt.BorderLayout());

        pnlHeader.setBackground(new java.awt.Color(240, 240, 240));
        pnlHeader.setPreferredSize(new java.awt.Dimension(1030, 60));

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        Right.add(pnlHeader, java.awt.BorderLayout.PAGE_START);

        pnlMain.setLayout(new java.awt.CardLayout());

        pSales.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        jLabel2.setText("Sales & Billing");

        jLabel4.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        jLabel4.setText("Today Sales");

        jLabel5.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        jLabel6.setText("Transactions");

        jLabel7.setText("jLabel7");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Item", "Time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)
                                .addComponent(jLabel6))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel5)
                                .addGap(215, 215, 215)
                                .addComponent(jLabel7)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jTextField2.setBackground(new java.awt.Color(0, 0, 102));
        jTextField2.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Ransalu Clothing Store - Management System");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pSalesLayout = new javax.swing.GroupLayout(pSales);
        pSales.setLayout(pSalesLayout);
        pSalesLayout.setHorizontalGroup(
            pSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pSalesLayout.createSequentialGroup()
                .addGroup(pSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pSalesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pSalesLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pSalesLayout.setVerticalGroup(
            pSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSalesLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlMain.add(pSales, "card2");

        pFabric.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Category", "Buy (LKR)", "Sell (LKR)", "Meters", "Recorder"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        jButton7.setBackground(new java.awt.Color(51, 0, 102));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Search");
        jButton7.addActionListener(this::jButton7ActionPerformed);

        jPanel12.setBackground(new java.awt.Color(102, 102, 102));

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Fabric Details");

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Fabric ID");

        jTextField8.setText("jTextField3");

        jLabel18.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Fabric Name");

        jTextField9.setText("jTextField4");

        jLabel19.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Category");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel20.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Buying Price (LKR)");

        jTextField10.setText("jTextField5");

        jLabel21.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Selling Price (LKR)");

        jTextField11.setText("jTextField6");

        jLabel22.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Available (m)");

        jTextField12.setText("jTextField7");

        jButton12.setBackground(new java.awt.Color(0, 153, 51));
        jButton12.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Add");

        jButton13.setBackground(new java.awt.Color(0, 153, 153));
        jButton13.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Update");

        jButton14.setBackground(new java.awt.Color(0, 51, 102));
        jButton14.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Clear");

        jButton15.setBackground(new java.awt.Color(153, 0, 0));
        jButton15.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Delete");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8)
                    .addComponent(jTextField9)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField10)
                    .addComponent(jTextField11)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addGap(0, 97, Short.MAX_VALUE))
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField12))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pFabricLayout = new javax.swing.GroupLayout(pFabric);
        pFabric.setLayout(pFabricLayout);
        pFabricLayout.setHorizontalGroup(
            pFabricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFabricLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pFabricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pFabricLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pFabricLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        pFabricLayout.setVerticalGroup(
            pFabricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFabricLayout.createSequentialGroup()
                .addGroup(pFabricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pFabricLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pFabricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pFabricLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlMain.add(pFabric, "card3");

        pEmployee.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));
        jPanel9.setForeground(new java.awt.Color(0, 0, 102));
        jPanel9.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Employee Details");

        jTextField3.setText("jTextField3");

        jTextField4.setText("jTextField4");

        jLabel9.setText("First Name");

        jLabel10.setText("Last Name");

        jLabel11.setText("NIC");

        jTextField5.setText("jTextField5");

        jLabel12.setText("Contact Number");

        jTextField6.setText("jTextField6");

        jLabel13.setText("Address");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jLabel14.setText("User Name");

        jTextField7.setText("jTextField7");

        jLabel15.setText("Password");

        jPasswordField1.setText("jPasswordField1");

        jLabel23.setText("Conform Password");

        jPasswordField2.setText("jPasswordField2");

        jLabel24.setText("Role");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Admin" }));

        jButton8.setBackground(new java.awt.Color(153, 0, 0));
        jButton8.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Delete");

        jButton9.setBackground(new java.awt.Color(0, 153, 0));
        jButton9.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Register");

        jButton10.setBackground(new java.awt.Color(0, 102, 102));
        jButton10.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Update");

        jButton11.setBackground(new java.awt.Color(0, 51, 102));
        jButton11.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Clear");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField5)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jTextField4)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)
                                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 28, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(31, 31, 31)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "NIC", "Contact", "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable3);

        javax.swing.GroupLayout pEmployeeLayout = new javax.swing.GroupLayout(pEmployee);
        pEmployee.setLayout(pEmployeeLayout);
        pEmployeeLayout.setHorizontalGroup(
            pEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmployeeLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                .addContainerGap())
        );
        pEmployeeLayout.setVerticalGroup(
            pEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmployeeLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlMain.add(pEmployee, "card4");

        pDailyTransfer.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        jLabel25.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jLabel25.setText("Daily Transactions");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Invoice No", "Date", "Cashier", "Total (LKR)", "Cash", "Balance"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fabric", "Meters (M)", "Unit  Price", "Total"
            }
        ));
        jScrollPane6.setViewportView(jTable5);

        jLabel26.setText("Invoice No");

        jTextField13.setText("jTextField13");

        jButton16.setBackground(new java.awt.Color(204, 204, 255));
        jButton16.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton16.setForeground(new java.awt.Color(102, 0, 204));
        jButton16.setText("Find Invoice");

        jButton17.setBackground(new java.awt.Color(0, 102, 0));
        jButton17.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Today");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton17))
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );

        javax.swing.GroupLayout pDailyTransferLayout = new javax.swing.GroupLayout(pDailyTransfer);
        pDailyTransfer.setLayout(pDailyTransferLayout);
        pDailyTransferLayout.setHorizontalGroup(
            pDailyTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pDailyTransferLayout.setVerticalGroup(
            pDailyTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlMain.add(pDailyTransfer, "card5");

        pReports.setBackground(new java.awt.Color(0, 0, 0));

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Employee List", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Low Stock ", jPanel6);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel27.setText("Total Fabric Types :");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, -1));

        jTextField14.setText("jTextField14");
        jPanel3.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, -1, -1));

        jLabel28.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel28.setText("Total Stock Value :");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 120, 30));

        jTextField15.setText("jTextField15");
        jPanel3.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, 300, -1));

        jTabbedPane1.addTab("Available Stock", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Daily Sales", jPanel4);

        javax.swing.GroupLayout pReportsLayout = new javax.swing.GroupLayout(pReports);
        pReports.setLayout(pReportsLayout);
        pReportsLayout.setHorizontalGroup(
            pReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        pReportsLayout.setVerticalGroup(
            pReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pReportsLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlMain.add(pReports, "card6");

        Right.add(pnlMain, java.awt.BorderLayout.CENTER);

        getContentPane().add(Right, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private final java.util.List<Integer> dailyInvoiceIds = new java.util.ArrayList<>();

    
    private JLabel lblDailySummary;

    private void setupExtra() {
           // (1)
        // ----  show who is logged in (top bar is currently ) ----
        pnlHeader.setLayout(new java.awt.BorderLayout());
        JLabel lblSession = new JLabel("  Logged in as: " + Session.getFullName() + "  |   Role: " + Session.getRole());
        lblSession.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        lblSession.setHorizontalAlignment(JLabel.RIGHT);
        pnlHeader.add(lblSession, java.awt.BorderLayout.EAST);

            // (2)
        // ---- give the dropdowns real values instead of placeholder text ----
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Cashier", "Admin"}));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Cotton", "Silk", "Polyester", "Linen", "Denim", "Wool", "Other"}));

            //  (3)
        // ---- wipe the leftover "jTextFieldN" placeholder text from the designer ----
        jTextField1.setText("");    // Fabric search box
        jTextField13.setText("");   // Invoice No search box
        clearFabricForm();
        clearEmployeeForm();

        // ---- wire up every button that had no listener at all -------------
        jButton6.addActionListener(e -> logout());                 // Logout
        jButton8.addActionListener(e -> deleteEmployee());          // Employee: Delete
        jButton9.addActionListener(e -> registerEmployee());        // Employee: Register
        jButton10.addActionListener(e -> updateEmployee());         // Employee: Update
        jButton11.addActionListener(e -> clearEmployeeForm());      // Employee: Clear
        jButton12.addActionListener(e -> addFabric());              // Fabric: Add
        jButton13.addActionListener(e -> updateFabric());           // Fabric: Update
        jButton14.addActionListener(e -> clearFabricForm());        // Fabric: Clear
        jButton15.addActionListener(e -> deleteFabric());           // Fabric: Delete
        jButton16.addActionListener(e -> findInvoiceByNo(jTextField13.getText().trim())); // Find Invoice
        jButton17.addActionListener(e -> loadTodayTransactions());  // Today

        jTable2.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) populateFabricFormFromTable();
        });
        jTable3.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) populateEmployeeFormFromTable();
        });
        jTable4.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) loadSelectedInvoiceItems();
        });
        jTabbedPane1.addChangeListener(e -> refreshAllReports());

       
        setupReportPanels();
        setupExpensesFeature();

        // ---- first-time data load ------------------------------------------
        loadFabricTable(null);
        loadEmployeeTable();
        refreshSalesDashboard();
        loadTodayTransactions();
        refreshAllReports();

        // start on the Sales/billing tab, same as clicking the sidebar button
        jButton1ActionPerformed(null);
    }

    private void setupReportPanels() {

        // 2 total fields - just add the stock table above them.
        jPanel3.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1000, 565));

        // "Employee List" tab (jPanel5) was a blank panel - fill it.
        jPanel5.setLayout(new java.awt.BorderLayout());
        jPanel5.add(new JLabel("  All Registered Employees"), java.awt.BorderLayout.NORTH);
        jPanel5.add(jScrollPane9, java.awt.BorderLayout.CENTER);

        // "Low Stock" tab (jPanel6) was a blank panel - fill it.
        jPanel6.setLayout(new java.awt.BorderLayout());
        jPanel6.add(new JLabel("  Fabrics at or below their Reorder Level"), java.awt.BorderLayout.NORTH);
        jPanel6.add(jScrollPane8, java.awt.BorderLayout.CENTER);

        // "Daily Sales" tab (jPanel4) was a blank panel - fill it.
        jPanel4.setLayout(new java.awt.BorderLayout());
        lblDailySummary = new JLabel("  Total Bills: 0   |   Total Items Sold: 0   |   Total Sales: LKR 0.00");
        lblDailySummary.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 15));
        jPanel4.add(lblDailySummary, java.awt.BorderLayout.NORTH);
        jPanel4.add(jScrollPane10, java.awt.BorderLayout.CENTER);

        // "Profit & Loss" tab - brand new, built entirely in code.
        javax.swing.JPanel pnlProfitLoss = buildProfitLossPanel();
        jTabbedPane1.addTab("Profit & Loss", pnlProfitLoss);

        jPanel3.revalidate();
        jPanel5.revalidate();
        jPanel6.revalidate();
        jPanel4.revalidate();
    }

    private static DefaultTableModel readOnlyModel(Object[][] data, String[] cols) {
        return new DefaultTableModel(data, cols) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
    }

    // ------------------------------------------------------------------
    //  FABRIC / STOCK  (jButton 12 Add, 13 Update, 14 Clear, 15 Delete)
    // ------------------------------------------------------------------

    private void loadFabricTable(String keyword) {
        String sql = "SELECT product_id, name, category, buying_price, selling_price, quantity, reorder_level FROM product";
        if (keyword != null && !keyword.isEmpty()) {
            sql += " WHERE product_id LIKE ? OR name LIKE ?";
        }
        sql += " ORDER BY product_id";

        java.util.List<Object[]> rows = new java.util.ArrayList<>();
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            if (keyword != null && !keyword.isEmpty()) {
                pst.setString(1, "%" + keyword + "%");
                pst.setString(2, "%" + keyword + "%");
            }
            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    rows.add(new Object[]{
                        rs.getString("product_id"), rs.getString("name"), rs.getString("category"),
                        rs.getBigDecimal("buying_price"), rs.getBigDecimal("selling_price"),
                        rs.getBigDecimal("quantity"), rs.getBigDecimal("reorder_level")
                    });
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        jTable2.setModel(readOnlyModel(rows.toArray(new Object[0][]),
                new String[]{"ID", "Name", "Category", "Buy (LKR)", "Sell (LKR)", "Meters", "Recorder"}));
    }

    private void searchFabric(String keyword) {
        loadFabricTable(keyword);
    }

    private void populateFabricFormFromTable() {
        int row = jTable2.getSelectedRow();
        if (row < 0) return;
        selectedProductId = String.valueOf(jTable2.getValueAt(row, 0));
        jTextField8.setText(selectedProductId);
        jTextField9.setText(String.valueOf(jTable2.getValueAt(row, 1)));
        jComboBox2.setSelectedItem(String.valueOf(jTable2.getValueAt(row, 2)));
        jTextField10.setText(String.valueOf(jTable2.getValueAt(row, 3)));
        jTextField11.setText(String.valueOf(jTable2.getValueAt(row, 4)));
        jTextField12.setText(String.valueOf(jTable2.getValueAt(row, 5)));
    }

    private void clearFabricForm() {
        selectedProductId = null;
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTable2.clearSelection();
    }

    private void addFabric() {
        String id = jTextField8.getText().trim();
        String name = jTextField9.getText().trim();
        String category = (String) jComboBox2.getSelectedItem();

        if (id.isEmpty() || name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fabric ID and Name are required.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        BigDecimal buy, sell, qty;
        try {
            buy = new BigDecimal(jTextField10.getText().trim());
            sell = new BigDecimal(jTextField11.getText().trim());
            qty = new BigDecimal(jTextField12.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Buying Price, Selling Price and Available (m) must be numbers.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String sql = "INSERT INTO product (product_id, name, category, buying_price, selling_price, quantity, reorder_level) VALUES (?,?,?,?,?,?,10)";
        try (Connection con = DBConnection.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, id);
            pst.setString(2, name);
            pst.setString(3, category);
            pst.setBigDecimal(4, buy);
            pst.setBigDecimal(5, sell);
            pst.setBigDecimal(6, qty);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Fabric added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            clearFabricForm();
            loadFabricTable(null);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Could not add fabric (is the ID already used?): " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateFabric() {
        if (selectedProductId == null) {
            JOptionPane.showMessageDialog(this, "Select a fabric from the table first.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name = jTextField9.getText().trim();
        String category = (String) jComboBox2.getSelectedItem();
        BigDecimal buy, sell, qty;
        try {
            buy = new BigDecimal(jTextField10.getText().trim());
            sell = new BigDecimal(jTextField11.getText().trim());
            qty = new BigDecimal(jTextField12.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Buying Price, Selling Price and Available (m) must be numbers.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String sql = "UPDATE product SET name=?, category=?, buying_price=?, selling_price=?, quantity=? WHERE product_id=?";
        try (Connection con = DBConnection.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, name);
            pst.setString(2, category);
            pst.setBigDecimal(3, buy);
            pst.setBigDecimal(4, sell);
            pst.setBigDecimal(5, qty);
            pst.setString(6, selectedProductId);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Fabric updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            clearFabricForm();
            loadFabricTable(null);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteFabric() {
        if (selectedProductId == null) {
            JOptionPane.showMessageDialog(this, "Select a fabric from the table first.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Delete fabric \"" + selectedProductId + "\"?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) return;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement("DELETE FROM product WHERE product_id=?")) {
            pst.setString(1, selectedProductId);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Fabric deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);
            clearFabricForm();
            loadFabricTable(null);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Could not delete (it may be used in past invoices): " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // ------------------------------------------------------------------
    //  EMPLOYEES  (jButton 8 Delete, 9 Register, 10 Update, 11 Clear)
    // ------------------------------------------------------------------

    private void loadEmployeeTable() {
        String sql = "SELECT employee_id, CONCAT(first_name,' ',last_name) AS full_name, nic, contact, username, role FROM employee ORDER BY employee_id";
        java.util.List<Object[]> rows = new java.util.ArrayList<>();
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                rows.add(new Object[]{
                    rs.getInt("employee_id"), rs.getString("full_name"), rs.getString("nic"),
                    rs.getString("contact"), rs.getString("username"), rs.getString("role")
                });
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        jTable3.setModel(readOnlyModel(rows.toArray(new Object[0][]),
                new String[]{"ID", "Name", "NIC", "Contact", "User Name", "Role"}));
    }

    private void populateEmployeeFormFromTable() {
        int row = jTable3.getSelectedRow();
        if (row < 0) return;
        selectedEmployeeId = (Integer) jTable3.getValueAt(row, 0);

        // Table doesn't show first/last name separately or the address, so
        // fetch the full record for the selected employee.
        String sql = "SELECT first_name, last_name, nic, contact, address, username, role FROM employee WHERE employee_id=?";
        try (Connection con = DBConnection.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, selectedEmployeeId);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    jTextField3.setText(rs.getString("first_name"));
                    jTextField4.setText(rs.getString("last_name"));
                    jTextField5.setText(rs.getString("nic"));
                    jTextField6.setText(rs.getString("contact"));
                    jTextArea1.setText(rs.getString("address"));
                    jTextField7.setText(rs.getString("username"));
                    jComboBox1.setSelectedItem(rs.getString("role"));
                    jPasswordField1.setText("");
                    jPasswordField2.setText("");
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearEmployeeForm() {
        selectedEmployeeId = null;
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextArea1.setText("");
        jTextField7.setText("");
        jPasswordField1.setText("");
        jPasswordField2.setText("");
        jTable3.clearSelection();
    }

    private void registerEmployee() {
        String firstName = jTextField3.getText().trim();
        String lastName = jTextField4.getText().trim();
        String nic = jTextField5.getText().trim();
        String contact = jTextField6.getText().trim();
        String address = jTextArea1.getText().trim();
        String username = jTextField7.getText().trim();
        String password = new String(jPasswordField1.getPassword());
        String confirmPassword = new String(jPasswordField2.getPassword());
        String role = (String) jComboBox1.getSelectedItem();

        if (firstName.isEmpty() || lastName.isEmpty() || nic.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "First Name, Last Name, NIC, Username and Password are required.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Password and Confirm Password do not match.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try (Connection con = DBConnection.getConnection()) {
            // username must be unique
            try (PreparedStatement check = con.prepareStatement("SELECT employee_id FROM employee WHERE username=?")) {
                check.setString(1, username);
                try (ResultSet rs = check.executeQuery()) {
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(this, "That username is already taken.", "Validation Error", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            }
            String sql = "INSERT INTO employee (first_name, last_name, nic, contact, address, username, password, role) VALUES (?,?,?,?,?,?,?,?)";
            try (PreparedStatement pst = con.prepareStatement(sql)) {
                pst.setString(1, firstName);
                pst.setString(2, lastName);
                pst.setString(3, nic);
                pst.setString(4, contact);
                pst.setString(5, address);
                pst.setString(6, username);
                pst.setString(7, PasswordUtil.hash(password));
                pst.setString(8, role);
                pst.executeUpdate();
            }
            JOptionPane.showMessageDialog(this, "Employee registered successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            clearEmployeeForm();
            loadEmployeeTable();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateEmployee() {
        if (selectedEmployeeId == null) {
            JOptionPane.showMessageDialog(this, "Select an employee from the table first.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String firstName = jTextField3.getText().trim();
        String lastName = jTextField4.getText().trim();
        String nic = jTextField5.getText().trim();
        String contact = jTextField6.getText().trim();
        String address = jTextArea1.getText().trim();
        String username = jTextField7.getText().trim();
        String password = new String(jPasswordField1.getPassword());
        String confirmPassword = new String(jPasswordField2.getPassword());
        String role = (String) jComboBox1.getSelectedItem();

        if (firstName.isEmpty() || lastName.isEmpty() || nic.isEmpty() || username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "First Name, Last Name, NIC and Username are required.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!password.isEmpty() && !password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Password and Confirm Password do not match.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        boolean changePassword = !password.isEmpty();
        String sql = changePassword
                ? "UPDATE employee SET first_name=?, last_name=?, nic=?, contact=?, address=?, username=?, role=?, password=? WHERE employee_id=?"
                : "UPDATE employee SET first_name=?, last_name=?, nic=?, contact=?, address=?, username=?, role=? WHERE employee_id=?";

        try (Connection con = DBConnection.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setString(3, nic);
            pst.setString(4, contact);
            pst.setString(5, address);
            pst.setString(6, username);
            pst.setString(7, role);
            if (changePassword) {
                pst.setString(8, PasswordUtil.hash(password));
                pst.setInt(9, selectedEmployeeId);
            } else {
                pst.setInt(8, selectedEmployeeId);
            }
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Employee updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            clearEmployeeForm();
            loadEmployeeTable();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteEmployee() {
        if (selectedEmployeeId == null) {
            JOptionPane.showMessageDialog(this, "Select an employee from the table first.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (selectedEmployeeId == Session.getEmployeeId()) {
            JOptionPane.showMessageDialog(this, "You can't delete the account you're currently logged in with.", "Not Allowed", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Delete this employee?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) return;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement("DELETE FROM employee WHERE employee_id=?")) {
            pst.setInt(1, selectedEmployeeId);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Employee deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);
            clearEmployeeForm();
            loadEmployeeTable();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Could not delete (they may have past invoices): " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // ------------------------------------------------------------------
    //  SALES DASHBOARD  (the "Sales/billing" tab on the sidebar)
    // ------------------------------------------------------------------

    private void refreshSalesDashboard() {
        try (Connection con = DBConnection.getConnection()) {
            try (PreparedStatement pst = con.prepareStatement(
                    "SELECT COUNT(*) cnt, COALESCE(SUM(total),0) amt FROM invoice WHERE invoice_date = CURDATE()");
                 ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    jLabel7.setText(String.valueOf(rs.getInt("cnt")));
                    jLabel5.setText("LKR " + rs.getBigDecimal("amt").setScale(2, RoundingMode.HALF_UP));
                }
            }

            java.util.List<Object[]> rows = new java.util.ArrayList<>();
            String sql = "SELECT p.name, i.invoice_time FROM invoice_item ii "
                    + "JOIN invoice i ON ii.invoice_id = i.invoice_id "
                    + "JOIN product p ON ii.product_id = p.product_id "
                    + "WHERE i.invoice_date = CURDATE() ORDER BY i.invoice_id DESC, ii.id DESC LIMIT 15";
            try (PreparedStatement pst = con.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {
                int no = 1;
                while (rs.next()) {
                    rows.add(new Object[]{no++, rs.getString("name"), rs.getString("invoice_time")});
                }
            }
            jTable1.setModel(readOnlyModel(rows.toArray(new Object[0][]), new String[]{"No", "Item", "Time"}));

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // ------------------------------------------------------------------
    //  DAILY TRANSACTIONS  (jButton 16 Find Invoice, jButton17 Today)
    // ------------------------------------------------------------------

    private void loadTodayTransactions() {
        loadInvoiceList("WHERE invoice_date = CURDATE()", null);
    }

    private void findInvoiceByNo(String invoiceNo) {
        if (invoiceNo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Type an invoice number to search for.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        loadInvoiceList("WHERE invoice_no = ?", invoiceNo);
    }

    private void loadInvoiceList(String whereClause, String param) {
        String sql = "SELECT i.invoice_id, i.invoice_no, i.invoice_date, "
                + "CONCAT(e.first_name,' ',e.last_name) AS cashier, i.total, i.cash, i.balance "
                + "FROM invoice i LEFT JOIN employee e ON i.employee_id = e.employee_id "
                + whereClause + " ORDER BY i.invoice_id DESC";

        java.util.List<Object[]> rows = new java.util.ArrayList<>();
        dailyInvoiceIds.clear();
        try (Connection con = DBConnection.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
            if (param != null) pst.setString(1, param);
            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    dailyInvoiceIds.add(rs.getInt("invoice_id"));
                    rows.add(new Object[]{
                        rs.getString("invoice_no"), rs.getDate("invoice_date"), rs.getString("cashier"),
                        rs.getBigDecimal("total"), rs.getBigDecimal("cash"), rs.getBigDecimal("balance")
                    });
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        jTable4.setModel(readOnlyModel(rows.toArray(new Object[0][]),
                new String[]{"Invoice No", "Date", "Cashier", "Total (LKR)", "Cash", "Balance"}));
        jTable5.setModel(readOnlyModel(new Object[0][], new String[]{"Fabric", "Meters (M)", "Unit  Price", "Total"}));
    }

    private void loadSelectedInvoiceItems() {
        int row = jTable4.getSelectedRow();
        if (row < 0 || row >= dailyInvoiceIds.size()) return;
        int invoiceId = dailyInvoiceIds.get(row);

        String sql = "SELECT p.name, ii.qty, ii.unit_price, ii.total FROM invoice_item ii "
                + "JOIN product p ON ii.product_id = p.product_id WHERE ii.invoice_id = ?";
        java.util.List<Object[]> rows = new java.util.ArrayList<>();
        try (Connection con = DBConnection.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, invoiceId);
            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    rows.add(new Object[]{rs.getString("name"), rs.getBigDecimal("qty"), rs.getBigDecimal("unit_price"), rs.getBigDecimal("total")});
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        jTable5.setModel(readOnlyModel(rows.toArray(new Object[0][]), new String[]{"Fabric", "Meters (M)", "Unit  Price", "Total"}));
    }

    // ------------------------------------------------------------------
    //  REPORTS TAB  (4 sub-tabs inside jTabbedPane1)
    // ------------------------------------------------------------------

    private void refreshAllReports() {
        refreshAvailableStockReport();
        refreshLowStockReport();
        refreshEmployeeReport();
        refreshDailySalesReport();
        refreshProfitLoss();
    }

    private void refreshAvailableStockReport() {
        java.util.List<Object[]> rows = new java.util.ArrayList<>();
        BigDecimal totalValue = BigDecimal.ZERO;
        int typeCount = 0;
        String sql = "SELECT product_id, name, category, quantity, selling_price, buying_price FROM product ORDER BY product_id";
        try (Connection con = DBConnection.getConnection(); PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                BigDecimal qty = rs.getBigDecimal("quantity");
                BigDecimal buy = rs.getBigDecimal("buying_price");
                BigDecimal value = qty.multiply(buy);
                totalValue = totalValue.add(value);
                typeCount++;
                rows.add(new Object[]{
                    rs.getString("product_id"), rs.getString("name"), rs.getString("category"),
                    qty, rs.getBigDecimal("selling_price"), buy, value.setScale(2, RoundingMode.HALF_UP)
                });
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        jTable6.setModel(readOnlyModel(rows.toArray(new Object[0][]),
                new String[]{"ID", "Name", "Category", "Available (m)", "Sell Price", "Buy Price", "Stock Value"}));
        jTextField14.setText(String.valueOf(typeCount));
        jTextField15.setText("LKR " + totalValue.setScale(2, RoundingMode.HALF_UP));
    }

    private void refreshLowStockReport() {
        java.util.List<Object[]> rows = new java.util.ArrayList<>();
        String sql = "SELECT product_id, name, category, quantity FROM product WHERE quantity <= reorder_level ORDER BY quantity ASC";
        try (Connection con = DBConnection.getConnection(); PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                rows.add(new Object[]{rs.getString("product_id"), rs.getString("name"), rs.getString("category"), rs.getBigDecimal("quantity")});
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        jTable7.setModel(readOnlyModel(rows.toArray(new Object[0][]), new String[]{"Fabric ID", "Name", "Category", "Current (M)"}));
    }

    private void refreshEmployeeReport() {
        java.util.List<Object[]> rows = new java.util.ArrayList<>();
        String sql = "SELECT employee_id, CONCAT(first_name,' ',last_name) full_name, nic, contact, username, role FROM employee ORDER BY employee_id";
        try (Connection con = DBConnection.getConnection(); PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                rows.add(new Object[]{
                    rs.getInt("employee_id"), rs.getString("full_name"), rs.getString("nic"),
                    rs.getString("contact"), rs.getString("username"), rs.getString("role")
                });
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        jTable8.setModel(readOnlyModel(rows.toArray(new Object[0][]), new String[]{"ID", "Full Name", "NIC", "Contact", "User Name", "Role"}));
    }

    private void refreshDailySalesReport() {
        int totalBills = 0;
        BigDecimal totalAmount = BigDecimal.ZERO;
        BigDecimal totalItems = BigDecimal.ZERO;
        java.util.List<Object[]> rows = new java.util.ArrayList<>();

        try (Connection con = DBConnection.getConnection()) {
            try (PreparedStatement pst = con.prepareStatement(
                    "SELECT COUNT(*) cnt, COALESCE(SUM(total),0) amt FROM invoice WHERE invoice_date = CURDATE()");
                 ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    totalBills = rs.getInt("cnt");
                    totalAmount = rs.getBigDecimal("amt");
                }
            }
            try (PreparedStatement pst = con.prepareStatement(
                    "SELECT COALESCE(SUM(ii.qty),0) qty FROM invoice_item ii JOIN invoice i ON ii.invoice_id=i.invoice_id WHERE i.invoice_date = CURDATE()");
                 ResultSet rs = pst.executeQuery()) {
                if (rs.next()) totalItems = rs.getBigDecimal("qty");
            }
            String sql = "SELECT i.invoice_no, i.invoice_time, CONCAT(e.first_name,' ',e.last_name) cashier, i.total, i.cash, i.balance "
                    + "FROM invoice i LEFT JOIN employee e ON i.employee_id=e.employee_id WHERE i.invoice_date = CURDATE() ORDER BY i.invoice_id DESC";
            try (PreparedStatement pst = con.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    rows.add(new Object[]{
                        rs.getString("invoice_no"), rs.getString("invoice_time"), rs.getString("cashier"),
                        rs.getBigDecimal("total"), rs.getBigDecimal("cash"), rs.getBigDecimal("balance")
                    });
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        jTable9.setModel(readOnlyModel(rows.toArray(new Object[0][]),
                new String[]{"Invoice No", "Time", "Cashier", "Total (LKR)", "Cash (LKR)", "Balance (LKR)"}));
        if (lblDailySummary != null) {
            lblDailySummary.setText("  Total Bills: " + totalBills + "   |   Total Items Sold: " + totalItems
                    + "   |   Total Sales: LKR " + totalAmount.setScale(2, RoundingMode.HALF_UP));
        }
    }

    // ------------------------------------------------------------------
    //  EXPENSES  (Daily Expenses panel, added to the sidebar)
    // ------------------------------------------------------------------

    private void setupExpensesFeature() {
        jButton18 = new javax.swing.JButton();
        pExpenses = new javax.swing.JPanel();

        // ---- sidebar button, styled the same way as the other 5 ----
        jButton18.setBackground(new java.awt.Color(0, 0, 0));
        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Expenses");
        jButton18.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 40, 1, 1));
        jButton18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton18.addActionListener(this::jButton18ActionPerformed);
        pnlButtons.add(jButton18);
        pnlButtons.revalidate();
        pnlButtons.repaint();

        // ---- the panel itself ----
        buildExpensesPanel();
        pnlMain.add(pExpenses, "card7");
    }

    private void buildExpensesPanel() {
        pExpenses.setBackground(new java.awt.Color(255, 255, 255));
        pExpenses.setLayout(new java.awt.BorderLayout());

        JLabel title = new JLabel("  Daily Expenses");
        title.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 18));
        title.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 0, 10, 0));
        pExpenses.add(title, java.awt.BorderLayout.NORTH);

        // ---- left: entry form ----
        javax.swing.JPanel form = new javax.swing.JPanel(new java.awt.GridBagLayout());
        form.setBackground(new java.awt.Color(102, 102, 102));
        form.setPreferredSize(new java.awt.Dimension(280, 0));
        form.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        java.awt.GridBagConstraints gc = new java.awt.GridBagConstraints();
        gc.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gc.insets = new java.awt.Insets(4, 0, 4, 0);
        gc.gridx = 0;

        JLabel lblFormTitle = new JLabel("Expense Details");
        lblFormTitle.setForeground(java.awt.Color.WHITE);
        lblFormTitle.setFont(new java.awt.Font("Helvetica Neue", java.awt.Font.BOLD, 18));
        gc.gridy = 0; form.add(lblFormTitle, gc);

        JLabel lblCat = new JLabel("Category");
        lblCat.setForeground(new java.awt.Color(204, 204, 204));
        gc.gridy = 1; form.add(lblCat, gc);

        cmbExpenseCategory = new javax.swing.JComboBox<>(new String[]{
            "Light Bill", "Rent", "Transport", "Refreshments", "Salaries", "Maintenance", "Other"
        });
        cmbExpenseCategory.setEditable(true);
        gc.gridy = 2; form.add(cmbExpenseCategory, gc);

        JLabel lblAmt = new JLabel("Amount (LKR)");
        lblAmt.setForeground(new java.awt.Color(204, 204, 204));
        gc.gridy = 3; form.add(lblAmt, gc);

        txtExpenseAmount = new javax.swing.JTextField();
        gc.gridy = 4; form.add(txtExpenseAmount, gc);

        JLabel lblDate = new JLabel("Date (yyyy-MM-dd)");
        lblDate.setForeground(new java.awt.Color(204, 204, 204));
        gc.gridy = 5; form.add(lblDate, gc);

        txtExpenseDate = new javax.swing.JTextField(java.time.LocalDate.now().toString());
        gc.gridy = 6; form.add(txtExpenseDate, gc);

        JLabel lblDesc = new JLabel("Description / Note");
        lblDesc.setForeground(new java.awt.Color(204, 204, 204));
        gc.gridy = 7; form.add(lblDesc, gc);

        txtExpenseDesc = new javax.swing.JTextArea(4, 15);
        JScrollPane descScroll = new JScrollPane(txtExpenseDesc);
        gc.gridy = 8; form.add(descScroll, gc);

        javax.swing.JButton btnAdd = new javax.swing.JButton("Add");
        btnAdd.setBackground(new java.awt.Color(0, 153, 51));
        btnAdd.setForeground(java.awt.Color.WHITE);
        btnAdd.addActionListener(e -> addExpenseRecord());
        gc.gridy = 9; form.add(btnAdd, gc);

        javax.swing.JButton btnUpdate = new javax.swing.JButton("Update");
        btnUpdate.setBackground(new java.awt.Color(204, 204, 0));
        btnUpdate.setForeground(java.awt.Color.WHITE);
        btnUpdate.addActionListener(e -> updateExpenseRecord());
        gc.gridy = 10; form.add(btnUpdate, gc);

        javax.swing.JButton btnDelete = new javax.swing.JButton("Delete");
        btnDelete.setBackground(new java.awt.Color(153, 0, 0));
        btnDelete.setForeground(java.awt.Color.WHITE);
        btnDelete.addActionListener(e -> deleteExpenseRecord());
        gc.gridy = 11; form.add(btnDelete, gc);

        javax.swing.JButton btnClear = new javax.swing.JButton("Clear");
        btnClear.setBackground(new java.awt.Color(204, 204, 255));
        btnClear.setForeground(new java.awt.Color(102, 102, 255));
        btnClear.addActionListener(e -> clearExpenseForm());
        gc.gridy = 12; form.add(btnClear, gc);

        pExpenses.add(form, java.awt.BorderLayout.WEST);

        // ---- right: filter bar + table ----
        javax.swing.JPanel right = new javax.swing.JPanel(new java.awt.BorderLayout());
        right.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 10, 10));

        javax.swing.JPanel filterBar = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        javax.swing.JTextField txtFrom = new javax.swing.JTextField(10);
        javax.swing.JTextField txtTo = new javax.swing.JTextField(10);
        txtFrom.setText(java.time.LocalDate.now().withDayOfMonth(1).toString());
        txtTo.setText(java.time.LocalDate.now().toString());
        javax.swing.JButton btnFilter = new javax.swing.JButton("Filter");
        javax.swing.JButton btnToday = new javax.swing.JButton("Today");
        javax.swing.JButton btnAll = new javax.swing.JButton("Show All");
        btnFilter.addActionListener(e -> loadExpenseTable(txtFrom.getText().trim(), txtTo.getText().trim()));
        btnToday.addActionListener(e -> {
            String today = java.time.LocalDate.now().toString();
            txtFrom.setText(today);
            txtTo.setText(today);
            loadExpenseTable(today, today);
        });
        btnAll.addActionListener(e -> loadExpenseTable(null, null));
        filterBar.add(new JLabel("From:"));
        filterBar.add(txtFrom);
        filterBar.add(new JLabel("To:"));
        filterBar.add(txtTo);
        filterBar.add(btnFilter);
        filterBar.add(btnToday);
        filterBar.add(btnAll);
        right.add(filterBar, java.awt.BorderLayout.NORTH);

        tblExpenses = new javax.swing.JTable();
        JScrollPane tableScroll = new JScrollPane(tblExpenses);
        right.add(tableScroll, java.awt.BorderLayout.CENTER);

        lblExpenseTotal = new JLabel("  Total: LKR 0.00");
        lblExpenseTotal.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        right.add(lblExpenseTotal, java.awt.BorderLayout.SOUTH);

        pExpenses.add(right, java.awt.BorderLayout.CENTER);

        tblExpenses.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) populateExpenseFormFromTable();
        });
    }

    private void loadExpenseTable(String fromDate, String toDate) {
        String sql = "SELECT expense_id, expense_date, category, amount, description FROM expense";
        boolean hasRange = fromDate != null && !fromDate.isEmpty() && toDate != null && !toDate.isEmpty();
        if (hasRange) {
            sql += " WHERE expense_date BETWEEN ? AND ?";
        }
        sql += " ORDER BY expense_date DESC, expense_id DESC";

        java.util.List<Object[]> rows = new java.util.ArrayList<>();
        expenseIds.clear();
        BigDecimal total = BigDecimal.ZERO;
        try (Connection con = DBConnection.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
            if (hasRange) {
                pst.setString(1, fromDate);
                pst.setString(2, toDate);
            }
            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    expenseIds.add(rs.getInt("expense_id"));
                    BigDecimal amt = rs.getBigDecimal("amount");
                    total = total.add(amt);
                    rows.add(new Object[]{
                        rs.getDate("expense_date"), rs.getString("category"), amt, rs.getString("description")
                    });
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage()
                    + "\n\nNote: this needs an \"expense\" table - see the updated ransalu_db.sql.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        tblExpenses.setModel(readOnlyModel(rows.toArray(new Object[0][]),
                new String[]{"Date", "Category", "Amount (LKR)", "Description"}));
        lblExpenseTotal.setText("  Total: LKR " + total.setScale(2, RoundingMode.HALF_UP));
    }

    private void populateExpenseFormFromTable() {
        int row = tblExpenses.getSelectedRow();
        if (row < 0 || row >= expenseIds.size()) return;
        selectedExpenseId = expenseIds.get(row);
        cmbExpenseCategory.getEditor().setItem(String.valueOf(tblExpenses.getValueAt(row, 1)));
        txtExpenseAmount.setText(String.valueOf(tblExpenses.getValueAt(row, 2)));
        txtExpenseDate.setText(String.valueOf(tblExpenses.getValueAt(row, 0)));
        Object desc = tblExpenses.getValueAt(row, 3);
        txtExpenseDesc.setText(desc == null ? "" : desc.toString());
    }

    private void clearExpenseForm() {
        selectedExpenseId = null;
        cmbExpenseCategory.getEditor().setItem("Light Bill");
        txtExpenseAmount.setText("");
        txtExpenseDate.setText(java.time.LocalDate.now().toString());
        txtExpenseDesc.setText("");
        tblExpenses.clearSelection();
    }

    private void addExpenseRecord() {
        String category = String.valueOf(cmbExpenseCategory.getEditor().getItem()).trim();
        String dateStr = txtExpenseDate.getText().trim();
        String description = txtExpenseDesc.getText().trim();

        if (category.isEmpty() || dateStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Category and Date are required.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        BigDecimal amount;
        java.sql.Date sqlDate;
        try {
            amount = new BigDecimal(txtExpenseAmount.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Amount must be a number.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            sqlDate = java.sql.Date.valueOf(dateStr);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Date must be in yyyy-MM-dd format.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String sql = "INSERT INTO expense (category, amount, expense_date, description, employee_id) VALUES (?,?,?,?,?)";
        try (Connection con = DBConnection.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, category);
            pst.setBigDecimal(2, amount);
            pst.setDate(3, sqlDate);
            pst.setString(4, description);
            pst.setInt(5, Session.getEmployeeId());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Expense added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            clearExpenseForm();
            loadExpenseTable(null, null);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateExpenseRecord() {
        if (selectedExpenseId == null) {
            JOptionPane.showMessageDialog(this, "Select an expense from the table first.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String category = String.valueOf(cmbExpenseCategory.getEditor().getItem()).trim();
        String dateStr = txtExpenseDate.getText().trim();
        String description = txtExpenseDesc.getText().trim();

        BigDecimal amount;
        java.sql.Date sqlDate;
        try {
            amount = new BigDecimal(txtExpenseAmount.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Amount must be a number.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            sqlDate = java.sql.Date.valueOf(dateStr);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Date must be in yyyy-MM-dd format.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String sql = "UPDATE expense SET category=?, amount=?, expense_date=?, description=? WHERE expense_id=?";
        try (Connection con = DBConnection.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, category);
            pst.setBigDecimal(2, amount);
            pst.setDate(3, sqlDate);
            pst.setString(4, description);
            pst.setInt(5, selectedExpenseId);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Expense updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            clearExpenseForm();
            loadExpenseTable(null, null);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteExpenseRecord() {
        if (selectedExpenseId == null) {
            JOptionPane.showMessageDialog(this, "Select an expense from the table first.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Delete this expense?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) return;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement("DELETE FROM expense WHERE expense_id=?")) {
            pst.setInt(1, selectedExpenseId);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Expense deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);
            clearExpenseForm();
            loadExpenseTable(null, null);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    //  PROFIT & LOSS  *****

    private javax.swing.JPanel buildProfitLossPanel() {
        javax.swing.JPanel panel = new javax.swing.JPanel(new java.awt.BorderLayout());
        panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.JPanel filterBar = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        filterBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 0, 10));
        txtPLFrom = new javax.swing.JTextField(10);
        txtPLTo = new javax.swing.JTextField(10);
        txtPLFrom.setText(java.time.LocalDate.now().toString());
        txtPLTo.setText(java.time.LocalDate.now().toString());

        javax.swing.JButton btnToday = new javax.swing.JButton("Today");
        javax.swing.JButton btnThisMonth = new javax.swing.JButton("This Month");
        javax.swing.JButton btnCalc = new javax.swing.JButton("Calculate");
        btnCalc.setBackground(new java.awt.Color(51, 0, 102));
        btnCalc.setForeground(java.awt.Color.WHITE);

        btnToday.addActionListener(e -> {
            String today = java.time.LocalDate.now().toString();
            txtPLFrom.setText(today);
            txtPLTo.setText(today);
            refreshProfitLoss();
        });
        btnThisMonth.addActionListener(e -> {
            txtPLFrom.setText(java.time.LocalDate.now().withDayOfMonth(1).toString());
            txtPLTo.setText(java.time.LocalDate.now().toString());
            refreshProfitLoss();
        });
        btnCalc.addActionListener(e -> refreshProfitLoss());

        filterBar.add(new JLabel("From (yyyy-MM-dd):"));
        filterBar.add(txtPLFrom);
        filterBar.add(new JLabel("To (yyyy-MM-dd):"));
        filterBar.add(txtPLTo);
        filterBar.add(btnToday);
        filterBar.add(btnThisMonth);
        filterBar.add(btnCalc);
        panel.add(filterBar, java.awt.BorderLayout.NORTH);

        javax.swing.JPanel summary = new javax.swing.JPanel(new java.awt.GridLayout(4, 2, 10, 14));
        summary.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 60, 30, 60));
        summary.setBackground(new java.awt.Color(255, 255, 255));

        java.awt.Font labelFont = new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 16);
        java.awt.Font valueFont = new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 16);

        JLabel l1 = new JLabel("Total Revenue (Sales)");
        l1.setFont(labelFont);
        lblPLRevenue = new JLabel("LKR 0.00");
        lblPLRevenue.setFont(valueFont);
        lblPLRevenue.setForeground(new java.awt.Color(0, 102, 0));

        JLabel l2 = new JLabel("Cost of Goods Sold");
        l2.setFont(labelFont);
        lblPLCogs = new JLabel("LKR 0.00");
        lblPLCogs.setFont(valueFont);

        JLabel l3 = new JLabel("Daily Expenses");
        l3.setFont(labelFont);
        lblPLExpenses = new JLabel("LKR 0.00");
        lblPLExpenses.setFont(valueFont);

        JLabel l4 = new JLabel("Net Profit / Loss");
        l4.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 18));
        lblPLNet = new JLabel("LKR 0.00");
        lblPLNet.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 18));

        summary.add(l1); summary.add(lblPLRevenue);
        summary.add(l2); summary.add(lblPLCogs);
        summary.add(l3); summary.add(lblPLExpenses);
        summary.add(l4); summary.add(lblPLNet);

        panel.add(summary, java.awt.BorderLayout.CENTER);
        return panel;
    }

    private void refreshProfitLoss() {
        if (txtPLFrom == null || txtPLTo == null) return;
        String from = txtPLFrom.getText().trim();
        String to = txtPLTo.getText().trim();
        java.sql.Date fromDate, toDate;
        try {
            fromDate = java.sql.Date.valueOf(from);
            toDate = java.sql.Date.valueOf(to);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Dates must be in yyyy-MM-dd format.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        BigDecimal revenue = BigDecimal.ZERO;
        BigDecimal cogs = BigDecimal.ZERO;
        BigDecimal expenses = BigDecimal.ZERO;

        try (Connection con = DBConnection.getConnection()) {
            try (PreparedStatement pst = con.prepareStatement(
                    "SELECT COALESCE(SUM(total),0) amt FROM invoice WHERE invoice_date BETWEEN ? AND ?")) {
                pst.setDate(1, fromDate);
                pst.setDate(2, toDate);
                try (ResultSet rs = pst.executeQuery()) {
                    if (rs.next()) revenue = rs.getBigDecimal("amt");
                }
            }
            // COGS uses the product's current buying price, since the sale price at time
            // of purchase isn't stored on the invoice line item - this is an approximation.
            try (PreparedStatement pst = con.prepareStatement(
                    "SELECT COALESCE(SUM(ii.qty * p.buying_price),0) cost FROM invoice_item ii "
                    + "JOIN invoice i ON ii.invoice_id = i.invoice_id "
                    + "JOIN product p ON ii.product_id = p.product_id "
                    + "WHERE i.invoice_date BETWEEN ? AND ?")) {
                pst.setDate(1, fromDate);
                pst.setDate(2, toDate);
                try (ResultSet rs = pst.executeQuery()) {
                    if (rs.next()) cogs = rs.getBigDecimal("cost");
                }
            }
            try (PreparedStatement pst = con.prepareStatement(
                    "SELECT COALESCE(SUM(amount),0) amt FROM expense WHERE expense_date BETWEEN ? AND ?")) {
                pst.setDate(1, fromDate);
                pst.setDate(2, toDate);
                try (ResultSet rs = pst.executeQuery()) {
                    if (rs.next()) expenses = rs.getBigDecimal("amt");
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage()
                    + "\n\nNote: this needs an \"expense\" table - see the updated ransalu_db.sql.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        BigDecimal totalExpenses = cogs.add(expenses);
        BigDecimal net = revenue.subtract(totalExpenses);

        lblPLRevenue.setText("LKR " + revenue.setScale(2, RoundingMode.HALF_UP));
        lblPLCogs.setText("LKR " + cogs.setScale(2, RoundingMode.HALF_UP));
        lblPLExpenses.setText("LKR " + expenses.setScale(2, RoundingMode.HALF_UP));
        lblPLNet.setText((net.signum() < 0 ? "- LKR " : "LKR ") + net.abs().setScale(2, RoundingMode.HALF_UP)
                + (net.signum() < 0 ? "  (Loss)" : "  (Profit)"));
        lblPLNet.setForeground(net.signum() < 0 ? new java.awt.Color(153, 0, 0) : new java.awt.Color(0, 102, 0));
    }

    //  LOGOUT
   
    private void logout() {
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Confirm Logout", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            Session.clear();
            this.dispose();
            new Login().setVisible(true);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pSales.setVisible(true);
        pFabric.setVisible(false);
        pDailyTransfer.setVisible(false);
        pReports.setVisible(false);
        pEmployee.setVisible(false);
        if (pExpenses != null) pExpenses.setVisible(false);
        refreshSalesDashboard();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pSales.setVisible(false);
        pFabric.setVisible(true);
        pDailyTransfer.setVisible(false);
        pReports.setVisible(false);
        pEmployee.setVisible(false);
        if (pExpenses != null) pExpenses.setVisible(false);
        loadFabricTable(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        pSales.setVisible(false);
        pFabric.setVisible(false);
        pDailyTransfer.setVisible(false);
        pReports.setVisible(false);
        pEmployee.setVisible(true);
        if (pExpenses != null) pExpenses.setVisible(false);
        loadEmployeeTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        pSales.setVisible(false);
        pFabric.setVisible(false);
        pDailyTransfer.setVisible(true);
        pReports.setVisible(false);
        pEmployee.setVisible(false);
        if (pExpenses != null) pExpenses.setVisible(false);
        loadTodayTransactions();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        pSales.setVisible(false);
        pFabric.setVisible(false);
        pDailyTransfer.setVisible(false);
        pReports.setVisible(true);
        pEmployee.setVisible(false);
        if (pExpenses != null) pExpenses.setVisible(false);
        refreshAllReports();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
        pSales.setVisible(false);
        pFabric.setVisible(false);
        pDailyTransfer.setVisible(false);
        pReports.setVisible(false);
        pEmployee.setVisible(false);
        pExpenses.setVisible(true);
        loadExpenseTable(null, null);
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        searchFabric(jTextField1.getText().trim());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        searchFabric(jTextField1.getText().trim());
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            com.formdev.flatlaf.FlatLightLaf.setup();
//            com.formdev.flatlaf.FlatDarkLaf.setup();

        } catch (Exception ex) {
            ex.printStackTrace();
            System.err.println("Failed to initialize LaF");
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel pDailyTransfer;
    private javax.swing.JPanel pEmployee;
    private javax.swing.JPanel pFabric;
    private javax.swing.JPanel pReports;
    private javax.swing.JPanel pSales;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlLogout;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables
}
