
package pedido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TamanhoCad {

    private int id_tamanho;
    private String tamanho;
    private double preco;
    
    public int getId_tamanho() {
        return id_tamanho;
    }

    public void setId_tamanho(int id_tamanho) {
        this.id_tamanho = id_tamanho;
    }
    
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
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
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO tamanho (tamanho, preco) VALUES (?,?)");
            stmt.setString(1, this.getTamanho());
            stmt.setDouble(2, this.getPreco());
            
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<TamanhoCad> Listar(){
        Connection conn = Database.getConnection();
        ArrayList<TamanhoCad> list = new ArrayList<>();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM tamanho");
            ResultSet result = stmt.executeQuery();
            while(result.next()){
                TamanhoCad tamanhoCad = new TamanhoCad();
                tamanhoCad.setId_tamanho(result.getInt("id_tamanho"));
                tamanhoCad.setTamanho(result.getString("tamanho"));
                tamanhoCad.setPreco(result.getDouble("preco"));
                list.add(tamanhoCad);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SaborCad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
    }
}
