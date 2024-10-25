
package pedido;

import java.sql.Connection;
import java.sql.Timestamp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Pedido {

    private int id_pedido;
    private String cliente;
    private String endereco;
    private int id_bairro;
    private double valor;
    private ArrayList<ItensDoPedido> itens;
    private Timestamp data;

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
    
    public int getId_bairro() {
        return id_bairro;
    }

    public void setId_bairro(int id_bairro) {
        this.id_bairro = id_bairro;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public ArrayList<ItensDoPedido> getItens() {
        return itens;
    }
    
    public void setItens(ArrayList<ItensDoPedido> itens) {
        this.itens = itens;
    }
    
    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }
    
    public void Inserir(){
        Connection conn = Database.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO pedido (cliente, endereco, id_bairro, valor) VALUES (?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, this.getCliente());
            stmt.setString(2, this.getEndereco());
            stmt.setInt(3, this.getId_bairro());
            stmt.setDouble(4, this.getValor());
            
            stmt.execute();
            ResultSet result = stmt.getGeneratedKeys();
            result.next();
            this.setId_pedido(result.getInt(1));
            for(ItensDoPedido i : itens){
                PreparedStatement stmt2 = conn.prepareStatement("INSERT INTO itensdopedido (id_pedido, id_sabor, id_tamanho,valor) VALUES (?,?,?,?)");
                stmt2.setInt(1, this.getId_pedido());
                stmt2.setInt(2, i.getIdSabor());
                stmt2.setInt(3, i.getIdTamanho());
                stmt2.setDouble(4, i.getValor());
            
                stmt2.execute();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static ArrayList<Pedido> ListarGeral(){
        Connection conn = Database.getConnection();
        ArrayList<Pedido> list = new ArrayList<>();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM pedido");
            ResultSet result = stmt.executeQuery();
            while(result.next()){
                Pedido pedido = new Pedido();
                pedido.setId_pedido(result.getInt("id_bairro"));
                pedido.setCliente(result.getString("cliente"));
                pedido.setId_bairro(result.getInt("id_bairro"));
                pedido.setEndereco(result.getString("endereco"));
                pedido.setValor(result.getDouble("valor"));
                pedido.setData(result.getTimestamp("data"));
                list.add(pedido);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BairroCad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
    }
    
    public static ArrayList<Pedido> ListarDia(Timestamp data){
        Connection conn = Database.getConnection();
        ArrayList<Pedido> list = new ArrayList<>();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM pedido WHERE DATE(data)=DATE(?)");
            stmt.setTimestamp(1, data);
            ResultSet result = stmt.executeQuery();
            while(result.next()){
                Pedido pedido = new Pedido();
                pedido.setId_pedido(result.getInt("id_bairro"));
                pedido.setCliente(result.getString("cliente"));
                pedido.setId_bairro(result.getInt("id_bairro"));
                pedido.setEndereco(result.getString("endereco"));
                pedido.setValor(result.getDouble("valor"));
                pedido.setData(result.getTimestamp("data"));
                list.add(pedido);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BairroCad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
    }

    
    
}
