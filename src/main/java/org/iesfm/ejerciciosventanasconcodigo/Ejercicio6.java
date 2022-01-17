/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesfm.ejerciciosventanasconcodigo;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 *
 * @author MiguelSánchezMuñoz
 */
public class Ejercicio6 extends javax.swing.JFrame {

    public Ejercicio6() {
        //Ventana
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0, 0, 600, 600);
        setLocationRelativeTo(null);
        setTitle("Mi ventana");
        setLayout(null);
        //boton
        JButton finalizar = new JButton("Finalizar");
        this.add(finalizar);
        finalizar.setBounds(490, 0, 100, 30);
        //TextField
        JTextField cajaTexto = new JTextField("Hola mundo");
        this.add(cajaTexto);
        cajaTexto.setBounds(10, 50, 500, 30);
        cajaTexto.setFont(new Font("tahoma", Font.ITALIC + Font.BOLD, 18));
        //Label
        JLabel etiqueta = new JLabel("Mi primera etiqueta");
        this.add(etiqueta);
        etiqueta.setFont(new Font("tahoma", Font.PLAIN, 18));
        etiqueta.setBounds(10, 5, 450, 30);
        etiqueta.setForeground(Color.blue);
        etiqueta.setBorder(BorderFactory.createLineBorder(Color.yellow));
        etiqueta.setVerticalAlignment(SwingConstants.CENTER);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
       
    }

    public static void main(String[] args) {
        new Ejercicio6();
    }
}
