/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.janelinhas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Arquivos extends JFrame {
    
    JLabel lbNome, lbEmail, lbTelefone, lbSexo, lbCidade, lbEstado;
    JTextField tfNome,tfEmail, tfTelefone, tfSexo, tfCidade, tfEstado;
    JButton btCadastrar, btLer;
    
    public Arquivos(){
        super("Cadastro");
        Container tela = getContentPane();
        setLayout(null);
        
        lbNome = new JLabel("Nome");
        lbEmail = new JLabel("E-mail");
        lbTelefone = new JLabel("Telefone");
        lbSexo = new JLabel("Sexo");
        lbCidade = new JLabel("Cidade");
        lbEstado = new JLabel("Estado");
        
        tfNome = new JTextField(50);
        tfEmail = new JTextField(50);
        tfTelefone = new JTextField(50);
        tfSexo = new JTextField(50);
        tfCidade = new JTextField(50);
        tfEstado = new JTextField(50);
        
        btCadastrar = new JButton("Cadastrar");
        btLer = new JButton("Ler");
        
        lbNome.setBounds(50,20,120,20);
        lbEmail.setBounds(50,60,120,20);
        lbTelefone.setBounds(50,100,120,20);
        lbSexo.setBounds(50,140,120,20);
        lbCidade.setBounds(50,180,120,20);
        lbEstado.setBounds(50,220,120,20);
        
        tfNome.setBounds(150,20,200,20);
        tfEmail.setBounds(150,60,200,20);
        tfTelefone.setBounds(150,100,200,20);
        tfSexo.setBounds(150,140,200,20);
        tfCidade.setBounds(150,180,200,20);
        tfEstado.setBounds(150,220,200,20);
        
        btCadastrar.setBounds(50,260,100,20);
        btLer.setBounds(200,260,100,20);
        
        btCadastrar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    EscreveArquivo();
                }
            }
        );
        
        btLer.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
//                    String ler = LeArquivo();
//                    JOptionPane.showMessageDialog(rootPane,ler);
                      Tabela tabela = new Tabela();
                      tabela.show();
                }
            }
        );
        
        
        tela.add(lbNome);
        tela.add(lbEmail);
        tela.add(lbTelefone);
        tela.add(lbSexo);
        tela.add(lbCidade);
        tela.add(lbEstado);
        tela.add(tfNome);
        tela.add(tfEmail);
        tela.add(tfTelefone);
        tela.add(tfSexo);
        tela.add(tfCidade);
        tela.add(tfEstado);
        tela.add(btCadastrar);
        tela.add(btLer);
        
        
        setSize(400,350);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public void EscreveArquivo(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("saida.txt",true))) {
            
            writer.write(tfNome.getText() + ",");
            writer.write(tfEmail.getText() + ",");
            writer.write(tfTelefone.getText() + ",");
            writer.write(tfSexo.getText() + ",");
            writer.write(tfCidade.getText() + ",");
            writer.write(tfEstado.getText() + ",");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();        
        }
    }
    
    public String LeArquivo() {
        String i = "";
        try (BufferedReader reader = new BufferedReader(new FileReader("saida.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                i += linha +"\n";
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return i;
    }
}
