/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.janelinhas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

/**
 *
 * @author Aluno
 */
public class Menus extends JFrame{
    JTextArea area;
    JPopupMenu popupMenu;
    JToolBar tool;
    
    public Menus(){
        super("Cadastro");
        Container tela = getContentPane();
        setLayout(null);
        
        popupMenu = new JPopupMenu();
        area = new JTextArea();
        area.setBounds(50,100,100,50);
        
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        popupMenu.add(cutItem);
        popupMenu.add(copyItem);
        popupMenu.add(pasteItem);
        
        cutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.cut();
            }
        });

        copyItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.copy();
            }
        });

        pasteItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.paste();
            }
        });
        
        area.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                showPopupMenu(e);
            }

            public void mouseReleased(MouseEvent e) {
                showPopupMenu(e);
            }

            private void showPopupMenu(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        
        
        tool = new JToolBar();
        tool.setBounds(0,0,500,30);
        JMenuItem novo = new JMenuItem("novo");
        JMenuItem abrir = new JMenuItem("abrir");
        JMenuItem salvar = new JMenuItem("salvar");
        JMenuItem sair = new JMenuItem("sair");
        JMenuItem config = new JMenuItem("Configurações");
            
        tool.add(novo);
        tool.add(abrir);
        tool.add(salvar);
        tool.add(sair);
        tool.add(config);
        
        novo.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    createAndShowDialog();
                }
            }
        );
        
        abrir.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    createAndShowModalDialog();
                }
            }
        );
        
        config.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    createNewJFrame();
                }
            }
        );
        
        
        tela.add(tool);
        tela.add(popupMenu);
        tela.add(area);
                 
        
        setSize(520,500);
        //setVisible(true);
        setLocationRelativeTo(null);
    }
    
    private void createAndShowModalDialog() {
        // Cria a janela modal
        JDialog modalDialog = new JDialog(this, "Janela Modal", true);
        modalDialog.setSize(300, 200);
        modalDialog.setLayout(new BorderLayout());
        modalDialog.setLocationRelativeTo(this);
        
        JTextArea textArea= new JTextArea();
        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                modalDialog.dispose();
            }
        });
        JPanel panel = new JPanel();
        panel.add(textArea);
        panel.add(okButton);
        
        modalDialog.add(panel, BorderLayout.CENTER);
        
        // Exibe a janela modal
        modalDialog.setVisible(true);
    }
    
    private void createAndShowDialog() {
        // Cria a janela modal
        JDialog dialog = new JDialog(this, "Janela");
        dialog.setSize(300, 200);
        dialog.setLayout(new BorderLayout());
        dialog.setLocationRelativeTo(this);
        
        JTextArea textArea= new JTextArea();
        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
        JPanel panel = new JPanel();
        panel.add(textArea);
        panel.add(okButton);
        
        dialog.add(panel, BorderLayout.CENTER);
        dialog.setVisible(true);
    }
    
    private void createNewJFrame(){
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(400,300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    
    public void createAndShowSplashScreen() {
        JWindow splashScreen = new JWindow();
        splashScreen.setSize(300, 150);
        splashScreen.setLayout(new BorderLayout());
        splashScreen.setLocationRelativeTo(null);
        
        JLabel splashLabel = new JLabel("Carregando aplicação...", JLabel.CENTER);
        splashLabel.setFont(new Font("Serif", Font.BOLD, 20));
        splashScreen.add(splashLabel, BorderLayout.CENTER);
        
        splashScreen.setVisible(true);
        
        Timer timer = new Timer(3000, e -> {
            splashScreen.dispose();
            SwingUtilities.invokeLater(() -> {
                this.setVisible(true);
            });
            
            
        });
        timer.setRepeats(false);
        timer.start();
        
    }
}
