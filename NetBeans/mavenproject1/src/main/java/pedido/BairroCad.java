/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class BairroCad {

    private int Id_bairro;
    private String bairro;
    private double preco;
    
    public int getId_bairro() {
        return Id_bairro;
    }

    public void setId_bairro(int Id_bairro) {
        this.Id_bairro = Id_bairro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void Inserir(){
        Connection conn = Database.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO bairro (bairro, preco) VALUES (?,?)",Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, this.getBairro());
            stmt.setDouble(2, this.getPreco());
            
            stmt.execute();
            ResultSet result = stmt.getGeneratedKeys();
            result.next();
            this.setId_bairro(result.getInt(1));
        } catch (SQLException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<BairroCad> Listar(){
        Connection conn = Database.getConnection();
        ArrayList<BairroCad> list = new ArrayList<>();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM bairro");
            ResultSet result = stmt.executeQuery();
            while(result.next()){
                BairroCad bairroCad = new BairroCad();
                bairroCad.setId_bairro(result.getInt("id_bairro"));
                bairroCad.setBairro(result.getString("bairro"));
                bairroCad.setPreco(result.getDouble("preco"));
                list.add(bairroCad);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BairroCad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
    }
    
    public static void Excluir(int id){
        Connection conn = Database.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM bairro WHERE id_bairro=?");
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SaborCad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Atualizar(){
        Connection conn = Database.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement("UPDATE bairro SET bairro = ?, preco = ? WHERE id_bairro = ?");
            stmt.setString(1, this.getBairro());
            stmt.setDouble(2, this.getPreco());
            stmt.setInt(3, this.getId_bairro());
            
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SaborCad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
