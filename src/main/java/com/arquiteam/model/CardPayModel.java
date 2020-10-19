package com.arquiteam.model;

import com.arquiteam.entities.payment.Card;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;

public class CardPayModel {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");

    public void createCardPay(Card card) {
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(card);
        manager.getTransaction().commit();
        manager.close();
        JOptionPane.showMessageDialog(null,"Pago completado");
    }
}
