package Myproject;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
public class Homestore extends javax.swing.JFrame {
    public Homestore() {
        initComponents();
        lbimage.setIcon(resizeImage("D:\\Java Programming\\Image\\Restauarant Image\\Food.jpg", null));
    }
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsale = new necesario.MaterialButton();
        btnsignout = new necesario.MaterialButton();
        materialButton3 = new necesario.MaterialButton();
        lbimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1092, 448));
        setUndecorated(true);
        getContentPane().setLayout(null);

        btnsale.setBackground(new java.awt.Color(0, 153, 153));
        btnsale.setForeground(new java.awt.Color(255, 255, 255));
        btnsale.setText("Sale");
        btnsale.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnsale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsaleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsaleMouseExited(evt);
            }
        });
        btnsale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaleActionPerformed(evt);
            }
        });
        getContentPane().add(btnsale);
        btnsale.setBounds(780, 80, 220, 40);

        btnsignout.setBackground(new java.awt.Color(0, 153, 153));
        btnsignout.setForeground(new java.awt.Color(255, 255, 255));
        btnsignout.setText("SIGN OUT");
        btnsignout.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnsignout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnsignout);
        btnsignout.setBounds(780, 260, 220, 40);

        materialButton3.setBackground(new java.awt.Color(0, 153, 153));
        materialButton3.setForeground(new java.awt.Color(255, 255, 255));
        materialButton3.setText("STOCK");
        materialButton3.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        materialButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(materialButton3);
        materialButton3.setBounds(780, 170, 220, 40);
        getContentPane().add(lbimage);
        lbimage.setBounds(0, 0, 1100, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaleMouseEntered
        btnsale.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnsaleMouseEntered

    private void btnsaleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaleMouseExited
        // TODO add your handling code here: //[0,153,153]
        btnsale.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_btnsaleMouseExited

    private void btnsignoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignoutActionPerformed
        Sigin.main(null);
        dispose();
    }//GEN-LAST:event_btnsignoutActionPerformed

    private void materialButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton3ActionPerformed
        AddStock.main(null);
        dispose();
    }//GEN-LAST:event_materialButton3ActionPerformed

    private void btnsaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaleActionPerformed
        ProductSale.main(null);
        dispose();
    }//GEN-LAST:event_btnsaleActionPerformed

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
            java.util.logging.Logger.getLogger(Homestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homestore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private necesario.MaterialButton btnsale;
    private necesario.MaterialButton btnsignout;
    private javax.swing.JLabel lbimage;
    private necesario.MaterialButton materialButton3;
    // End of variables declaration//GEN-END:variables
}
