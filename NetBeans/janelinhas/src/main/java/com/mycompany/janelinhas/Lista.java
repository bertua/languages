/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.janelinhas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 *
 * @author Aluno
 */
public class Lista extends JFrame{
    String[] estados = {"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia","Ceará","Espírito Santo","Goiás","Maranhão","Mato Grosso","Mato Grosso do Sul","Minas Gerais","Pará",
        "Paraíba","Paraná","Pernambuco","Piauí","Rio de Janeiro","Rio Grande do Norte","Rio Grande do Sul","Rondônia","Roraima","Santa Catarina","São Paulo","Sergipe","Tocantins"};
    JList lstEstados;
    JLabel lbCheck,lbRadio;
    JComboBox cbEstados;
    JButton btEstados,btCheck,btRadio;
    JCheckBox ckb1,ckb2,ckb3,ckb4;
    JRadioButton rb1,rb2,rb3,rb4;
    ButtonGroup grupo1;
    
    public Lista(){
        super("Cadastro");
        Container tela = getContentPane();
        setLayout(null);
        
        lstEstados = new JList(estados);
        lstEstados.setBounds(0,0,200,500);
        
        lstEstados.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event){
                if(!event.getValueIsAdjusting()){
                    JList source = (JList)event.getSource();
                    String selected = source.getSelectedValue().toString();
                    JOptionPane.showMessageDialog(null, selected);
                }
            }
        });
        
        cbEstados = new JComboBox(estados);
        cbEstados.setBounds(250,20,100,30);
        
        btEstados = new JButton("Selecionar");
        btEstados.setBounds(350,20,95,30);
        
        btEstados.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String estado = cbEstados.getSelectedItem().toString();
                        JOptionPane.showMessageDialog(null, estado);
                    }
                }
        );
        
        ckb1 = new JCheckBox("1");
        ckb2 = new JCheckBox("2");
        ckb3 = new JCheckBox("3");
        ckb4 = new JCheckBox("4");
        btCheck = new JButton("Verificar");
        lbCheck = new JLabel("");
        
        ckb1.setBounds(250,50,50,50);
        ckb2.setBounds(300,50,50,50);
        ckb3.setBounds(350,50,50,50);
        ckb4.setBounds(400,50,50,50);
        btCheck.setBounds(250,100,100,20);
        lbCheck.setBounds(250,120,100,20);
        
        btCheck.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String mensagem = "Selecionados:";
                    if(ckb1.isSelected()){ 
                        mensagem += " 1";
                    }
                    if(ckb2.isSelected()){ 
                        mensagem += " 2";
                    }
                    if(ckb3.isSelected()){ 
                        mensagem += " 3";
                    }
                    if(ckb4.isSelected()){ 
                        mensagem += " 4";
                    }
                    lbCheck.setText(mensagem);
                }
        });
        
        
        
        rb1 = new JRadioButton("1");
        rb2 = new JRadioButton("2");
        rb3 = new JRadioButton("3");
        rb4 = new JRadioButton("4");
        grupo1 = new ButtonGroup();
        grupo1.add(rb1);
        grupo1.add(rb2);
        grupo1.add(rb3);
        grupo1.add(rb4);
        
        rb1.setBounds(250,150,50,20);
        rb2.setBounds(320,150,50,20);
        rb3.setBounds(250,170,50,20);
        rb4.setBounds(320,170,50,20);
        
        btRadio = new JButton("Verificar");
        btRadio.setBounds(250,200,100,20);
        
        lbRadio = new JLabel("");
        lbRadio.setBounds(250,220,100,20);
        
        btRadio.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String mensagem = "Selecionado:";
                    if(rb1.isSelected()){
                        mensagem += rb1.getText();
                    }
                    if(rb2.isSelected()){
                        mensagem += rb1.getText();
                    }
                    if(rb3.isSelected()){
                        mensagem += rb1.getText();
                    }
                    if(rb4.isSelected()){
                        mensagem += rb1.getText();
                    }
                    lbRadio.setText(mensagem);
                }
        });
        
        
        
        
        
        tela.add(lstEstados);
        tela.add(cbEstados);
        tela.add(btEstados);
        tela.add(ckb1);
        tela.add(ckb2);
        tela.add(ckb3);
        tela.add(ckb4);
        tela.add(btCheck);
        tela.add(lbCheck);
        tela.add(rb1);
        tela.add(rb2);
        tela.add(rb3);
        tela.add(rb4);
        tela.add(btRadio);
        tela.add(lbRadio);
        
        
        
        setSize(500,520);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    
}
