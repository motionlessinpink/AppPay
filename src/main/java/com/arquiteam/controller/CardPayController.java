package com.arquiteam.controller;

import com.arquiteam.entities.payment.Card;
import com.arquiteam.model.CardPayModel;
import com.arquiteam.view.datosView;
import com.arquiteam.view.tarjetaView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardPayController implements ActionListener {

    private CardPayModel cardPayModel;
    private tarjetaView cardPayView;

    public CardPayController() {
        this.cardPayModel = new CardPayModel();
        this.cardPayView = new tarjetaView();
        addListener();
    }

    public void initView(datosView fatherView) {
        fatherView.jPanel3.add(cardPayView);
        fatherView.jPanel3.validate();
        cardPayView.setVisible(true);
    }

    public void addListener() {
        this.cardPayView.jBgenerateVoucher.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (this.cardPayView.jBgenerateVoucher == actionEvent.getSource()) {
            String cardOwner = this.cardPayView.jTextField5.getText();
            String cardNumber = this.cardPayView.jTextField4.getText();
            String cardMonthExp = this.cardPayView.jTextField1.getText();
            String cardYearExp = this.cardPayView.jTextField2.getText();
            String cardCVC = this.cardPayView.jTextField3.getText();
            String cardCellphone = this.cardPayView.jTextField6.getText();
            this.cardPayModel.createCardPay(new Card(cardOwner, cardNumber, cardMonthExp, cardYearExp, cardCVC, cardCellphone));
        }
    }
}
