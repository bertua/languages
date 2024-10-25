/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.janelinhas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import javax.swing.text.MaskFormatter;


/**
 *
 * @author Aluno
 */
public class Idade extends JFrame{
    JLabel data, mostrar;
    JButton confirmar;
    JFormattedTextField jFormattedTextData;
    
    public Idade(){
        super("Cadastro");
        Container tela = getContentPane();
        setLayout(null);

        data = new JLabel("Data de nascimento");
        mostrar = new JLabel("");
        confirmar = new JButton("Confirmar");
        
        data.setBounds(20,20,120,20);
        confirmar.setBounds(20,70,100,20);
        mostrar.setBounds(20,100,100,20);
        
        MaskFormatter mascaraData = null;
        try{
            mascaraData = new MaskFormatter("##/##/####");
        } catch(ParseException excp){
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
        }
        jFormattedTextData = new JFormattedTextField(mascaraData);
        jFormattedTextData.setBounds(20,40,120,20);
        
        LocalDate today = LocalDate.now();
        confirmar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    calcular();
                }
            }
        );

        tela.add(data);
        tela.add(confirmar);
        tela.add(jFormattedTextData);
        tela.add(mostrar);
        
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }
    
    public void calcular(){
            String data = jFormattedTextData.getText();
            DateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
            
            try {
                Date dataNascimento = format1.parse(data);
                Calendar nascimento = Calendar.getInstance();
                nascimento.setTime(dataNascimento);
                
                Calendar hoje = Calendar.getInstance();
                int idade;
                if(hoje.get(Calendar.YEAR) < nascimento.get(Calendar.YEAR)){
                    idade = 0;
                }else{
                    idade = hoje.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR);
                }
                DateFormat format2 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
                String dataFormatada = format2.format(dataNascimento);
                JOptionPane.showMessageDialog(this,dataFormatada +" Idade: " + idade);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, JOptionPane.ERROR_MESSAGE);
            }
        
    }
    
}
