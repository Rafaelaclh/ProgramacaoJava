
package View;

import DAO.FerramentasDAO;
import Model.Ferramentas;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroFerramenta extends javax.swing.JFrame {

    private Ferramentas objeto;
    
    public CadastroFerramenta() {
        initComponents();
        this.objeto = new Ferramentas();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        v_ferramenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        v_marca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        v_custo = new javax.swing.JTextField();
        b_ferramenta = new javax.swing.JButton();
        b_sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 100, 100));
        jLabel1.setText("CADASTRO DE FERRAMENTAS");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        v_ferramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_ferramentaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Marca:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Custo de aquisição:");

        b_ferramenta.setBackground(new java.awt.Color(0, 100, 70));
        b_ferramenta.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        b_ferramenta.setText("Cadastrar ferramenta");
        b_ferramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ferramentaActionPerformed(evt);
            }
        });

        b_sair.setBackground(new java.awt.Color(0, 100, 70));
        b_sair.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        b_sair.setText("Sair");
        b_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_ferramenta)
                        .addGap(95, 95, 95)
                        .addComponent(b_sair))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(v_custo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(v_ferramenta, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                            .addComponent(v_marca))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(v_ferramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v_custo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_ferramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_sairActionPerformed
        this.dispose();
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
    }//GEN-LAST:event_b_sairActionPerformed

    private void v_ferramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_ferramentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v_ferramentaActionPerformed

    private void b_ferramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ferramentaActionPerformed
            try {
            // recebendo e validando dados da interface gráfica.
            String nome = "";
            String marca = "";
            double custo = 0;

            if (this.v_ferramenta.getText().length() < 2) {
                throw new Mensagem("O nome da ferramenta deve conter ao menos 3 caracteres.");
            } else {
                nome = this.v_ferramenta.getText();
            }

            if (this.v_marca.getText().length() < 2) {
                throw new Mensagem("A marca deve conter ao menos 2 caracteres.");
            } else {
                marca = v_marca.getText();
            }
            
            if (this.v_custo.getText().length() > 2) {
                throw new Mensagem("O valor deve ser número e maior que 0");
            } else {
                custo = Double.parseDouble( v_custo.getText());
            }
            
            // envia os dados para o Controlador cadastrar
            if (this.objeto.InsertFerramentaBD(nome, marca, custo)) {
                JOptionPane.showMessageDialog(rootPane, "Ferramenta Cadastrado com Sucesso!");

                // limpa campos da interface
                this.v_ferramenta.setText("");
                this.v_marca.setText("");
                this.v_custo.setText("");

            }

            System.out.println(this.objeto.getMinhaLista().toString());

        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        }catch (SQLException ex) {
            Logger.getLogger(CadastroAmigo.class.getName()).log(Level.SEVERE, null, ex);
        }     // TODO add your handling code here:   
    }//GEN-LAST:event_b_ferramentaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_ferramenta;
    private javax.swing.JButton b_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField v_custo;
    private javax.swing.JTextField v_ferramenta;
    private javax.swing.JTextField v_marca;
    // End of variables declaration//GEN-END:variables
}
