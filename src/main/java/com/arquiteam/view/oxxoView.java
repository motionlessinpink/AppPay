/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arquiteam.view;

/**
 * @author javier
 */
public class oxxoView extends javax.swing.JPanel {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBgenerateVoucher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextField1;

    /**
     * Creates new form oxxoView
     */
    public oxxoView() {
        initComponents();
        setBounds(0, 0, 600, 185);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jBgenerateVoucher = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Numero telefonico:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 300, -1));

        jBgenerateVoucher.setText("Generar Comprobante");
        jPanel1.add(jBgenerateVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));
    }// </editor-fold>//GEN-END:initComponents
    // End of variables declaration//GEN-END:variables
}
