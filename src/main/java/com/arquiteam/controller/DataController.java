package com.arquiteam.controller;

import com.arquiteam.view.datosView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataController implements ActionListener {

    private final datosView dataView;

    public DataController() {
        dataView = new datosView();

        addingListener();
        filingView();
    }

    public void initView() {
        this.dataView.setVisible(true);
    }

    private void cleanView() {
        if (this.dataView.jPanel3.getComponentCount() > 0) {
            this.dataView.jPanel3.getComponent(0).setVisible(false);
        }
        this.dataView.jPanel3.removeAll();
        this.dataView.jPanel3.validate();
    }

    private void addingListener() {
        this.dataView.jBoxxo.addActionListener(this);
        this.dataView.jBtarjeta.addActionListener(this);
    }

    private void filingView() { //temporal
        this.dataView.jLconcepto.setText("REALIZACIÓN DE UN EVENTO DE SUBASTA");
        this.dataView.jLfechaAdju.setText("2020-09-16");
        this.dataView.jLtipobien.setText("Correo");
        this.dataView.jLhoraAdju.setText("12:00 AM");
        this.dataView.jLidevento.setText("MXN371599664762");
        this.dataView.jLhusoHorario.setText("Africa/Abidjan");
        this.dataView.jLimporteserv.setText("$15");
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        cleanView();
        if (this.dataView.jBoxxo == actionEvent.getSource()) {
            new OxxoPayController().initView(this.dataView);
        } else if (this.dataView.jBtarjeta == actionEvent.getSource()) {
            new CardPayController().initView(this.dataView);
        }
    }
}
