/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Viewo;

import Controllero.*;
import Modelo.*;
import Viewo.*;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class frmCadSol extends javax.swing.JFrame {

    /**
     * Creates new form frmCadSol
     */
    public frmCadSol() {
        initComponents();
        this.setLocationRelativeTo(null); 
        getRootPane().setDefaultButton(btnCadastrar);  
    }

    ctrlCadFuncionario ccf = new ctrlCadFuncionario();
    CadFuncionario cf = new CadFuncionario();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        tSenha2 = new javax.swing.JPasswordField();
        tSenha = new javax.swing.JPasswordField();
        btnCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tEmail = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        tLogin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        tMatricula = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        tSetor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tAndar = new javax.swing.JFormattedTextField();
        tRamal = new javax.swing.JFormattedTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirme sua senha");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        tSenha2.setForeground(new java.awt.Color(51, 51, 51));
        tSenha2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        getContentPane().add(tSenha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 263, -1));

        tSenha.setForeground(new java.awt.Color(51, 51, 51));
        tSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        tSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tSenhaFocusGained(evt);
            }
        });
        getContentPane().add(tSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 263, -1));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Solicitante");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        tNome.setForeground(new java.awt.Color(51, 51, 51));
        tNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        tNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tNomeFocusGained(evt);
            }
        });
        getContentPane().add(tNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 263, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E-mail");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        tEmail.setForeground(new java.awt.Color(51, 51, 51));
        tEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        getContentPane().add(tEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 263, -1));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 630, 1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Login");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        tLogin.setForeground(new java.awt.Color(51, 51, 51));
        tLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(160, 235, 175)));
        tLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tLoginFocusLost(evt);
            }
        });
        getContentPane().add(tLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 263, 27));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Senha");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 630, 1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Matrícula");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        tMatricula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        tMatricula.setForeground(new java.awt.Color(51, 51, 51));
        try {
            tMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/######-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 263, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Setor");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, -1, -1));

        tSetor.setForeground(new java.awt.Color(51, 51, 51));
        tSetor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        getContentPane().add(tSetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 263, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ramal");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Andar");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, -1, -1));

        tAndar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        tAndar.setForeground(new java.awt.Color(51, 51, 51));
        try {
            tAndar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tAndar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 263, -1));

        tRamal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        tRamal.setForeground(new java.awt.Color(51, 51, 51));
        try {
            tRamal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tRamal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 263, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 630, 1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/solic.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tSenhaFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_tSenhaFocusGained

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(tNome.getText().equals("")||tEmail.getText().equals("")||tLogin.getText().equals("")||tSenha.getText().equals("")||tSenha2.getText().equals("")||tMatricula.getText().equals("")||tSetor.getText().equals("")||tRamal.getText().equals("")||tAndar.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }else{
            if(tSenha.getText().equals(tSenha2.getText())){

                if(ccf.loginFuncionario(tLogin.getText()) == 506){
                    JOptionPane.showMessageDialog(null,"Login já cadastrado!!", "Falha no cadastro", JOptionPane.ERROR_MESSAGE);

                }else{

                    cf.setNome(tNome.getText());
                    cf.setEmail(tEmail.getText());
                    cf.setLogin(tLogin.getText());
                    cf.setSenha(tSenha.getText());
                    cf.setId(ccf.idFuncionario());
                    cf.setMatricula(tMatricula.getText());
                    cf.setSetor(tSetor.getText());
                    cf.setRamal(Integer.parseInt(tRamal.getText()));
                    cf.setAndar(Integer.parseInt(tAndar.getText()));
                    
                    JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
                    ccf.cadastrarSolicitante();
                    
                    tNome.setText("");
                    tEmail.setText("");
                    tLogin.setText("");
                    tSenha.setText("");
                    tSenha2.setText("");
                    tMatricula.setText("");
                    tSetor.setText("");
                    tRamal.setText("");
                    tAndar.setText("");
                }}
                else
                JOptionPane.showMessageDialog(null,"As senhas não correspondem", "Erro", JOptionPane.ERROR_MESSAGE);
            }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tLoginFocusLost

        if(ccf.loginFuncionario(tLogin.getText()) == 506){
            tLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(254,133,128)));

        }else
        tLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(160,235,175)));

    }//GEN-LAST:event_tLoginFocusLost

    private void tNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tNomeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tNomeFocusGained

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
            java.util.logging.Logger.getLogger(frmCadSol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadSol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadSol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadSol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadSol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JFormattedTextField tAndar;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tLogin;
    private javax.swing.JFormattedTextField tMatricula;
    private javax.swing.JTextField tNome;
    private javax.swing.JFormattedTextField tRamal;
    private javax.swing.JPasswordField tSenha;
    private javax.swing.JPasswordField tSenha2;
    private javax.swing.JTextField tSetor;
    // End of variables declaration//GEN-END:variables
}
