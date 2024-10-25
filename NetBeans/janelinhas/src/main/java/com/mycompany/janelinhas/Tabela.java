/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.janelinhas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class Tabela extends JFrame {

    JTable table;
    DefaultTableModel tableModel;
    public Tabela() {
        super("Cadastro");
        Container tela = getContentPane();
        setLayout(new BorderLayout());
        
        String[][] dados = LeArquivo("saida.txt");
        String[] colunas = {"Nome", "Email", "Telefone", "Sexo", "Cidade", "Estado"};
        
        tableModel = new DefaultTableModel(dados,colunas);
        tableModel.setColumnIdentifiers(colunas);
        tableModel.setRowCount(0);
        
        for(String[] row : dados){
            tableModel.addRow(row);
        }
        
        table = new JTable(tableModel);
        
        JScrollPane scrollPane = new JScrollPane(table);
        tela.add(scrollPane,BorderLayout.CENTER);
        
        setSize(400,350);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public String[][] LeArquivo(String path) {
        ArrayList<String[]> linhas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(",");
                linhas.add(partes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String[][] matriz = new String[linhas.size()][];
        for(int i=0;i<linhas.size();i++){
            matriz[i] = linhas.get(i);
        }
        return matriz;
    }
}
