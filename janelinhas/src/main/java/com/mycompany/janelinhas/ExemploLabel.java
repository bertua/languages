
package com.mycompany.janelinhas;
import java.awt.*;
import javax.swing.*;

public class ExemploLabel extends JFrame{
    JLabel rotulo1, rotulo2, rotulo3, rotulo4;
    JTextField texto1, texto2, texto3, texto4;
    JButton botao;
    
    public ExemploLabel(){
        super("exemplo com Label");
        Container tela = getContentPane();
        setLayout(null);
        
        rotulo1 = new JLabel("Nome");
        rotulo2 = new JLabel("Idade");
        rotulo3 = new JLabel("Telefone");
        rotulo4 = new JLabel("Celular");
        
        texto1 = new JTextField(50);
        texto2 = new JTextField(3);
        texto3 = new JTextField(14);
        texto4 = new JTextField(14);
        
        botao = new JButton("Procurar");
        
        rotulo1.setBounds(50,20,120,20);
        rotulo2.setBounds(50,60,120,20);
        rotulo3.setBounds(50,100,120,20);
        rotulo4.setBounds(50,140,120,20);
        
        texto1.setBounds(150,20,200,20);
        texto2.setBounds(150,60,20,20);
        texto3.setBounds(150,100,80,20);
        texto4.setBounds(150,140,80,20);
        
        botao.setBounds(50,180,100,20);
        
        rotulo1.setForeground(Color.red);
        rotulo2.setForeground(Color.blue);
        rotulo3.setForeground(new Color(190,152,142));
        rotulo4.setForeground(new Color(201,200,100));
        
        rotulo1.setFont(new Font("Arial", Font.BOLD, 14));
        rotulo2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        rotulo3.setFont(new Font("Courier New", Font.BOLD, 18));
        rotulo4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        
        texto1.setHorizontalAlignment(JTextField.RIGHT);
        texto2.setBackground(Color.blue);
                
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        
        tela.add(botao);
        
        setSize(450,250);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }
            
    
}
