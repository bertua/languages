
package com.mycompany.janelinhas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class Atividade extends JFrame{
    
    JLabel lbNome, lbEmail, lbIdade, lbCPF, lbCelular, lbNascimento, lbEndereco, lbCEP, lbSenha;
    JTextField tfNome, tfEmail, tfIdade, tfEndereco;
    JPasswordField tfSenha;
    JButton btCadastrar, btPesquisar, btVoltar, btSair;
    
   
    
    public Atividade(){
        super("Cadastro");
        Container tela = getContentPane();
        setLayout(null);
        
        lbNome = new JLabel("Nome");
        lbEmail = new JLabel("Email");
        lbIdade = new JLabel("Idade");
        lbCPF = new JLabel("CPF");
        lbCelular = new JLabel("Celular");
        lbNascimento = new JLabel("Data de nasc.");
        lbEndereco = new JLabel("Endereço");
        lbCEP = new JLabel("CEP");
        lbSenha = new JLabel("Senha");
        
        tfNome = new JTextField(50);
        tfEmail = new JTextField(50);
        tfIdade = new JTextField(3);
        tfEndereco = new JTextField(100);
        tfSenha = new JPasswordField(100);
        
        btCadastrar = new JButton("Cadastrar");
        btPesquisar = new JButton("Pesquisar");
        btVoltar = new JButton("Voltar");
        btSair =  new JButton("Sair");
        
        lbNome.setBounds(50,20,120,20);
        lbEmail.setBounds(50,60,120,20);
        lbIdade.setBounds(50,100,120,20);
        lbCPF.setBounds(50,140,120,20);
        lbCelular.setBounds(50,180,120,20);
        lbNascimento.setBounds(50,220,120,20);
        lbEndereco.setBounds(50,260,120,20);
        lbCEP.setBounds(50,300,120,20);
        lbSenha.setBounds(50,340,120,20);
        
        tfNome.setBounds(150,20,200,20);
        tfEmail.setBounds(150,60,200,20);
        tfIdade.setBounds(150,100,200,20);
        tfEndereco.setBounds(150,260,200,20);
        tfSenha.setBounds(150,340,200,20);
        
        btCadastrar.setBounds(50,380,100,20);
        btPesquisar.setBounds(150,380,100,20);
        btVoltar.setBounds(250,380,100,20);
        btSair.setBounds(350,380,100,20);
        
        btCadastrar.setMnemonic('c');
        btPesquisar.setMnemonic('p');
        btVoltar.setMnemonic('v');
        btSair.setMnemonic('s');
        
        MaskFormatter mascaraCEP = null;
        MaskFormatter mascaraCel = null;
        MaskFormatter mascaraCPF = null;
        MaskFormatter mascaraData = null;
        
        try{
            mascaraCEP = new MaskFormatter("#####-###");
            mascaraCel = new MaskFormatter("(##)####-####");
            mascaraCPF = new MaskFormatter("###.###.###-##");
            mascaraData = new MaskFormatter("##/##/####");
        } catch(ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
        }
        
        JFormattedTextField jFormattedTextCEP = new JFormattedTextField(mascaraCEP);
        JFormattedTextField jFormattedTextCel = new JFormattedTextField(mascaraCel);
        JFormattedTextField jFormattedTextCPF = new JFormattedTextField(mascaraCPF);
        JFormattedTextField jFormattedTextData = new JFormattedTextField(mascaraData);
        jFormattedTextCEP.setBounds(150,300,200,20);
        jFormattedTextCel.setBounds(150,180,200,20);
        jFormattedTextCPF.setBounds(150,140,200,20);
        jFormattedTextData.setBounds(150,220,200,20);
        
        
        lbNome.setForeground(Color.red);
        lbEmail.setForeground(Color.red);
        lbIdade.setForeground(Color.red);
        lbCPF.setForeground(Color.red);
        lbCelular.setForeground(Color.red);
        lbNascimento.setForeground(Color.red);
        lbEndereco.setForeground(Color.red);
        lbCEP.setForeground(Color.red);
        lbSenha.setForeground(Color.red);
        tela.setBackground(Color.black);
        
        lbNome.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lbEmail.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lbIdade.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lbCPF.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lbCelular.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lbNascimento.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lbEndereco.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lbCEP.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lbSenha.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        
        btSair.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.exit(0);
                    }
                }
        );
        
        tela.add(lbNome);
        tela.add(lbEmail);
        tela.add(lbIdade);
        tela.add(lbCPF);
        tela.add(lbCelular);
        tela.add(lbNascimento);
        tela.add(lbEndereco);
        tela.add(lbCEP);
        tela.add(lbSenha);
        
        tela.add(tfNome);
        tela.add(tfEmail);
        tela.add(tfIdade);
        tela.add(jFormattedTextCPF);
        tela.add(jFormattedTextCel);
        tela.add(jFormattedTextData);
        tela.add(tfEndereco);
        tela.add(jFormattedTextCEP);
        tela.add(tfSenha);
        
        tela.add(btCadastrar);
        tela.add(btPesquisar);
        tela.add(btVoltar);
        tela.add(btSair);
        
        setSize(500,500);
        setVisible(true);
        setLocationRelativeTo(null);
        
        
    }
    
    
}
