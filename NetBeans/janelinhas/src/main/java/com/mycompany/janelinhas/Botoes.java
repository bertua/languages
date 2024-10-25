/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.janelinhas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author Aluno
 */
public class Botoes extends JFrame{
    
    JButton btConfimar,btInput,btMensagem;
    JLabel nome;
    
    public Botoes(){
        super("Botões");
        Container tela = getContentPane();
        setLayout(null);
        
        btConfimar = new JButton("Confirmar");
        btInput = new JButton("Input");
        btMensagem = new JButton("Mensagem");
        
        nome = new JLabel("");
        nome.setBounds(20,80,100,20);
        
        btConfimar.setBounds(20,50,100,20);
        btInput.setBounds(120,50,100,20);
        btMensagem.setBounds(220,50,100,20);
        
        
        btConfimar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int confirmar = JOptionPane.showConfirmDialog(rootPane,
                                "Você deseja fechar o programa?", "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
                        if(confirmar == JOptionPane.YES_OPTION){
                            setVisible(false);
                            dispose();
                        }
                        else if(confirmar == JOptionPane.NO_OPTION){
                            JOptionPane.showMessageDialog(null, "Não fechar");
                        }
                        else if(confirmar == JOptionPane.CANCEL_OPTION){
                            JOptionPane.showMessageDialog(null, "Usuário cancelou");
                        }
                    }
                }
        );
        
        btInput.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String input = JOptionPane.showInputDialog("Qual seu nome?");
                        nome.setText(input);
                    }
                });
        
        btMensagem.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                     JOptionPane.showMessageDialog(null, "Clicou no botão");
                }
            });
        
        tela.add(btConfimar);
        tela.add(btInput);
        tela.add(btMensagem);
        tela.add(nome);
        
        setSize(350,250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
        
    
}
