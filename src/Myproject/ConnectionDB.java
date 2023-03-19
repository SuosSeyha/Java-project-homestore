package Myproject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
public class ConnectionDB {
 
    public GetMessage message = new GetMessage();
    public PreparedStatement ps;
    public ResultSet r;
    String sql;
    private boolean Issignin=false;
    public boolean isIssignin() {
        return Issignin;
    }
    //================ Sign in and Sign up ================
    // 1.create method connection 
    public Connection conection(){
        Connection con = null;
        try {
            String databaseName="homestore11-1";
            String url="jdbc:mysql://localhost:3306/"+databaseName;
            String username="root";
            String password="";
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url,username,password);
            System.out.println(" Conection successful....");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
        return con;
    }
    // 2.create method UserRegister
    public void UserReigster(User user){
        FetchUser();
        boolean Ischeck=true;
        for(int i=0;i<User.listUser.size();i++){
            if(User.listUser.get(i).getEmail().equals(user.getEmail())){
                Ischeck=false;
            }
        }
        if(Ischeck){
            //email,password,confirm password isEmpty
            if(user.getEmail().isEmpty() || user.getPassword().isEmpty() || user.getConfirmPasword().isEmpty()){
                message.getError("Error...! Please enter your information...!");
            }else{
                //password equal confirm password->Register
                if(user.getPassword().equals(user.getConfirmPasword())){
                    try {
                        sql="INSERT INTO tbusersignin(email,password) VALUES(?,?)";
                        ps=conection().prepareStatement(sql);
                        ps.setString(1, user.getEmail());
                        ps.setString(2, user.getPassword());
                        int index = ps.executeUpdate();
                        if(index>0){
                            message.getSuccess("Account created...");
                        }else{
                            message.getError("Error! Register account...!");
                        }
                    } catch (Exception e) {
                        message.getError(e);
                    }
                }else{
                //password not equal confirm password 
                    message.getError("Confirm password not correct...!");
                }
            }
        }else{
            message.getError("Error...! email already have....!");
        }
        // create listUser
        User.listUser.clear();
    }
    // 3.create method FetchUser
    public void FetchUser(){
        try {
            sql="SELECT * FROM tbusersignin";
            ps=conection().prepareStatement(sql);
            r=ps.executeQuery();
            while(r.next()){
                User.listUser.add(new User(r.getString(1), r.getString(2)));
            }
        } catch (Exception e) {
            message.getError(e);
        }
    }
    // 4.create method UserSignin
    public void UserSignin(User user){
        FetchUser();
        boolean Isemail=false;
        boolean Ispassword=false;
        for(int i=0;i<User.listUser.size();i++){
            if(User.listUser.get(i).getEmail().equals(user.getEmail())){
                Isemail=true;
            }
            if(User.listUser.get(i).getPassword().equals(user.getPassword())){
                Ispassword=true;
            }
        }
        // email,password isEmpty
        if(user.getEmail().isEmpty() || user.getPassword().isEmpty()){
            message.getError("Error! Please enter your information...!");
        }else{
        // email worng,password right
            if(Isemail==false && Ispassword==true){
                message.getError("Email is not correct...!");
            }
            // email rigth,password worng
            if(Isemail==true && Ispassword==false){
                message.getError("Password is not correct...!");
            }
            // email worng, password worng
            if(Isemail==false && Ispassword==false){
                message.getError("Email and Password is not correct...!");
            }
            // email and password right
            if(Isemail==true && Ispassword==true){
                Issignin=true;
                message.getSuccess("Welcome to use sigin...");
                Homestore.main(null);
            }
        } 
        // create listUser
        User.listUser.clear();
    } 
    //======================== Stock =============================
    // 1.create method fetchStock
    public void fetchStock(){
        try {
            sql="SELECT * FROM tbstockproduct";
            ps=conection().prepareStatement(sql);
            r=ps.executeQuery();
            while(r.next()){
                StockProduct.liststockproduct.add(new StockProduct(
                        r.getInt(1),
                        r.getString(2),
                        r.getDouble(3),
                        r.getString(4)
                ));
            }
        } catch (Exception e) {
            message.getError(e);
        }
    }
    // 2.create method addStock
    public void addStock(StockProduct product){
        try {
            sql="INSERT INTO tbstockproduct(code,name,price,image) VALUES(?,?,?,?)";
            ps=conection().prepareStatement(sql);
            ps.setInt(1, product.getCode());
            ps.setString(2, product.getName());
            ps.setDouble(3, product.getPrice());
            ps.setString(4,product.getImage());
            int index = ps.executeUpdate();
            if(index>0){
                message.getSuccess("Product added to stock...");
            }else{
              message.getError("Error add product to stock...!");
            }
        } catch (Exception e) {
            message.getError(e);
        }
    }
    // 3.create method updateStock
    public void Update(StockProduct product){
        try {
            sql="UPDATE tbstockproduct SET name=?,price=?,image=? WHERE code=?";
            ps=conection().prepareStatement(sql);
            ps.setString(1, product.getName());
            ps.setDouble(2, product.getPrice());
            ps.setString(3,product.getImage());
            ps.setInt(4, product.getCode());
            int index = ps.executeUpdate();
            if(index>0){
                message.getSuccess("Product updated in stock...");
            }else{
              message.getError("Error update product in stock...!");
            }
        } catch (Exception e) {
            message.getError(e);
        }
    }
    // 4. create method removeStock
    public void removeStock(int code){
        try {
            sql="DELETE FROM tbstockproduct WHERE code=?";
            ps=conection().prepareStatement(sql);
            ps.setInt(1, code);
            int index = ps.executeUpdate();
            if(index>0){
                message.getSuccess("Product removed in stock...");
            }else{
              message.getError("Error remove  product in stock...!");
            }
        } catch (Exception e) {
             message.getError(e);
        }
    }
    //===================== Product Buy ======================
    // create method InsertProductBuy
    public void InsertProductBuy(ProductBuy product){
        try {
            sql="INSERT INTO tbproductorder(code,name,price,qty,amount) VALUES(?,?,?,?,?)";
            ps=conection().prepareStatement(sql);
            ps.setInt(1, product.getCode());
            ps.setString(2, product.getName());
            ps.setDouble(3, product.getPrice());
            ps.setInt(4, product.getQty());
            ps.setDouble(5, product.getAmount());
            ps.executeUpdate();
        } catch (Exception e) {
            message.getError(e);
        }
    }
    // create method UpdateProductBuy
    public void UpdateProductBuy(ProductBuy product){
        try {
            sql="UPDATE tbproductorder SET qty=?,amount=? WHERE code=?";
            ps=conection().prepareStatement(sql);
            ps.setInt(1, product.getQty());
            ps.setDouble(2, product.getAmount());
            ps.setInt(3, product.getCode());
            ps.executeUpdate();
        } catch (Exception e) {
            message.getError(e);
        }
    }
    // create method fetchProductBuy
    public void fetchProductBuy(){
        try {
            sql="SELECT * FROM tbproductorder";
            ps=conection().prepareStatement(sql);
            r=ps.executeQuery();
            while(r.next()){
                ProductBuy.listproductbuy.add(new ProductBuy(
                        r.getInt(1),
                        r.getString(2),
                        r.getDouble(3),
                        r.getInt(4),
                        r.getDouble(5)
                ));
            }
        } catch (Exception e) {
            message.getError(e);
        }
    }
    // create removeProductbuy
    public void removeProductBuy(int code){
        try {
            sql="DELETE FROM tbproductorder WHERE code=?";
            ps=conection().prepareStatement(sql);
            ps.setInt(1, code);
            int index = ps.executeUpdate();
            if(index>0){
                message.getSuccess("Remove product buy successfu.");
            }else{
                message.getError("Error remove product buy...!");
            }
        } catch (Exception e) {
            message.getError(e);
        }
    }
    // create methodResetProductBuy
     public void resetProductBuy(){
        try {
            sql="DELETE FROM tbproductorder";
            ps=conection().prepareStatement(sql);
            int index = ps.executeUpdate();
            if(index>0){
                message.getSuccess("Reset product buy successfu.");
            }else{
                message.getError("Error reset product buy...!");
            }
        } catch (Exception e) {
            message.getError(e);
        }
    }
}
