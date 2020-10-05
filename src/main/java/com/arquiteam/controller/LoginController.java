package com.arquiteam.controller;

import com.arquiteam.view.loginView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController implements ActionListener {

    private final loginView loginView;

    public LoginController() {
        loginView = new loginView();
        addListener();
    }

    public void initView() {
        loginView.setVisible(true);
    }

    public void addListener() {
        loginView.jButton1.addActionListener(this);
    }

    @Override

    public void actionPerformed(ActionEvent actionEvent) {
        if (loginView.jButton1 == actionEvent.getSource()) {
            new DataController().initView();
        }
    }
}
