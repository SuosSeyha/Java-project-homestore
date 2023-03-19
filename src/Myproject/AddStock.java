package Myproject;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class AddStock extends javax.swing.JFrame {
    private ConnectionDB db = new ConnectionDB();
    private DefaultTableModel model;
    public AddStock() {
        initComponents();
        getStockproduct();
    }
    private void getStockproduct(){
        int no=0;
        db.fetchStock();
        model = (DefaultTableModel) tbtable.getModel();
        model.setRowCount(0);
        for(var i=0;i<StockProduct.liststockproduct.size();i++){
            Object row[]={
                ++no,
                StockProduct.liststockproduct.get(i).getCode(),
                StockProduct.liststockproduct.get(i).getName(),
                StockProduct.liststockproduct.get(i).getPrice()+"$",
                StockProduct.liststockproduct.get(i).getImage(),
            };
            model.addRow(row);
        }
        StockProduct.liststockproduct.clear();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        txtcode = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        lbimage = new javax.swing.JLabel();
        btnimage = new javax.swing.JButton();
        txtimage = new javax.swing.JTextField();
        btnremove = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1410, 515));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(null);

        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback);
        btnback.setBounds(20, 30, 90, 30);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Stock");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 10, 1410, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1410, 90);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(null);

        tbtable.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        tbtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Code", "Name", "Price", "Image"
            }
        ));
        tbtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbtable);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 620, 230);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Code :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(680, 90, 120, 40);

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(680, 140, 120, 40);

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(680, 190, 120, 40);

        txtprice.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jPanel2.add(txtprice);
        txtprice.setBounds(770, 190, 250, 40);

        txtcode.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jPanel2.add(txtcode);
        txtcode.setBounds(770, 90, 250, 40);

        txtname.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jPanel2.add(txtname);
        txtname.setBounds(770, 140, 250, 40);

        lbimage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(lbimage);
        lbimage.setBounds(1030, 90, 140, 140);

        btnimage.setText("Image");
        btnimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimageActionPerformed(evt);
            }
        });
        jPanel2.add(btnimage);
        btnimage.setBounds(1180, 170, 63, 28);
        jPanel2.add(txtimage);
        txtimage.setBounds(1180, 200, 170, 30);

        btnremove.setBackground(new java.awt.Color(0, 204, 204));
        btnremove.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnremove.setText("Remove");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        jPanel2.add(btnremove);
        btnremove.setBounds(460, 300, 180, 40);

        btnadd.setBackground(new java.awt.Color(0, 204, 204));
        btnadd.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel2.add(btnadd);
        btnadd.setBounds(20, 300, 180, 40);

        btnupdate.setBackground(new java.awt.Color(0, 204, 204));
        btnupdate.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnupdate);
        btnupdate.setBounds(240, 300, 180, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 90, 1410, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        Homestore.main(null);
        dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void Clear(){
        txtcode.setText(null);
        txtname.setText(null);
        txtprice.setText(null);
        txtimage.setText(null);
        lbimage.setIcon(null);
    }
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        int code = Integer.parseInt(txtcode.getText());
        String name = txtname.getText();
        double price = Double.parseDouble(txtprice.getText());
        String image = txtimage.getText();
        db.addStock(new StockProduct(code,name,price,image));
        getStockproduct();
        Clear();
    }//GEN-LAST:event_btnaddActionPerformed
    private ImageIcon resizeImage(String imagePath,byte[] pic){
        ImageIcon myImage;
        if(imagePath!=null){
            myImage = new ImageIcon(imagePath);
        }else{
            myImage = new ImageIcon(pic);
        }
        Image img = myImage.getImage();
        Image img1 =img.getScaledInstance(lbimage.getWidth(), lbimage.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img1);
         return image;
    }
    private void btnimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimageActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        txtimage.setText(filename);
        lbimage.setIcon(resizeImage(filename, null));
    }//GEN-LAST:event_btnimageActionPerformed

    private void tbtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtableMouseClicked
        int row = tbtable.getSelectedRow();
        txtcode.setText(tbtable.getValueAt(row, 1).toString());
        txtname.setText(tbtable.getValueAt(row, 2).toString());
        String price = tbtable.getValueAt(row, 3).toString();
        price=price.replace("$", "");
        txtprice.setText(price);
        txtimage.setText(tbtable.getValueAt(row, 4).toString());
        lbimage.setIcon(resizeImage(tbtable.getValueAt(row, 4).toString(), null));
    }//GEN-LAST:event_tbtableMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Do you want to update?","UPDATE STOCK",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            int code = Integer.parseInt(txtcode.getText());
            String name = txtname.getText();
            double price = Double.parseDouble(txtprice.getText());
            String image = txtimage.getText();
            db.Update(new StockProduct(code, name, price, image));
            getStockproduct();
            Clear();
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Do you want to remove?","REMOVE STOCK",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            int code = Integer.parseInt(txtcode.getText());
            db.removeStock(code);
            getStockproduct();
            Clear();
        }
    }//GEN-LAST:event_btnremoveActionPerformed

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
            java.util.logging.Logger.getLogger(AddStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnimage;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbimage;
    private javax.swing.JTable tbtable;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtimage;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
