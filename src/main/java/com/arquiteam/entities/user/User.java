package com.arquiteam.entities.user;

import com.arquiteam.payment.Card;

public class User {
    private String username;
    private String password;
    private Card personalCard; // ?

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
