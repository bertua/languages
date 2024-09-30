/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoContatos;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ContactManager extends JFrame {
    private DefaultTableModel tableModel;
    private JTable table;
    private JList<String> categoryList;
    private String[] categories = {"Família", "Amigos", "Trabalho"};
    private List<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
        
        setTitle("Gerenciador de Contatos");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Toolbar
      

        // Menu Bar

        // Table
        String[] columnNames = {"Nome", "Telefone", "E-mail", "Endereço", "Categoria"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        table.setComponentPopupMenu(createPopupMenu());
        add(new JScrollPane(table), BorderLayout.CENTER);

        // Category filter
        categoryList = new JList<>(categories);
        categoryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        categoryList.addListSelectionListener(e -> filterContacts());
        add(new JScrollPane(categoryList), BorderLayout.EAST);
    }

    private void addButton(JToolBar toolBar, String name, ActionListener action) {
        JButton button = new JButton(name);
        button.addActionListener(action);
        toolBar.add(button);
    }

    private void addMenuItem(JMenu menu, String name, ActionListener action) {
        JMenuItem item = new JMenuItem(name);
        item.addActionListener(action);
        menu.add(item);
    }

    private JPopupMenu createPopupMenu() {
        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add(new JMenuItem(new AbstractAction("Editar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                editContact();
            }
        }));
        popupMenu.add(new JMenuItem(new AbstractAction("Excluir") {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteContact();
            }
        }));
        return popupMenu;
    }

    private void addContact() {
        // Implementar lógica para adicionar contato (exemplo simples)
        Contact contact = new Contact("Nome", "Telefone", "Email", "Endereço", "Categoria");
        contacts.add(contact);
        updateTable();
    }

    private void editContact() {
        // Implementar lógica para editar contato
    }

    private void deleteContact() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            contacts.remove(selectedRow);
            updateTable();
        }
    }

    private void saveContacts() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (Writer writer = new FileWriter("contatos.json")) {
            gson.toJson(contacts, writer);
            JOptionPane.showMessageDialog(this, "Contatos salvos com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateTable() {
        tableModel.setRowCount(0);
        for (Contact contact : contacts) {
            tableModel.addRow(new Object[]{contact.getName(), contact.getPhone(), contact.getEmail(), contact.getAddress(), contact.getCategory()});
        }
    }

    private void filterContacts() {
        String selectedCategory = categoryList.getSelectedValue();
        // Implementar lógica para filtrar contatos por categoria
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ContactManager().setVisible(true);
        });
    }

    // Classe de Contato
    private static class Contact {
        private String name;
        private String phone;
        private String email;
        private String address;
        private String category;

        public Contact(String name, String phone, String email, String address, String category) {
            this.name = name;
            this.phone = phone;
            this.email = email;
            this.address = address;
            this.category = category;
        }

        public String getName() { return name; }
        public String getPhone() { return phone; }
        public String getEmail() { return email; }
        public String getAddress() { return address; }
        public String getCategory() { return category; }
    }
}
