package Myproject;

import java.util.ArrayList;

public class User {
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    public String getConfirmPasword() {
        return confirmPasword;
    }
    private String email,password,confirmPasword;

    public User(String email, String password, String confirmPasword) {
        this.email = email;
        this.password = password;
        this.confirmPasword = confirmPasword;
    }
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
    static ArrayList<User> listUser = new ArrayList<>();
}
