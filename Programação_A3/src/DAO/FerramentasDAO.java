
package DAO;

import Model.Ferramentas;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rafae
 */

public class FerramentasDAO {

    public static ArrayList<Ferramentas> MinhaLista = new ArrayList<>();
    
    private ConectDAO conectDAO;
    
    public FerramentasDAO(){
        conectDAO = new ConectDAO();
    }
    
        public int maiorID() throws SQLException {

        int maiorID = 0;
        try {
            Statement stmt = conectDAO.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_ferramentas");
            res.next();
            maiorID = res.getInt("id_ferramenta");

            stmt.close();

        } catch (SQLException ex) {
        }

        return maiorID;
    }

    // Retorna a Lista de Ferramentas(objetos)
    public ArrayList getMinhaLista() {
        
        MinhaLista.clear(); // Limpa nosso ArrayList

        try {
            Statement stmt = conectDAO.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas");
            while (res.next()) {

                int id_ferramenta = res.getInt("id_ferramenta");
                String nome = res.getString("nome");
                String marca = res.getString("marca");
                double custo = res.getDouble("custo");


                Ferramentas objeto = new Ferramentas(nome, marca, custo, id_ferramenta);

                MinhaLista.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MinhaLista;
    }

    // Cadastra novo aluno
    public boolean InsertFerramentaBD(Ferramentas objeto) {
        String sql = "INSERT INTO tb_ferramentas(nome,marca,custo) VALUES(?,?,?)";

        try {
            PreparedStatement stmt = conectDAO.getConexao().prepareStatement(sql);


            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getMarca());
            stmt.setDouble(3, objeto.getCusto());
            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    // Deleta um aluno específico pelo seu campo ID
    public boolean DeleteFerramentaBD(int id_ferramenta) {
        try {
            Statement stmt = conectDAO.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_ferramentas WHERE id = " + id_ferramenta);
            stmt.close();            
            
        } catch (SQLException erro) {
        }
        
        return true;
    }

    // Edita um aluno específico pelo seu campo ID
    public boolean UpdateFerramentaBD(Ferramentas objeto) {

        String sql = "UPDATE tb_ferramentas set nome = ? ,marca = ?, custo = ? WHERE id_ferramenta = ?";

        try {
            PreparedStatement stmt = conectDAO.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getMarca());
            stmt.setDouble(3, objeto.getCusto());
            stmt.setInt(4, objeto.getId_ferramenta());
            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public Ferramentas carregaFerramenta(int id_ferramenta) {
        
        Ferramentas objeto = new Ferramentas();
        objeto.setId_ferramenta(id_ferramenta);
        
        try {
            Statement stmt = conectDAO.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas WHERE id = " + id_ferramenta);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setMarca(res.getString("marca"));
            objeto.setCusto(res.getDouble("custo"));

            stmt.close();            
            
        } catch (SQLException erro) {
        }
        return objeto;
    }
}

