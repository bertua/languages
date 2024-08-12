/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Suporte
 */
public class Pedido {
    
    String sabor;
    String tamanho;
    String cliente;
    String endereco;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getCliente() {
        return cliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void Inserir(){
        Connection conn = Database.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO pedido (cliente, endereco, tamanho, sabor) VALUES (?,?,?,?)");
            stmt.setString(1, this.getCliente());
            stmt.setString(2, this.getEndereco());
            stmt.setString(3, this.getTamanho());
            stmt.setString(4, this.getSabor());
            
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
