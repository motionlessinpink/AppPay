package com.arquiteam.model;

import com.arquiteam.entities.payment.Cellphone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;

public class OxxoPayModel {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");

    public void createOxxoPay(Cellphone cellphone) {
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(cellphone);
        manager.getTransaction().commit();
        manager.close();
        JOptionPane.showMessageDialog(null,"Pago completado");
    }

}
