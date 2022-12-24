package com.example.purzaa;

public class Customer {
    private String Fullname;
    private String UserName;
    private String Email;
    private String Password;

    public Customer(String fullname, String username, String email, String password){
        Fullname = fullname;
        UserName = username;
        Email = email;
        Password = password;


    }

    public Customer(){

    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
