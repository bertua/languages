

package com.mycompany.janelinhas;

import javax.swing.*;

public class Janelinhas {

    public static void main(String[] args) {
        //PrimeiraJanela app = new PrimeiraJanela();
        //ExemploLabel app = new ExemploLabel();
        //Atividade app = new Atividade();
        //Calculadora app = new Calculadora();
        //Lista app = new Lista();
        //Botoes app = new Botoes();
        //Idade app = new Idade();
        Arquivos app = new Arquivos();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*SwingUtilities.invokeLater(() -> {
            // Instancia a classe Menus
            Menus app = new Menus();
            app.createAndShowSplashScreen();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });*/
        
    }
}
