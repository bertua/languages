/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.janelinhas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculadora extends JFrame {
    JLabel lbNunero1, lbNumero2, lbResultado;
    JTextField tfNumero1, tfNumero2;
    JButton btMais, btMenos, btVezes, btDivido;
    double n1, n2;
    
    public Calculadora(){
        super("Cadastro");
        Container tela = getContentPane();
        setLayout(null);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        lbNunero1 = new JLabel("Primeiro número");
        lbNumero2 = new JLabel("Segundo número");
        lbResultado = new JLabel("");
        
        tfNumero1 = new JTextField(50);
        tfNumero2 = new JTextField(50);
        
        ImageIcon plus = new ImageIcon(getClass().getResource("/images/add.png"));
        ImageIcon minus = new ImageIcon(getClass().getResource("/images/minus.png"));
        ImageIcon times = new ImageIcon(getClass().getResource("/images/times.png"));
        ImageIcon division = new ImageIcon(getClass().getResource("/images/dividir.png"));
        
        btMais = new JButton(plus);
        btMenos = new JButton(minus);
        btVezes = new JButton(times);
        btDivido = new JButton(division);
        
        lbNunero1.setBounds(50,20,120,20);
        lbNumero2.setBounds(50,60,120,20);
        lbResultado.setBounds(50,130,120,20);
        
        tfNumero1.setBounds(150,20,100,20);
        tfNumero2.setBounds(150,60,100,20);
        
        btMais.setBounds(50,100,80,20);
        btMenos.setBounds(150,100,80,20);
        btVezes.setBounds(250,100,80,20);
        btDivido.setBounds(350,100,80,20);
        
        
        btMais.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        n1 = Double.valueOf(tfNumero1.getText());
                        n2 = Double.valueOf(tfNumero2.getText());
                        lbResultado.setText(Double.toString(n1 + n2));
                    }
                }
        );
        
        btMenos.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        n1 = Double.valueOf(tfNumero1.getText());
                        n2 = Double.valueOf(tfNumero2.getText());
                        lbResultado.setText(Double.toString(n1 - n2));
                    }
                }
        );
        
        btVezes.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        n1 = Double.valueOf(tfNumero1.getText());
                        n2 = Double.valueOf(tfNumero2.getText());
                        lbResultado.setText(Double.toString(n1 * n2));
                    }
                }
        );
        
        btDivido.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        n1 = Double.valueOf(tfNumero1.getText());
                        n2 = Double.valueOf(tfNumero2.getText());
                        if(n2 == 0){
                            lbResultado.setText("ERROR");
                        } else {
                            lbResultado.setText(Double.toString(n1 / n2));
                        }
                    }
                }
        );
        
        
        tela.add(lbNunero1);
        tela.add(lbNumero2);
        tela.add(lbResultado);
        
        tela.add(tfNumero1);
        tela.add(tfNumero2);
        
        tela.add(btMais);
        tela.add(btMenos);
        tela.add(btVezes);
        tela.add(btDivido);
        
        
        setSize(500,200);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }
        
        
}
