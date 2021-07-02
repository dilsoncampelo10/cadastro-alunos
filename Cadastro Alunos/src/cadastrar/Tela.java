package cadastrar;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author dilson 07/05/2021
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Painel = new javax.swing.JPanel();
        txtMatr = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtCpf = new javax.swing.JLabel();
        txtSenha = new javax.swing.JLabel();
        fieldMatr = new javax.swing.JTextField();
        fieldNome = new javax.swing.JTextField();
        fieldEmail = new javax.swing.JTextField();
        fieldCpf = new javax.swing.JTextField();
        fieldSenha = new javax.swing.JPasswordField();
        mascu = new javax.swing.JRadioButton();
        femi = new javax.swing.JRadioButton();
        btnCad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setResizable(false);

        Painel.setBackground(new java.awt.Color(172, 188, 206));
        Painel.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));
        Painel.setForeground(new java.awt.Color(116, 152, 191));

        txtMatr.setText("Matricula");

        txtNome.setText("Nome");

        txtEmail.setText("Email");

        txtCpf.setText("Cpf");

        txtSenha.setText("Senha");

        buttonGroup1.add(mascu);
        mascu.setText("Masculino");

        buttonGroup1.add(femi);
        femi.setText("Feminino");

        btnCad.setText("Cadastrar");
        btnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatr)
                            .addComponent(txtNome)
                            .addComponent(txtEmail)
                            .addComponent(txtCpf)
                            .addComponent(txtSenha))
                        .addGap(18, 18, 18)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldMatr)
                            .addComponent(fieldNome)
                            .addComponent(fieldEmail)
                            .addComponent(fieldCpf)
                            .addComponent(fieldSenha)))
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addComponent(mascu)
                        .addGap(18, 18, 18)
                        .addComponent(femi)
                        .addGap(91, 91, 91)
                        .addComponent(btnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 53, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatr)
                    .addComponent(fieldMatr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf)
                    .addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha)
                    .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mascu)
                            .addComponent(femi))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                        .addComponent(btnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadActionPerformed
        Cadastro cadastro = new Cadastro();
        cadastro.setMatricula(fieldMatr.getText());
        cadastro.setNome(fieldNome.getText());
        cadastro.setEmail(fieldEmail.getText());
        cadastro.setCpf(fieldCpf.getText());
        cadastro.setSenha(fieldSenha.getText());
        cadastro.salvar();
        JOptionPane.showMessageDialog(rootPane, cadastro.salvar(), "Confirmado", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCadActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel;
    private javax.swing.JButton btnCad;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton femi;
    private javax.swing.JTextField fieldCpf;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldMatr;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JPasswordField fieldSenha;
    private javax.swing.JRadioButton mascu;
    private javax.swing.JLabel txtCpf;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtMatr;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtSenha;
    // End of variables declaration//GEN-END:variables
}
