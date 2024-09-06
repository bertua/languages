
package pedido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaborCad {

    private int id_sabor;
    private String sabor;
    private Double preco;
    
    public int getId_sabor() {
        return id_sabor;
    }

    public void setId_sabor(int id_sabor) {
        this.id_sabor = id_sabor;
    }
    
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public void Inserir(){
        Connection conn = Database.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO sabor (sabor, multiplicador) VALUES (?,?)");
            stmt.setString(1, this.getSabor());
            stmt.setString(2, this.getPreco().toString());
            
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<SaborCad> Listar(){
        Connection conn = Database.getConnection();
        ArrayList<SaborCad> list = new ArrayList<>();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM sabor");
            ResultSet result = stmt.executeQuery();
            while(result.next()){
                SaborCad saborCad = new SaborCad();
                saborCad.setId_sabor(result.getInt("id_sabor"));
                saborCad.setPreco(result.getDouble("multiplicador"));
                saborCad.setSabor(result.getString("sabor"));
                list.add(saborCad);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SaborCad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
    }

}
