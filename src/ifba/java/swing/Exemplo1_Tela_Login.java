package ifba.java.swing;

import javax.swing.JOptionPane;

/**
 *
 * @author michel
 */
// Estende de uma classe abstrata do pacote swing, isso é herança.
public class Exemplo1_Tela_Login extends javax.swing.JFrame {

    //FORAM CRIADAS DUAS VARIÁVEIS REFERENTES AOS CAMPOS DE ENTRADA.
    private String login;
    private String senha;

    //CONSTRUTOR DESTA CLASSE SENDO INICIALIZADO
    public Exemplo1_Tela_Login() {
        initComponents();
    }
    //METODO RESPONSAVEL POR PEGAR O CAMPO TEXTO DA TELA E ATRIBUIR AS VARIAVEIS GLOBAIS.
    private void formParaObjeto() {
        this.login = CampoLogin.getText();
        this.senha = CampoSenha.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Login = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        CampoLogin = new javax.swing.JTextField();
        CampoSenha = new javax.swing.JTextField();
        BotaoCancelar = new javax.swing.JButton();
        BotaoConfirmar = new javax.swing.JButton();
        Imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Login.setText("Login:");

        Senha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Senha.setText("Senha:");

        CampoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoLoginActionPerformed(evt);
            }
        });

        CampoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSenhaActionPerformed(evt);
            }
        });

        BotaoCancelar.setText("Cancelar");
        BotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarActionPerformed(evt);
            }
        });

        BotaoConfirmar.setText("Confirmar");
        BotaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConfirmarActionPerformed(evt);
            }
        });

        Imagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagem.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Login)
                                    .addGap(23, 23, 23))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Senha)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CampoLogin)
                                .addComponent(CampoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(BotaoCancelar)
                            .addGap(59, 59, 59)
                            .addComponent(BotaoConfirmar)))
                    .addComponent(Imagem))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login)
                    .addComponent(CampoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Senha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoConfirmar)
                    .addComponent(BotaoCancelar))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoLoginActionPerformed

    private void CampoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoSenhaActionPerformed

    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoCancelarActionPerformed

    private void BotaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConfirmarActionPerformed
        // MÉTODO RESPONSÁVEL PELA AÇÃO DO BOTÃO CONFIRMAR, AO CLICAR EXECUTA O QUE ESTÁ DENTRO DO MÉTODO.
        this.formParaObjeto();
        JOptionPane.showMessageDialog(this, "Olá " + this.login);
    }//GEN-LAST:event_BotaoConfirmarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Exemplo1_Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo1_Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo1_Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo1_Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo1_Tela_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoConfirmar;
    private javax.swing.JTextField CampoLogin;
    private javax.swing.JTextField CampoSenha;
    private javax.swing.JLabel Imagem;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Senha;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
