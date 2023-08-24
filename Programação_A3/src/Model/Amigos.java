
package Model;

import DAO.AmigosDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */

public class Amigos {
    
    private int id_amigo;
    private String nome;
    private String telefone;
    private final AmigosDAO dao; 
    
        public Amigos() {
        this.dao = new AmigosDAO();
    }
    
    public Amigos(String nome, String telefone, int id_amigo) {
        this.id_amigo = id_amigo;
        this.nome = nome;
        this.telefone = telefone;
        this.dao = new AmigosDAO();
    }

    public int getId_amigo() {
        return id_amigo;
    }

    public void setId_amigo(int id_amigo) {
        this.id_amigo = id_amigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

        public ArrayList getMinhaLista() {
        return dao.MinhaLista;
    }
    
    @Override
    public String toString() {
        return "\n ID_amigo: " + this.getId_amigo()
                + "\n Nome: " + this.getNome()
                + "\n Telefone: " + this.getTelefone()
                + "\n -----------";
    }
        

        // Cadastra novo aluno
    public boolean InsertAmigoBD(String nome, String telefone) throws SQLException {
        int id_amigo = this.maiorID() + 1;
        Amigos objamigo = new Amigos(nome, telefone, id_amigo);
        dao.InsertAmigoBD(objamigo);
        return true;
    }

    public boolean DeleteAmigoBD(int id_amigo) {
        dao.DeleteAmigoBD(id_amigo);
        return true;
    }

    public boolean UpdateAmigoBD(String nome, String telefone, int id_amigo) {
        Amigos objamigo = new Amigos(nome, telefone, id_amigo);
        dao.UpdateAmigoBD(objamigo);
        return true;
    }

    public Amigos carregaAmigo(int id_amigo) {
        dao.carregaAmigo(id_amigo);
        return null;
    }

    public int maiorID() throws SQLException {  
        return dao.maiorID();
    }
}


