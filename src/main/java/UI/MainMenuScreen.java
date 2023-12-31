package UI;

import Backend.ProductManager;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author aidanm
 */
public class MainMenuScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuScreen
     */
    public MainMenuScreen() {
        initComponents();

        try {
            ArrayList<String> itemNames = ProductManager.getItemNames();
            DefaultListModel model = new DefaultListModel();
            model.addAll(itemNames);
            ActionsListProductScreen.setModel(model);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Product file not found");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ActionsListProductScreen = new javax.swing.JList<>();
        BrandProductOutputText = new javax.swing.JTextField();
        ProductBrandLabel = new javax.swing.JLabel();
        ProductTypeOutputText = new javax.swing.JTextField();
        ProductCostOutputText = new javax.swing.JTextField();
        ProductStorageOutputText = new javax.swing.JTextField();
        ProductTypeLabel = new javax.swing.JLabel();
        ProductCostLabel = new javax.swing.JLabel();
        ProductStorageLocationLabel = new javax.swing.JLabel();
        ProductPreviewImage = new javax.swing.JLabel();
        FilterLabel = new javax.swing.JLabel();
        ProductTypeFilter = new javax.swing.JComboBox<>();
        ProductBrandFilter = new javax.swing.JComboBox<>();
        ProductsHeadingProductScreen = new javax.swing.JLabel();
        ProductCostFilter = new javax.swing.JComboBox<>();
        ProductStorageLocationFilter = new javax.swing.JComboBox<>();
        ListOfProductsLabel = new javax.swing.JLabel();
        AddProductButton = new javax.swing.JButton();
        EditProductsButton = new javax.swing.JButton();
        ManageStockButton = new javax.swing.JButton();
        ProductTotalStockLabel = new javax.swing.JLabel();
        ProductTotalStockTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ActionsListProductScreen.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ActionsListProductScreenValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(ActionsListProductScreen);

        BrandProductOutputText.setEditable(false);

        ProductBrandLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ProductBrandLabel.setForeground(new java.awt.Color(255, 0, 0));
        ProductBrandLabel.setText("Brand:");

        ProductTypeOutputText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductTypeOutputTextActionPerformed(evt);
            }
        });

        ProductStorageOutputText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductStorageOutputTextActionPerformed(evt);
            }
        });

        ProductTypeLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ProductTypeLabel.setForeground(new java.awt.Color(255, 0, 0));
        ProductTypeLabel.setText("Type: ");

        ProductCostLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ProductCostLabel.setForeground(new java.awt.Color(255, 0, 0));
        ProductCostLabel.setText("Cost:");

        ProductStorageLocationLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ProductStorageLocationLabel.setForeground(new java.awt.Color(255, 0, 0));
        ProductStorageLocationLabel.setText("Storage Location:");

        ProductPreviewImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProductPreviewImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        FilterLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        FilterLabel.setText("Filter:");

        ProductTypeFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Product Type" }));
        ProductTypeFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductTypeFilterActionPerformed(evt);
            }
        });

        ProductBrandFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Product Brand" }));

        ProductsHeadingProductScreen.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        ProductsHeadingProductScreen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProductsHeadingProductScreen.setText("Products:");

        ProductCostFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Product Cost" }));

        ProductStorageLocationFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Product Storage Location" }));

        ListOfProductsLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ListOfProductsLabel.setText("List of Products:");

        AddProductButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AddProductButton.setText("Add Product");

        EditProductsButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        EditProductsButton.setText("Edit Product");

        ManageStockButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ManageStockButton.setText("Manage Stock");

        ProductTotalStockLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ProductTotalStockLabel.setForeground(new java.awt.Color(255, 0, 0));
        ProductTotalStockLabel.setText("Total Stock:");

        ProductTotalStockTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductTotalStockTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(ProductsHeadingProductScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ListOfProductsLabel))
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProductBrandLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ProductStorageLocationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ProductCostLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ProductTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ProductTotalStockLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(AddProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BrandProductOutputText, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                .addComponent(ProductTypeOutputText)
                                .addComponent(ProductCostOutputText)
                                .addComponent(ProductStorageOutputText)
                                .addComponent(ProductTotalStockTextField))
                            .addComponent(EditProductsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(FilterLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(ProductTypeFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ProductBrandFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ProductCostFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ProductStorageLocationFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProductPreviewImage, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ProductsHeadingProductScreen)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FilterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProductTypeFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProductBrandFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProductCostFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProductStorageLocationFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BrandProductOutputText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProductBrandLabel))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ProductTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProductTypeOutputText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ProductCostLabel)
                                    .addComponent(ProductCostOutputText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ProductStorageOutputText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProductStorageLocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ProductTotalStockLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProductTotalStockTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(ProductPreviewImage, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ListOfProductsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditProductsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 394, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductTypeFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductTypeFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductTypeFilterActionPerformed

    private void ProductStorageOutputTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductStorageOutputTextActionPerformed
       String location = ProductManager.getLocation(selectedItemName); 
            ProductStorageOutputText.setText(location);
    }//GEN-LAST:event_ProductStorageOutputTextActionPerformed

    private void ProductTypeOutputTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductTypeOutputTextActionPerformed
         String type = ProductManager.getType();
            ProductTypeOutputText.setText(type);
        
    }//GEN-LAST:event_ProductTypeOutputTextActionPerformed

    private void ProductTotalStockTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductTotalStockTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductTotalStockTextFieldActionPerformed

    private void ActionsListProductScreenValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ActionsListProductScreenValueChanged
        try {
            //here
            String selectedItemName =  ActionsListProductScreen.getSelectedValue();
            
            String brandName = ProductManager.getBrand(selectedItemName);
            BrandProductOutputText.setText(brandName);
            
            String type = ProductManager.getType();
            ProductTypeOutputText.setText(brandName);

            int cost = ProductManager.getCost(selectedItemName); 
            ProductCostOutputText.setText(cost); 
            
            String location = ProductManager.getLocation(selectedItemName); 
            ProductStorageOutputText.setText(location);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Could not find product file");
        }
        
        
    }//GEN-LAST:event_ActionsListProductScreenValueChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ActionsListProductScreen;
    private javax.swing.JButton AddProductButton;
    private javax.swing.JTextField BrandProductOutputText;
    private javax.swing.JButton EditProductsButton;
    private javax.swing.JLabel FilterLabel;
    private javax.swing.JLabel ListOfProductsLabel;
    private javax.swing.JButton ManageStockButton;
    private javax.swing.JComboBox<String> ProductBrandFilter;
    private javax.swing.JLabel ProductBrandLabel;
    private javax.swing.JComboBox<String> ProductCostFilter;
    private javax.swing.JLabel ProductCostLabel;
    private javax.swing.JTextField ProductCostOutputText;
    private javax.swing.JLabel ProductPreviewImage;
    private javax.swing.JComboBox<String> ProductStorageLocationFilter;
    private javax.swing.JLabel ProductStorageLocationLabel;
    private javax.swing.JTextField ProductStorageOutputText;
    private javax.swing.JLabel ProductTotalStockLabel;
    private javax.swing.JTextField ProductTotalStockTextField;
    private javax.swing.JComboBox<String> ProductTypeFilter;
    private javax.swing.JLabel ProductTypeLabel;
    private javax.swing.JTextField ProductTypeOutputText;
    private javax.swing.JLabel ProductsHeadingProductScreen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
