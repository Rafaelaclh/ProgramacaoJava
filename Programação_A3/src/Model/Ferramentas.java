
package Model;

import DAO.FerramentasDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */

public class Ferramentas {
    
    private int id_ferramenta;
    private String nome;
    private String marca;
    private double custo;
    private final FerramentasDAO dao;
    
        // Método Construtor de Objeto Vazio
    public Ferramentas() {
        this.dao = new FerramentasDAO(); // inicializado não importa em qual construtor
    }

 
    public Ferramentas(String nome, String marca, double custo, int id_ferramenta) {
        this.id_ferramenta = id_ferramenta;
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
        this.dao = new FerramentasDAO();
    }

    public int getId_ferramenta() {
        return id_ferramenta;
    }
    
    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public double getCusto() {
        return custo;
    }

    public void setID_ferramenta(int id_ferramenta) {
        this.id_ferramenta = id_ferramenta;
    }
       
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    
    public ArrayList getMinhaLista() {
        return FerramentasDAO.MinhaLista;
    }
 
    public boolean InsertFerramentaBD(String nome, String marca, double custo) throws SQLException {
        int id = this.maiorID() + 1;
        Ferramentas objeto = new Ferramentas(nome, marca, custo,id);
        dao.InsertFerramentaBD(objeto);
        return true;
    }

    public boolean DeleteFerramentaBD(int id_ferramenta) {
        dao.DeleteFerramentaBD(id_ferramenta);
        return true;
    }
    public boolean UpdateFerramentaBD(String nome, String marca, double custo, int id_ferramenta) {
        Ferramentas objeto = new Ferramentas(nome, marca, custo, id_ferramenta);
        dao.UpdateFerramentaBD(objeto);
        return true;
    }

    public Ferramentas carregaFerramenta(int id) {
        dao.carregaFerramenta(id);
        return null;
    }

    public int maiorID() throws SQLException {  
        return dao.maiorID();
    }

    public void setId_ferramenta(int id_ferramenta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }





    
}
