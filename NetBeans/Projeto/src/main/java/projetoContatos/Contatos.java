
package projetoContatos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class Contatos extends JFrame{
    
    private Container tela;
    private JMenuBar menuBar;
    private JToolBar toolBar;
    private JPopupMenu popupMenu;
    private DefaultTableModel tableModel;
    private JTable tabela;
    private JScrollPane scrollPane;
    private JPanel panel;
    private JComboBox<String> comboBox;
    private ArrayList<Contato> contatos = new ArrayList<>();
    

    public Contatos(){
        super("Contatos");
        tela = getContentPane();
        setLayout(null);
        setResizable(false);
        
        
        //MenuBar
        menuBar = new JMenuBar();
        menuBar.setBounds(0,0,500,30);
        
        JMenu menuArquivo = new JMenu("Arquivo");
        JMenuItem menuSalvar = new JMenuItem("Salvar");
        JMenuItem menuCarregar = new JMenuItem("Carregar");
        JMenuItem menuSair = new JMenuItem("Sair");
        menuArquivo.add(menuSalvar);
        menuArquivo.add(menuCarregar);
        menuArquivo.add(menuSair);
        
        JMenu menuEditar = new JMenu("Editar");
        JMenuItem menuAdicionar = new JMenuItem("Adicionar");
        JMenuItem menuEditar2 = new JMenuItem("Editar");
        JMenuItem menuExcluir = new JMenuItem("Excluir");
        menuEditar.add(menuAdicionar);
        menuEditar.add(menuEditar2);
        menuEditar.add(menuExcluir);

        JMenu menuAjuda = new JMenu("Ajuda");
        JMenuItem menuAjuda2 = new JMenuItem("Obter ajuda");
        JMenuItem menuSobre = new JMenuItem("Sobre");
        menuAjuda.add(menuAjuda2);
        menuAjuda.add(menuSobre);
        
        menuBar.add(menuArquivo);
        menuBar.add(menuEditar);
        menuBar.add(menuAjuda);


        
        //ToolBar
        toolBar = new JToolBar();
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
            adicionarContato();
        });
        
        toolEditar.addActionListener((ActionEvent e) -> {
            editarContato();
        });
        
        toolExcluir.addActionListener((ActionEvent e) -> {
            excluirContato();
        });
        
        
        //Table
        String[] colunas = {"Nome","Telefone","E-mail","Endereço","Categoria"};
        tableModel = new DefaultTableModel(colunas, 0);
        tabela = new JTable(tableModel);
        scrollPane = new JScrollPane(tabela);
        scrollPane.setBounds(0,60,485,300);
        tableModel.addRow(new Object[]{"João Silva", "(11) 99999-9999", "joao@example.com", "Rua A, 123", "Amigo"});
        
        
        //PopupMenu
        popupMenu = new JPopupMenu();
        JMenuItem popupEditar = new JMenuItem("Editar");
        JMenuItem popupExcluir = new JMenuItem("Excluir");
        popupMenu.add(popupEditar);
        popupMenu.add(popupExcluir);
        
        popupEditar.addActionListener((ActionEvent e) -> {
            ///////8888888888
        });
        
        popupExcluir.addActionListener((ActionEvent e) -> {
            ///////8888888888
        });
        
        tabela.addMouseListener(new MouseAdapter() {
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
        
        //Filtro
        panel = new JPanel();
        panel.setBounds(250,360,250,50);
        
        String[] categorias = {"Todos", "Amigo", "Família", "Trabalho"};
        comboBox = new JComboBox<>(categorias);
        comboBox.addActionListener((ActionEvent e) -> {
            //filtrar();
        });
        
        panel.add(new JLabel("Filtrar por categoria:"));
        panel.add(comboBox);
        
        
        //
        tela.add(scrollPane);
        tela.add(menuBar);
        tela.add(toolBar);
        tela.add(panel);
        
        setSize(500,440); 
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    private void adicionarContato() {
        Adicionar adicionar = new Adicionar(this);
        adicionar.setVisible(true);
    }
    
    private void editarContato() {
        Editar editar = new Editar(this);
        editar.setVisible(true);
    }
    
    private void excluirContato() {
        
        JOptionPane.showConfirmDialog(rootPane, "Deseja excluir esse contato?", "Excluir contato", JOptionPane.YES_NO_CANCEL_OPTION);
    }
    
    private void salvarContato() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter("contatos.json")) {
            gson.toJson(contatos, writer);
            JOptionPane.showMessageDialog(this, "Contatos salvos!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void carregarContato() {

    }
}
