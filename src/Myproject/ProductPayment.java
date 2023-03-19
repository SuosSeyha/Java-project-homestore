package Myproject;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
public class ProductPayment extends javax.swing.JDialog {
    private double total,payment,cash_received,cash_return,discount;
    private DecimalFormat df  = new DecimalFormat("####0.00$");
    private GetMessage message  = new GetMessage();
    private ConnectionDB db = new ConnectionDB();
    public ProductPayment(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
     public ProductPayment(java.awt.Frame parent, boolean modal,double total) {
        super(parent, modal);
        initComponents();
        this.total=total;
        this.payment=total;
        txtpayment.setText(df.format(payment));
        txttotal.setText(df.format(total));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcash_return = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        txtpayment = new javax.swing.JTextField();
        txtcash_received = new javax.swing.JTextField();
        cbdiscount = new javax.swing.JComboBox<>();
        btncash = new javax.swing.JButton();
        btnpayment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1171, 479));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRODUCT PAYMENT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 122, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1290, 100);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Total :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 145, 155, 37);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Payment :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 252, 155, 37);

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setText("Discount :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 200, 155, 37);

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setText("Cash Received :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 307, 155, 37);

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("Cash Return :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 356, 155, 37);

        txtcash_return.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jPanel1.add(txtcash_return);
        txtcash_return.setBounds(230, 360, 315, 37);

        txttotal.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jPanel1.add(txttotal);
        txttotal.setBounds(237, 144, 315, 37);

        txtpayment.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jPanel1.add(txtpayment);
        txtpayment.setBounds(230, 250, 315, 37);

        txtcash_received.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtcash_received.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcash_receivedKeyReleased(evt);
            }
        });
        jPanel1.add(txtcash_received);
        txtcash_received.setBounds(230, 300, 315, 37);

        cbdiscount.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        cbdiscount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "5%", "10%", "15%", "20%", "25%", "30%", "35%", "40%", "45%", "50%" }));
        cbdiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdiscountActionPerformed(evt);
            }
        });
        jPanel1.add(cbdiscount);
        cbdiscount.setBounds(233, 200, 315, 40);

        btncash.setBackground(new java.awt.Color(0, 153, 153));
        btncash.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btncash.setText("Cash");
        btncash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncashActionPerformed(evt);
            }
        });
        jPanel1.add(btncash);
        btncash.setBounds(610, 190, 280, 43);

        btnpayment.setBackground(new java.awt.Color(0, 153, 153));
        btnpayment.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnpayment.setText("Payment");
        btnpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpaymentActionPerformed(evt);
            }
        });
        jPanel1.add(btnpayment);
        btnpayment.setBounds(610, 300, 280, 43);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1170, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbdiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdiscountActionPerformed
       String sdiscount = cbdiscount.getSelectedItem().toString();
       sdiscount=sdiscount.replace("%", "");
       discount = Double.parseDouble(sdiscount);
       payment = total-(total*discount)/100;
       txtpayment.setText(df.format(payment));
    }//GEN-LAST:event_cbdiscountActionPerformed

    private void txtcash_receivedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcash_receivedKeyReleased
//        String scash_received = txtcash_received.getText(); // 2
//        scash_received=scash_received.replace("$", "");
//        txtcash_received.setText(scash_received+"$");  
    }//GEN-LAST:event_txtcash_receivedKeyReleased

    private void btncashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncashActionPerformed
        cash_received = Double.parseDouble(txtcash_received.getText());
        cash_return = cash_received-payment;
        txtcash_received.setText(df.format(cash_received));
        txtcash_return.setText(df.format(cash_return));
        if(cash_return<0){
            message.getError("Your cash received is not enough...!");
        }
    }//GEN-LAST:event_btncashActionPerformed
    private Collection data(){
        ArrayList<ProductBuy> listTemp = new ArrayList<>();
        db.fetchProductBuy();
        for(ProductBuy temp : ProductBuy.listproductbuy){
            int code = temp.getCode();
            String name = temp.getName();
            double price = temp.getPrice();
            int qty = temp.getQty();
            double amount = temp.getAmount();
            listTemp.add(new ProductBuy(code, name, price, qty, amount));
        }
        ProductBuy.listproductbuy.clear();
        return listTemp;
    }
    private void btnpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpaymentActionPerformed
        try {
            JasperReport jp = JasperCompileManager.compileReport("report/homestore.jrxml");
            HashMap pr = new HashMap();
            pr.put("total", total);
            pr.put("discount", discount/100);
            pr.put("payment", payment);
            pr.put("cash_received", cash_received);
            pr.put("cash_return", cash_return);
            JRBeanCollectionDataSource jcd = new JRBeanCollectionDataSource(data());
            JasperPrint price = JasperFillManager.fillReport(jp, pr,jcd);
           JasperViewer.viewReport(price,false);
           
            //JasperPrintManager.printReport(price, true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnpaymentActionPerformed

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
            java.util.logging.Logger.getLogger(ProductPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProductPayment dialog = new ProductPayment(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncash;
    private javax.swing.JButton btnpayment;
    private javax.swing.JComboBox<String> cbdiscount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtcash_received;
    private javax.swing.JTextField txtcash_return;
    private javax.swing.JTextField txtpayment;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
