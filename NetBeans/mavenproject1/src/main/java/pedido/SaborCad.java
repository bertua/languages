
package pedido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO sabor (sabor, multiplicador) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, this.getSabor());
            stmt.setString(2, this.getPreco().toString());
            
            stmt.execute();
            ResultSet result = stmt.getGeneratedKeys();
            result.next();
            this.setId_sabor(result.getInt(1));
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
    
    public static void Excluir(int id){
        Connection conn = Database.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM sabor WHERE id_sabor=?");
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SaborCad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Atualizar(){
        Connection conn = Database.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement("UPDATE sabor SET sabor = ?, multiplicador = ? WHERE id_sabor = ?");
            stmt.setString(1, this.getSabor());
            stmt.setDouble(2, this.getPreco());
            stmt.setInt(3, this.getId_sabor());
            
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SaborCad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

}
