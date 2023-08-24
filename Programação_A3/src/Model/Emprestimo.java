
package Model;

/**
 *
 * @author rafae
 */
public class Emprestimo {
    
    private int id_emprestimo;
    private String data_emprestimo;
    private String data_devolucao;


    public Emprestimo(int id_emprestimo, String data_emprestimo, String data_devolucao) {
        this.id_emprestimo = id_emprestimo;
        this.data_emprestimo = data_emprestimo;
        this.data_devolucao = data_devolucao;
    }

    public Emprestimo(String data_emprestimo, String data_devolucao, int id_emprestimo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Emprestimo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId_emprestimo() {
        return id_emprestimo;
    }

    public void setId_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }

    public String getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }


    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public boolean InsertEmprestimoBD(String data_emprestimo, String data_devolucao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getMinhaLista() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
