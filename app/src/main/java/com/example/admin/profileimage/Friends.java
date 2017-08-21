package com.example.admin.profileimage;

/**
 * Created by Admin on 8/21/2017.
 */

public class Friends {
    String name;

    public Friends(String Name, String Email) {
        this.name = Name;
        this.email = Email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String email;

}
