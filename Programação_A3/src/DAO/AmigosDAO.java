
package DAO;

import Model.Amigos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rafae
 */

public class AmigosDAO {
    

        private ConectDAO conectDAO;
        
        public static ArrayList<Amigos> MinhaLista = new ArrayList<>();
    
        public AmigosDAO(){
            conectDAO = new conectDAO();
        }
        
        public int maiorID() throws SQLException {

        
        int maiorID = 0;
        try {
            Statement stmt = conectDAO.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_amigos");
            res.next();
            maiorID = res.getInt("id_amigo");

            stmt.close();

        } catch (SQLException ex) {
        }

        return maiorID;
    }

    // Retorna a Lista de Amigos(objetos)
    public ArrayList getMinhaLista() {
        
        MinhaLista.clear(); // Limpa nosso ArrayList

        try {
            Statement stmt = conectDAO.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos");
            while (res.next()) {

                int id_amigo = res.getInt("id_amigo");
                String nome = res.getString("nome");
                String telefone = res.getString("telefone");

                Amigos objamigo = new Amigos(nome, telefone, id_amigo);

                MinhaLista.add(objamigo);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MinhaLista;
    }

    // Cadastra novo Amigo
    public boolean InsertAmigoBD(Amigos objamigo) {
        String sql = "INSERT INTO tb_amigos(nome,telefone) VALUES(?,?)";

        try {
            PreparedStatement stmt = conectDAO.getConexao().prepareStatement(sql);

            stmt.setString(1, objamigo.getNome());
            stmt.setString(2, objamigo.getTelefone());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    // Deleta um Amigo específico pelo seu campo ID
    public boolean DeleteAmigoBD(int id) {
        try {
            Statement stmt = conectDAO.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_amigos WHERE id = " + id);
            stmt.close();            
            
        } catch (SQLException erro) {
        }
        
        return true;
    }

    // Edita um Amigo específico pelo seu campo ID
    public boolean UpdateAmigoBD(Amigos objamigo) {

        String sql = "UPDATE tb_amigos set nome = ? ,telefone = ? WHERE id_amigo = ?";

        try {
            PreparedStatement stmt = conectDAO.getConexao().prepareStatement(sql);

            stmt.setString(1, objamigo.getNome());
            stmt.setString(2, objamigo.getTelefone());
            stmt.setInt(3, objamigo.getId_amigo());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public Amigos carregaAmigo(int id) {
        
        Amigos objamigo = new Amigos();
        objamigo.setId_amigo(id);
        
        try {
            Statement stmt = conectDAO.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos WHERE id = " + id);
            res.next();

            objamigo.setNome(res.getString("nome"));
            objamigo.setTelefone(res.getString("telefone"));

            stmt.close();            
            
        } catch (SQLException erro) {
        }
        return objamigo;
    }

    private static class conectDAO extends ConectDAO {

        public conectDAO() {
        }
    }
}

