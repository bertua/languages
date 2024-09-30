
package projetoContatos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;


public class Adicionar extends JDialog{
    
    private JLabel lbNome,lbTelefone,lbEmail,lbEndereco,lbCategoria;
    private JTextField tfNome,tfEmail,tfEndereco;
    private JFormattedTextField tfTelefone;
    private JButton btSalvar, btCancelar;
    private JComboBox cbCategoria;
    
    
    public Adicionar(Contatos contatos){
        super(contatos, "Adicionar Contato", true);
        setLayout(null);
        setResizable(false);
        
        
        //Labels
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
        
        
        //Areas de preenchimento
        MaskFormatter mascaraTel = null;
        try{
            mascaraTel = new MaskFormatter("(##)#####-####");
        } catch(ParseException e) {
            System.err.println("Erro na formatação: " + e.getMessage());
            System.exit(-1);
        }
        
        tfNome = new JTextField(100);
        tfTelefone = new JFormattedTextField(mascaraTel);
        tfEmail = new JTextField(100);
        tfEndereco = new JTextField(100);
        String[] categorias = {"Amigo", "Família", "Trabalho"};
        cbCategoria = new JComboBox(categorias);
        cbCategoria.setSelectedItem(null);
        tfNome.setBounds(150,20,200,20);
        tfTelefone.setBounds(150,60,200,20);
        tfEmail.setBounds(150,100,200,20);
        tfEndereco.setBounds(150,140,200,20);
        cbCategoria.setBounds(150,180,200,20);
        
        
        //Botões
        btSalvar = new JButton("Salvar");
        btCancelar = new JButton("Cancelar");
        btSalvar.setBounds(150,220,100,20);
        btCancelar.setBounds(250,220,100,20);
        
        btSalvar.addActionListener((ActionEvent e) -> {
            boolean error = false;
            if(tfNome.getText().isEmpty() || tfNome.getText().length() > 200){
                error = true;
                JOptionPane.showMessageDialog(rootPane, "Preencha o nome (máx. 200 caractéres)");
            }
            if(!tfTelefone.getText().matches("\\(\\d{2}\\)\\d{5}-\\d{4}")){
                error = true;
                JOptionPane.showMessageDialog(rootPane, "Preencha o telefone");
            }
            if(!tfEmail.getText().matches("^[\\w-\\.]+@[\\w-]+\\.[a-zA-Z]{2,}$") || tfEmail.getText().length() > 200){
                error = true;
                JOptionPane.showMessageDialog(rootPane, "Preencha o email (máx. 200 caractéres)");
            }
            if(tfEndereco.getText().isEmpty() || tfEndereco.getText().length() > 200){
                error = true;
                JOptionPane.showMessageDialog(rootPane, "Preencha o endereço (máx. 200 caractéres)");
            }
            if(cbCategoria.getSelectedItem() == null){
                error = true;
                JOptionPane.showMessageDialog(rootPane, "Escolha a categoria");
            }
            if(error == false){
                //salvar();
            }
        });
        
        btCancelar.addActionListener((ActionEvent e) -> {
            this.dispose();
        });
        
        
        
        
        
        //
        add(lbNome);
        add(lbTelefone);
        add(lbEmail);
        add(lbEndereco);
        add(lbCategoria);
        add(tfNome);
        add(tfTelefone);
        add(tfEmail);
        add(tfEndereco);
        add(cbCategoria);
        add(btSalvar);
        add(btCancelar);

        setSize(400,300); 
        setLocationRelativeTo(null);
    }
}
