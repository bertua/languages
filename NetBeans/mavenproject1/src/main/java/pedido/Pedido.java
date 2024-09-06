
package pedido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Pedido {

    private int id_pedido;
    private String cliente;
    private String endereco;
    private String bairro;

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getCliente() {
        return cliente;
    }
    
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public void Inserir(){
        Connection conn = Database.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO pedido (cliente, endereco, bairro) VALUES (?,?,?)");
            stmt.setString(1, this.getCliente());
            stmt.setString(2, this.getEndereco());
            stmt.setString(3, this.getBairro());
            
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
//    public void InserirItens(){
//        Connection conn = Database.getConnection();
//        try {
//            PreparedStatement stmt = conn.prepareStatement("SELECT id_sabor FROM sabor where sabor= ");
//            ResultSet result = stmt.executeQuery();
//            while(result.next()){
//                SaborCad saborCad = new SaborCad();
//                saborCad.setId_sabor(result.getInt("id_sabor"));
//                saborCad.setPreco(result.getDouble("multiplicador"));
//                saborCad.setSabor(result.getString("sabor"));
//                list.add(saborCad);
//            }
//        } catch (SQLException ex) {
//           Logger.getLogger(SaborCad.class.getName()).log(Level.SEVERE, null, ex);
//       }
//        
//        
//        try {
//            PreparedStatement stmt = conn.prepareStatement("INSERT INTO itensdopedido (id_pedido, id_sabor, id_tamanho, valor) VALUES (?,?,?,?)");
//            stmt.setString(1, this.getCliente());
//
//            stmt.execute();
//        } catch (SQLException ex) {
//            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
}
