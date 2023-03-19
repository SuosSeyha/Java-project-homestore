package Myproject;
import java.awt.Image;
import javax.swing.ImageIcon;
public class ProductModel extends javax.swing.JPanel {
    private ConnectionDB db = new ConnectionDB();
     private ImageIcon resizeImage(String imagePath,byte[] pic){
        ImageIcon myImage;
        if(imagePath!=null){
            myImage = new ImageIcon(imagePath);
        }else{
            myImage = new ImageIcon(pic);
        }
        Image img = myImage.getImage();
        Image img1 =img.getScaledInstance(173, 118,Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img1);
         return image;
    }
    public void setCode(int code) {
        this.code = code;
        lbcode.setText(lbcode.getText()+String.valueOf(code));
    }
    public void setName(String name) {
        this.name = name;
        lbname.setText(lbname.getText()+name);
    }
    public void setImage(String image) {
        this.image = image;
        lbimage.setIcon(resizeImage(image, null));
    }
    public void setPrice(double price) {
        this.price = price;
        lbprice.setText(lbprice.getText()+String.valueOf(price)+"$");
    }
    private int code,qty=0;
    private String name,image;
    private double price;
    public ProductModel() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbimage = new javax.swing.JLabel();
        lbcode = new javax.swing.JLabel();
        lbname = new javax.swing.JLabel();
        lbprice = new javax.swing.JLabel();
        btnbuy = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbimage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbcode.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        lbcode.setForeground(new java.awt.Color(255, 255, 255));
        lbcode.setText("Code :");

        lbname.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        lbname.setForeground(new java.awt.Color(255, 255, 255));
        lbname.setText("Name :");

        lbprice.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        lbprice.setForeground(new java.awt.Color(255, 255, 255));
        lbprice.setText("Price :");

        btnbuy.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        btnbuy.setForeground(new java.awt.Color(0, 102, 102));
        btnbuy.setText("BUY");
        btnbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbimage, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbcode, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbname, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbprice, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbimage, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbcode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lbname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lbprice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuyActionPerformed
        qty++;
        btnbuy.setText("Buy("+qty+")");
        if(qty==1){ // Insert
            db.InsertProductBuy(new ProductBuy(code, name, price, qty, price));
        }
        if(qty>1){ // Update
            db.UpdateProductBuy(new ProductBuy(code, name, price, qty, price*qty));
        }
        
    }//GEN-LAST:event_btnbuyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuy;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbcode;
    private javax.swing.JLabel lbimage;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbprice;
    // End of variables declaration//GEN-END:variables
}
