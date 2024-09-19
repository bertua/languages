
package br.com.projeto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;

public class Contatos extends JFrame{
    
    
    public Contatos(){
        super("Contatos");
        Container tela = getContentPane();
        setLayout(null);
        
        
        //MenuBar
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0,0,180,30);
        menuBar.setBorder(null);
        
        JMenuItem menuArquivo = new JMenuItem("Arquivo");
        JMenuItem menuEditar = new JMenuItem("Editar");
        JMenuItem menuAjuda = new JMenuItem("Ajuda");
        menuBar.add(menuArquivo);
        menuBar.add(menuEditar);
        menuBar.add(menuAjuda);

        
        //ToolBar
        JToolBar toolBar = new JToolBar();
        toolBar.setBounds(0,30,485,30);
        toolBar.setBorder(null);
        
        JMenuItem toolAdicionar = new JMenuItem("Adicionar");
        JMenuItem toolEditar = new JMenuItem("Editar");
        JMenuItem toolExcluir = new JMenuItem("Excluir");
        JMenuItem toolSalvar = new JMenuItem("Salvar");
        JMenuItem toolCarregar = new JMenuItem("Carregar");
        toolBar.add(toolAdicionar);
        toolBar.add(toolEditar);
        toolBar.add(toolExcluir);
        toolBar.add(toolSalvar);
        toolBar.add(toolCarregar);
        
        toolAdicionar.addActionListener((ActionEvent e) -> {
            Adicionar adicionar = new Adicionar();
            adicionar.show();
        });
        
        
        //Table
        String[] colunas = {"Nome","Telefone","E-mail","Endereço","Categoria"};
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(colunas);
        tableModel.setRowCount(0);
        
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0,60,490,480);
        tableModel.addRow(new Object[]{"João Silva", "(11) 99999-9999", "joao@example.com", "Rua A, 123", "Amigo"});
        
        
        //PopupMenu
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem popupEditar = new JMenuItem("Editar");
        JMenuItem popupExcluir = new JMenuItem("Excluir");
        popupMenu.add(popupEditar);
        popupMenu.add(popupExcluir);
        
        popupEditar.addActionListener((ActionEvent e) -> {
            
        });
        
        popupExcluir.addActionListener((ActionEvent e) -> {
            
        });
        
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                showPopupMenu(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                showPopupMenu(e);
            }

            private void showPopupMenu(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        
        //
//        JPanel panel = new JPanel();
//        String[] categorias = {"Todas", "Amigo", "Família", "Trabalho"};
//        JComboBox<String> comboBox = new JComboBox<>(categorias);
//        comboBox.addActionListener((ActionEvent e) -> {
//            String selectedCategory = (String) comboBox.getSelectedItem();
//            filtrar(selectedCategory, tableModel, table);
//        });
        
        
        tela.add(scrollPane,BorderLayout.CENTER);
        tela.add(menuBar);
        tela.add(toolBar);
        
        setSize(500,600); 
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
