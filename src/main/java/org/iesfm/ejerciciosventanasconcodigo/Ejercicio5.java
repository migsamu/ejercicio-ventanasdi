/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesfm.ejerciciosventanasconcodigo;

import javax.swing.JButton;

/**
 *
 * @author MiguelSánchezMuñoz
 */
public class Ejercicio5 extends javax.swing.JFrame {

    public Ejercicio5() {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 400);
        setResizable(false);
        JButton empezar = new JButton("Empezar");
        setLayout(null);
        empezar.setBounds(290, 0, 100, 30);
        this.add(empezar);

    }

    public static void main(String[] args) {
        new Ejercicio5();
    }
}
