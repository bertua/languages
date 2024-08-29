
package com.mycompany.janelinhas;


import javax.swing.*;
import java.awt.*;

public class PrimeiraJanela extends JFrame {
    public PrimeiraJanela(){
        super("Nossa primeira janela");
        Container tela = getContentPane();
        tela.setBackground(Color.blue);
        setResizable(false); //não pode redimensionar
        setSize(300,150);
        setVisible(true);
        setLocationRelativeTo(null); //centralizada
        setExtendedState(ICONIFIED); //inicia minimizada
    }
}