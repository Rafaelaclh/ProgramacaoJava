/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.FerramentasDAO;
import static DAO.FerramentasDAO.MinhaLista;
import Model.Ferramentas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafae
 */
public class GerenciarFerramenta extends javax.swing.JFrame {

    private Ferramentas objeto;
    /**
     * Creates new form GerenciarFerramenta
     */
    public GerenciarFerramenta() {
        initComponents();
        this.objeto = new Ferramentas();
        this.carregaTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
            public void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) this.jTableFerramenta.getModel();
        modelo.setNumRows(0);
        
        FerramentasDAO amigoDAO = new FerramentasDAO();
        amigoDAO.getMinhaLista();

        for (Ferramentas a : MinhaLista) {
            modelo.addRow(new Object[]{
                a.getId_ferramenta(),
                a.getNome(),
                a.getMarca(),
                a.getCusto(),
            });
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFerramenta = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        v_ferramenta = new javax.swing.JTextField();
        v_marca = new javax.swing.JTextField();
        v_custo = new javax.swing.JTextField();
        b_alterar = new javax.swing.JButton();
        b_apagar = new javax.swing.JButton();
        b_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 100, 100));
        jLabel1.setText("Gerenciar ferramentas:");

        jTableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id:", "Ferramenta:", "Marca:", "Custo:"
            }
        ));
        jTableFerramenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFerramentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFerramenta);

        jLabel2.setText("Ferramenta:");

        jLabel3.setText("Marca:");

        jLabel4.setText("Custo:");

        v_ferramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_ferramentaActionPerformed(evt);
            }
        });

        b_alterar.setBackground(new java.awt.Color(0, 100, 70));
        b_alterar.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        b_alterar.setText("Alterar");
        b_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_alterarActionPerformed(evt);
            }
        });

        b_apagar.setBackground(new java.awt.Color(0, 100, 70));
        b_apagar.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        b_apagar.setText("Apagar");
        b_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_apagarActionPerformed(evt);
            }
        });

        b_voltar.setBackground(new java.awt.Color(0, 100, 70));
        b_voltar.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        b_voltar.setText("Sair");
        b_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4))
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(v_ferramenta, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(v_custo))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)
                            .addGap(29, 29, 29)
                            .addComponent(v_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(b_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(v_ferramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(v_custo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void v_ferramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_ferramentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v_ferramentaActionPerformed

    private void b_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_alterarActionPerformed
        try {
            // recebendo e validando dados da interface gráfica.
            int id = 0;
            String nome = "";
            String marca = "";
            double custo = 0;

            if (this.v_ferramenta.getText().length() < 2) {
                throw new Mensagem("O nome da ferramenta deve conter ao menos 2 caracteres.");
            } else {
                nome = v_ferramenta.getText();
            }
            if (this.v_marca.getText().length() < 3) {
                throw new Mensagem("Marca deve conter ao menos 3 caracteres.");
            } else {
                marca = v_marca.getText();
            }
            if (this.v_custo.getText().length() < 0) {
                throw new Mensagem("Custo deve ser numero e maior que zero");
            } else {
                custo = Double.parseDouble(v_custo.getText());
            }
            if (this.jTableFerramenta.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro Selecione uma ferramenta para Alterar");
            } else {
                id = Integer.parseInt(this.jTableFerramenta.getValueAt(this.jTableFerramenta.getSelectedRow(), 0).toString());
            }

            if (this.objeto.UpdateFerramentaBD(nome, marca, custo, id)) {

                JOptionPane.showMessageDialog(rootPane, "Ferramenta alterada com Sucesso!");
                this.v_ferramenta.setText("");
                this.v_marca.setText("");
                this.v_custo.setText("");
            }

            System.out.println(this.objeto.getMinhaLista().toString());

        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        } finally {
            carregaTabela(); // atualiza a tabela.
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b_alterarActionPerformed

    private void b_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_voltarActionPerformed
        this.dispose();
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_b_voltarActionPerformed

    private void jTableFerramentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFerramentaMouseClicked
        String nome = this.jTableFerramenta.getValueAt(this.jTableFerramenta.getSelectedRow(),1).toString();
        String marca = this.jTableFerramenta.getValueAt(this.jTableFerramenta.getSelectedRow(),2).toString();
        String custo = this.jTableFerramenta.getValueAt(this.jTableFerramenta.getSelectedRow(),3).toString();

        this.v_ferramenta.setText(nome);
        this.v_marca.setText(marca);
        this.v_custo.setText(custo);      // TODO add your handling code here:
    }//GEN-LAST:event_jTableFerramentaMouseClicked

    private void b_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_apagarActionPerformed
        try {
            // validando dados da interface gráfica.
            int id = 0;
            if (this.jTableFerramenta.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro Selecione uma Ferramenta para APAGAR");
            } else {
                id = Integer.parseInt(this.jTableFerramenta.getValueAt(this.jTableFerramenta.getSelectedRow(), 0).toString());
            }

            // retorna 0 -> primeiro botão | 1 -> segundo botão | 2 -> terceiro botão
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR esta Ferramenta ?");

            if (resposta_usuario == 0) {// clicou em SIM

                if (this.objeto.DeleteFerramentaBD(id)) {

                    // limpa os campos
                    this.v_ferramenta.setText("");
                    this.v_marca.setText("");
                    this.v_custo.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Ferramenta Apagada com Sucesso!");

                }
            }

            System.out.println(this.objeto.getMinhaLista().toString());

        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabela();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b_apagarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GerenciarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_alterar;
    private javax.swing.JButton b_apagar;
    private javax.swing.JButton b_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFerramenta;
    private javax.swing.JTextField v_custo;
    private javax.swing.JTextField v_ferramenta;
    private javax.swing.JTextField v_marca;
    // End of variables declaration//GEN-END:variables
}
