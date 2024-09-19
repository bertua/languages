
package br.com.projeto;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Aluno
 */
public class Adicionar extends JFrame{
    
    JLabel lbNome,lbTelefone,lbEmail,lbEndereco,lbCategoria;
    JTextField tfNome,tfEmail,tfEndereco,tfCategoria;
    JFormattedTextField tfTelefone;
    JButton btSalvar, btCancelar;
    
    public Adicionar(){
        super("Adicionar");
        Container tela = getContentPane();
        setLayout(null);
        setResizable(false);
        
        lbNome = new JLabel("Nome");
        lbTelefone = new JLabel("Telefone");
        lbEmail = new JLabel("E-mail");
        lbEndereco = new JLabel("Endereço");
        lbCategoria = new JLabel("Categoria");
        lbNome.setBounds(50,20,120,20);
        lbTelefone.setBounds(50,60,120,20);
        lbEmail.setBounds(50,100,120,20);
        lbEndereco.setBounds(50,140,120,20);
        lbCategoria.setBounds(50,180,120,20);
        
        
        MaskFormatter mascaraTel = null;
        try{
            mascaraTel = new MaskFormatter("(##)####-####");
        } catch(ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
        }
        
        tfNome = new JTextField(100);
        tfTelefone = new JFormattedTextField(mascaraTel);
        tfEmail = new JTextField(100);
        tfEndereco = new JTextField(100);
        tfCategoria = new JTextField(50);
        tfNome.setBounds(150,20,200,20);
        tfTelefone.setBounds(150,60,200,20);
        tfEmail.setBounds(150,100,200,20);
        tfEndereco.setBounds(150,140,200,20);
        tfCategoria.setBounds(150,180,200,20);
        
        
        btSalvar = new JButton("Salvar");
        btCancelar = new JButton("Cancelar");
        btSalvar.setBounds(150,220,100,20);
        btCancelar.setBounds(250,220,100,20);
        
        btSalvar.addActionListener((ActionEvent e) -> {

        });
        
        btCancelar.addActionListener((ActionEvent e) -> {
            this.dispose();
        });
        
        
        tela.add(lbNome);
        tela.add(lbTelefone);
        tela.add(lbEmail);
        tela.add(lbEndereco);
        tela.add(lbCategoria);
        tela.add(tfNome);
        tela.add(tfTelefone);
        tela.add(tfEmail);
        tela.add(tfEndereco);
        tela.add(tfCategoria);
        tela.add(btSalvar);
        tela.add(btCancelar);
        


        setSize(400,300); 
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
