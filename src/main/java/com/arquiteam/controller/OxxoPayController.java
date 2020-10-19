package com.arquiteam.controller;

import com.arquiteam.entities.payment.Cellphone;
import com.arquiteam.model.OxxoPayModel;
import com.arquiteam.view.datosView;
import com.arquiteam.view.oxxoView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OxxoPayController implements ActionListener {

    private oxxoView oxxoView;
    private OxxoPayModel oxxoPayModel;


    public OxxoPayController() {
        this.oxxoPayModel = new OxxoPayModel();
        this.oxxoView = new oxxoView();


        addListener();
    }

    public void initView(datosView fatherView) {
        fatherView.jPanel3.add(oxxoView);
        fatherView.jPanel3.validate();
        oxxoView.setVisible(true);
    }

    public void addListener() {
        this.oxxoView.jBgenerateVoucher.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (this.oxxoView.jBgenerateVoucher == actionEvent.getSource()) {
            String cellphoneNumber = this.oxxoView.jTextField1.getText();
            if (cellphoneNumber.length() == 10) {
                oxxoPayModel.createOxxoPay(new Cellphone(Long.parseLong(cellphoneNumber)));
            } else {
                JOptionPane.showMessageDialog(null, "Cellphone number length invalid.");
            }
        }
    }
}
