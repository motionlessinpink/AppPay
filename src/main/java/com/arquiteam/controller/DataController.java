package com.arquiteam.controller;

import com.arquiteam.view.datosView;
import com.arquiteam.view.oxxoView;
import com.arquiteam.view.tarjetaView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataController implements ActionListener {

    private datosView dV;
    private oxxoView oV;
    private tarjetaView tV;

    public DataController() {
        dV = new datosView();
        oV = new oxxoView();
        tV = new tarjetaView();

        addingListener();
        oV.setVisible(false);
        tV.setVisible(false);
    }

    public void initView() {
        this.dV.setVisible(true);
    }

    public void addingListener() {
        this.dV.jBoxxo.addActionListener(this);
        this.dV.jBtarjeta.addActionListener(this);
        this.dV.jPanel3.add(oV);
        this.dV.jPanel3.add(tV);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (this.dV.jBoxxo == actionEvent.getSource()) {
            oV.setVisible(true);
            tV.setVisible(false);
            dV.jPanel3.validate();
        } else if (this.dV.jBtarjeta == actionEvent.getSource()) {

            oV.setVisible(false);
            tV.setVisible(true);
            dV.jPanel3.validate();
        }

    }
}
