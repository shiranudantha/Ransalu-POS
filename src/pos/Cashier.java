
package pos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class Cashier extends javax.swing.JPanel {

// price + available stock of the product currently shown in the
    // ID/Name/Price fields, filled in by lookupProduct()
    private BigDecimal currentUnitPrice = null;
    private BigDecimal currentAvailableQty = null;

    private JTextArea billPreviewArea;

    /**
     * Creates new form Cashier
     */
    
    public Cashier() {
        initComponents();
        setupExtra();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonLogout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jTextField6.addActionListener(this::jTextField6ActionPerformed);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("Add Iteam to Bill");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setText("ID");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setText("Name");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setText("Price");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel8.setText("Qty");

        jTable1.setBackground(new java.awt.Color(248, 249, 250));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producr ID", "Name", "Unite Price", "Qty", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(29, 29, 29)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(79, 79, 79)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(130, 130, 130)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Print Bill");

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");

        jButtonRemove.setBackground(new java.awt.Color(255, 0, 0));
        jButtonRemove.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButtonRemove.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemove.setText("Remove Iteam");
        jButtonRemove.setName("Remove Iteam"); // NOI18N
        jButtonRemove.addActionListener(this::jButtonRemoveActionPerformed);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Total");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Cash");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("Balance");

        jButtonLogout.setBackground(new java.awt.Color(153, 0, 0));
        jButtonLogout.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButtonLogout.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogout.setText("Logout");
        jButtonLogout.addActionListener(this::jButtonLogoutActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButtonRemove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addGap(73, 73, 73))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
     
    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // Price field is auto-filled / read-only, nothing to do here.
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRemoveActionPerformed

  

    private void setupExtra() {
       // 1. Bill Preview Area එක jPanel3 ekata danna 
        billPreviewArea = new JTextArea();
        billPreviewArea.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 11));
        billPreviewArea.setEditable(false);
        
        // JTextArea එක wate  BorderLayout එකක් damma
        jPanel3.setLayout(new java.awt.BorderLayout());
        jPanel3.add(new javax.swing.JScrollPane(billPreviewArea), java.awt.BorderLayout.CENTER);

        // Placeholder Text ain karanna
        jTextField1.setText("0.00");   // Total
        jTextField2.setText("");       // Cash
        jTextField3.setText("0.00");   // Balance
        jTextField4.setText("");       // Product ID
        jTextField5.setText("");       // Name
        jTextField6.setText("");       // Price
        jTextField7.setText("");       // Qty

        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField1.setEditable(false);
        jTextField3.setEditable(false);

        jTable1.setModel(emptyCartModel());

        // Table eke Row ekak Click karama e Row eke values ID/Name/Price/Qty
        // TextFields walata dynamic widihata set wenna listener ekak.
        jTable1.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                populateFieldsFromSelectedRow();
            }
        });

        // ID eken Enter click krama search wenna
        jTextField4.addActionListener(e -> lookupProduct());
        
        
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                lookupProduct();
            }
        });

        // Qty click karala  Enterclick karama Cart එකට add wenna
        jTextField7.addActionListener(e -> addItemToCart());
        
        jButtonLogout.addActionListener(e -> {
         // 1. Cashier window close karanna
         this.dispose(); 
    
        // 2. Login window open karanna (aluth ekak)
         new Login().setVisible(true); 
         });

        // Cash field එක ටයිප් කරන කොටම Live විදිහට Balance එක සහ Preview එක වෙනස් වීමට Listener එකක්
        jTextField2.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) { calculate(); }
            public void removeUpdate(javax.swing.event.DocumentEvent e) { calculate(); }
            public void changedUpdate(javax.swing.event.DocumentEvent e) { calculate(); }
        });
        jButtonRemove.addActionListener(e -> removeItemFromCart());
        jButtonRemove.addActionListener(e -> calculate());   // Calculate
        jButton2.addActionListener(e -> clearAll());     // Clear
        jButton1.addActionListener(e -> printBill());    // Print Bill

        jTextField4.requestFocusInWindow();
        updatePreview(); // bill eke preview eka enter karanna kalin
    }

    private DefaultTableModel emptyCartModel() {
        return new DefaultTableModel(new Object[0][], new String[]{"Producr ID", "Name", "Unite Price", "Qty", "Total"}) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
    }
    private void lookupProduct() {
      String id = jTextField4.getText().trim();
        if (id.isEmpty()) {
            return;
        }
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement("SELECT name, selling_price, quantity FROM product WHERE product_id=?")) {
            pst.setString(1, id);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    jTextField5.setText(rs.getString("name"));
                    currentUnitPrice = rs.getBigDecimal("selling_price");
                    currentAvailableQty = rs.getBigDecimal("quantity");
                    jTextField6.setText(currentUnitPrice.setScale(2, RoundingMode.HALF_UP).toString());
                    jTextField7.requestFocusInWindow();
                } else {
                    //  
                    if (jTextField4.isFocusOwner() || true) {
                        JOptionPane.showMessageDialog(this, "No fabric found with ID \"" + id + "\".", "Not Found", JOptionPane.WARNING_MESSAGE);
                        jTextField5.setText("");
                        jTextField6.setText("");
                        currentUnitPrice = null;
                        currentAvailableQty = null;
                        jTextField4.requestFocusInWindow();
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addItemToCart() {


    String id = jTextField4.getText().trim();
    if (id.isEmpty() || currentUnitPrice == null) {
        JOptionPane.showMessageDialog(this, "Enter a valid Product ID first and press Enter to look it up.", "Validation Error", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    BigDecimal qty;
    try {
        qty = new BigDecimal(jTextField7.getText().trim());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Qty must be a number.", "Validation Error", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    if (qty.compareTo(BigDecimal.ZERO) <= 0) {
        JOptionPane.showMessageDialog(this, "Qty must be greater than 0.", "Validation Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
    // 1. Cart එකේ මේ Item එක දැනටමත් තියෙනවද බලනවා
    int existingRow = -1;
    for (int i = 0; i < model.getRowCount(); i++) {
        String cartItemId = String.valueOf(model.getValueAt(i, 0));
        if (cartItemId.equalsIgnoreCase(id)) {
            existingRow = i;
            break;
        }
    }

    // 2. Stock Check කිරීම (අලුත් Qty එක Stock එකට වඩා වැඩියිද බලනවා)
    if (currentAvailableQty != null && qty.compareTo(currentAvailableQty) > 0) {
        JOptionPane.showMessageDialog(this, "Only " + currentAvailableQty + " m available in stock.", "Insufficient Stock", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // 3. කලින් තිබ්බ එක නම් Replace/Update කරනවා, නැත්නම් New Row එකක් Add කරනවා
    if (existingRow != -1) {
        // තිබුණු Qty එක සම්පූර්ණයෙන්ම අලුත් Qty එකෙන් REPLACE කරනවා (එකතු කරන්නේ නැත)
        BigDecimal newRowTotal = currentUnitPrice.multiply(qty).setScale(2, RoundingMode.HALF_UP);
        
        model.setValueAt(qty, existingRow, 3);         // Qty එක Replace වෙනවා
        model.setValueAt(newRowTotal, existingRow, 4); // Total එක Replace වෙනවා
    } else {
        // Cart එකේ නැති අලුත් Item එකක් නම් අලුතෙන් Add කරනවා
        BigDecimal lineTotal = currentUnitPrice.multiply(qty).setScale(2, RoundingMode.HALF_UP);
        model.addRow(new Object[]{id, jTextField5.getText(), currentUnitPrice.setScale(2, RoundingMode.HALF_UP), qty, lineTotal});
    }

    // Text fields clear කරමු
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField6.setText("");
    jTextField7.setText("");
    currentUnitPrice = null;
    currentAvailableQty = null;
    jTable1.clearSelection();
    jTextField4.requestFocusInWindow();

    // Total Update කරමු
    calculate();
}
    private void populateFieldsFromSelectedRow() {
        int row = jTable1.getSelectedRow();
        if (row < 0) {
            return; // eka wath row ekak select karala nathnam mokuth karanna epa
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String id = String.valueOf(model.getValueAt(row, 0));
        String name = String.valueOf(model.getValueAt(row, 1));
        BigDecimal price = (BigDecimal) model.getValueAt(row, 2);
        BigDecimal qty = (BigDecimal) model.getValueAt(row, 3);

        jTextField4.setText(id);
        jTextField5.setText(name);
        jTextField6.setText(price.setScale(2, RoundingMode.HALF_UP).toString());
        jTextField7.setText(qty.toPlainString());

        // Meka dan cart eke thiyena item ekak nisa, aye stock check ekak wenna epa,
        // namuth "Add" ekata thiyena price eka nam record karagena inna one.
        currentUnitPrice = price;
        currentAvailableQty = null;
    }

    private void removeItemFromCart() {
        int selectedRow = jTable1.getSelectedRow();
    
        // Row එකක් select karala nathnm alert එකක් denna
        if (selectedRow == -1) {
         JOptionPane.showMessageDialog(this, "Please select an item from the table to remove.", "No Item Selected", JOptionPane.WARNING_MESSAGE);
            return;
     }
    
     // Select karapu Row eka table eken ain karanna
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         model.removeRow(selectedRow);

    // Row eka ain unama, uda fields tika ithuru wela thiyena values walin clear karanna
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField6.setText("");
    jTextField7.setText("");
    currentUnitPrice = null;
    currentAvailableQty = null;
    
    // (Total) and Preview penna
    calculate();
}
    
    private void calculate() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        BigDecimal total = BigDecimal.ZERO;
        for (int i = 0; i < model.getRowCount(); i++) {
            total = total.add((BigDecimal) model.getValueAt(i, 4));
        }
        jTextField1.setText(total.setScale(2, RoundingMode.HALF_UP).toString());

        BigDecimal cash = BigDecimal.ZERO;
        try {
            String cashText = jTextField2.getText().trim();
            if (!cashText.isEmpty()) {
                cash = new BigDecimal(cashText);
            }
        } catch (NumberFormatException ex) {
            
        }
        
        BigDecimal balance = cash.subtract(total).setScale(2, RoundingMode.HALF_UP);
        jTextField3.setText(balance.toString());
        jTextField3.setForeground(balance.compareTo(BigDecimal.ZERO) < 0 ? java.awt.Color.RED : new java.awt.Color(0, 130, 0));

        //  live preview eka update karanna
        updatePreview();
    }

    private void clearAll() {
      jTable1.setModel(emptyCartModel());
        jTextField1.setText("0.00");
        jTextField2.setText("");
        jTextField3.setText("0.00");
        jTextField3.setForeground(java.awt.Color.BLACK);
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        currentUnitPrice = null;
        currentAvailableQty = null;
        jTextField4.requestFocusInWindow();
        updatePreview();
    }

    private void printBill() {
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "The cart is empty - add at least one item before printing.", "Nothing to Bill", JOptionPane.WARNING_MESSAGE);
            return;
        }
        calculate();

        BigDecimal total = new BigDecimal(jTextField1.getText());
        BigDecimal cash;
        try {
            cash = new BigDecimal(jTextField2.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter the Cash received before printing the bill.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (cash.compareTo(total) < 0) {
            JOptionPane.showMessageDialog(this, "Cash received is less than the Total.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        BigDecimal balance = cash.subtract(total).setScale(2, RoundingMode.HALF_UP);

        String invoiceNo = "INV" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

        try (Connection con = DBConnection.getConnection()) {
            con.setAutoCommit(false);
            int invoiceId;

            try (PreparedStatement pst = con.prepareStatement(
                    "INSERT INTO invoice (invoice_no, invoice_date, invoice_time, employee_id, total, cash, balance) "
                            + "VALUES (?, CURDATE(), CURTIME(), ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS)) {
                pst.setString(1, invoiceNo);
                pst.setInt(2, Session.getEmployeeId());
                pst.setBigDecimal(3, total);
                pst.setBigDecimal(4, cash);
                pst.setBigDecimal(5, balance);
                pst.executeUpdate();
                try (ResultSet keys = pst.getGeneratedKeys()) {
                    keys.next();
                    invoiceId = keys.getInt(1);
                }
            }

            try (PreparedStatement itemPst = con.prepareStatement(
                    "INSERT INTO invoice_item (invoice_id, product_id, qty, unit_price, total) VALUES (?,?,?,?,?)");
                 PreparedStatement stockPst = con.prepareStatement(
                    "UPDATE product SET quantity = quantity - ? WHERE product_id = ?")) {

                for (int i = 0; i < model.getRowCount(); i++) {
                    String productId = (String) model.getValueAt(i, 0);
                    BigDecimal qty = (BigDecimal) model.getValueAt(i, 3);
                    BigDecimal unitPrice = (BigDecimal) model.getValueAt(i, 2);
                    BigDecimal lineTotal = (BigDecimal) model.getValueAt(i, 4);

                    itemPst.setInt(1, invoiceId);
                    itemPst.setString(2, productId);
                    itemPst.setBigDecimal(3, qty);
                    itemPst.setBigDecimal(4, unitPrice);
                    itemPst.setBigDecimal(5, lineTotal);
                    itemPst.executeUpdate();

                    stockPst.setBigDecimal(1, qty);
                    stockPst.setString(2, productId);
                    stockPst.executeUpdate();
                }
            }

            con.commit();
            
            // danata  preview eka  print karanna 
            try {
                billPreviewArea.print();
            } catch (java.awt.print.PrinterException ex) {
                JOptionPane.showMessageDialog(this, "Bill saved, but printing failed: " + ex.getMessage(), "Printer Error", JOptionPane.WARNING_MESSAGE);
            }
            
            JOptionPane.showMessageDialog(this, "Bill saved as " + invoiceNo + ".", "Success", JOptionPane.INFORMATION_MESSAGE);
            clearAll();

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Could not save the bill: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /** Builds a plain-text receipt and sends it to the printer (or print-to-PDF). */
    //private void printReceipt(String invoiceNo, DefaultTableModel model, BigDecimal total, BigDecimal cash, BigDecimal balance) {
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

    private void updatePreview() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        StringBuilder sb = new StringBuilder();
        sb.append("         RANSALU CLOTHING STORE \n");
        sb.append("------------------------------------------\n");
        sb.append("Date/Time  : ").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())).append('\n');
        sb.append("Cashier    : ").append(Session.getFullName() != null ? Session.getFullName() : "Active Cashier").append('\n');
        sb.append("------------------------------------------\n");
        sb.append(String.format("%-12s %6s %8s %10s%n", "Item", "Qty", "Price", "Amount"));
        sb.append("------------------------------------------\n");
        
        for (int i = 0; i < model.getRowCount(); i++) {
            sb.append(String.format("%-12s %6s %8s %10s%n",
                    model.getValueAt(i, 1), model.getValueAt(i, 3), model.getValueAt(i, 2), model.getValueAt(i, 4)));
        }
        
        sb.append("------------------------------------------\n");
        sb.append(String.format("%-20s %18s%n", "Total", jTextField1.getText()));
        sb.append(String.format("%-20s %18s%n", "Cash", jTextField2.getText().trim().isEmpty() ? "0.00" : jTextField2.getText().trim()));
        sb.append(String.format("%-20s %18s%n", "Balance", jTextField3.getText()));
        sb.append("------------------------------------------\n");
        sb.append("           Thank You! Visit Again \n");

        billPreviewArea.setText(sb.toString());
    
    }

    private void dispose() {
        
    }
}
