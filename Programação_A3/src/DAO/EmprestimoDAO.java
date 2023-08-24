/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Emprestimo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class EmprestimoDAO {
    

        private ConectDAO conectDAO;
        
        public static ArrayList<Emprestimo> MinhaLista = new ArrayList<>();
    
        public EmprestimoDAO(){
            conectDAO = new conectDAO();
        }
        
        public int maiorID() throws SQLException {

        
        int maiorID = 0;
        try {
            Statement stmt = conectDAO.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_emprestimo");
            res.next();
            maiorID = res.getInt("id_emprestimo");

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
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimo");
            while (res.next()) {

                int id_emprestimo = res.getInt("id_emprestimo");
                String data_emprestimo = res.getString("data_empretimo");
                String data_devolucao = res.getString("data-devolucao");

                Emprestimo objeto = new Emprestimo(data_emprestimo, data_devolucao, id_emprestimo);

                MinhaLista.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MinhaLista;
    }

    // Cadastra novo Amigo
    public boolean InsertEmprestimoBD(Emprestimo objeto) {
        String sql = "INSERT INTO tb_emprestimo(id_emprestimo,data_emprestimo,data-devolucao) VALUES(?,?,?)";

        try {
            PreparedStatement stmt = conectDAO.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId_emprestimo());
            stmt.setString(2, objeto.getData_emprestimo());
            stmt.setString(3, objeto.getData_devolucao());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    // Deleta um Amigo específico pelo seu campo ID
    public boolean DeleteEmprestimoBD(int id) {
        try {
            Statement stmt = conectDAO.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_emprestimo WHERE id = " + id);
            stmt.close();            
            
        } catch (SQLException erro) {
        }
        
        return true;
    }

    // Edita um Amigo específico pelo seu campo ID
    public boolean UpdateEmprestimoBD(Emprestimo objeto) {

        String sql = "UPDATE tb_emprestimo set data_emprestimo = ? ,data-devolucao = ? WHERE id_emprestimo = ?";

        try {
            PreparedStatement stmt = conectDAO.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getData_emprestimo());
            stmt.setString(2, objeto.getData_devolucao());
            stmt.setInt(3, objeto.getId_emprestimo());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public Emprestimo carregaEmprestimo(int id) {
        
        Emprestimo objeto = new Emprestimo();
        objeto.setId_emprestimo(id);
        
        try {
            Statement stmt = conectDAO.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimo WHERE id = " + id);
            res.next();

            objeto.setData_emprestimo(res.getString("data_emprestimo"));
            objeto.setData_devolucao(res.getString("data-devolucao"));

            stmt.close();            
            
        } catch (SQLException erro) {
        }
        return objeto;
    }

    private static class conectDAO extends ConectDAO {

        public conectDAO() {
        }
    }
}
