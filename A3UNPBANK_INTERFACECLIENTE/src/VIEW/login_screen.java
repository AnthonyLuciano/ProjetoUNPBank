package VIEW;

import DAO.ContaDAO;
import DTO.ContaDTO;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.UIManager;
import raven.toast.Notifications;

/**
 * @author tosca
 */
public class login_screen extends javax.swing.JFrame {

    public login_screen() {
        initComponents();
        init();
    }

    Main main = new Main();

    public void close() {
        new Main().setVisible(true);
        this.setVisible(false);

    }

    private void init() {
        Notifications.getInstance().setJFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtIDLogar = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtSenhaLogar = new javax.swing.JPasswordField();
        jPanel8 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnLogar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acesso");
        setResizable(false);

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 0));

        jPanel4.setPreferredSize(new java.awt.Dimension(400, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Bem-vindo de volta!");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Import_resized (1).png"))); // NOI18N
        jButton1.setText("Entre com o seu ID");
        jButton1.setPreferredSize(new java.awt.Dimension(250, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jPanel2.add(jPanel1);

        jPanel5.setPreferredSize(new java.awt.Dimension(400, 100));

        jPanel6.setPreferredSize(new java.awt.Dimension(250, 40));
        jPanel6.setLayout(new java.awt.BorderLayout(4, 4));

        jLabel3.setText("ID Address");
        jPanel6.add(jLabel3, java.awt.BorderLayout.PAGE_START);
        jPanel6.add(txtIDLogar, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6);

        jPanel7.setPreferredSize(new java.awt.Dimension(250, 40));
        jPanel7.setLayout(new java.awt.BorderLayout(4, 4));

        jLabel4.setText("Senha");
        jPanel7.add(jLabel4, java.awt.BorderLayout.PAGE_START);
        jPanel7.add(txtSenhaLogar, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel7);

        jPanel2.add(jPanel5);

        jPanel8.setPreferredSize(new java.awt.Dimension(250, 25));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jCheckBox1.setText("Manter sessão");
        jCheckBox1.setPreferredSize(new java.awt.Dimension(120, 24));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel8.add(jCheckBox1, java.awt.BorderLayout.WEST);

        jLabel2.setForeground(new java.awt.Color(242, 106, 21));
        jLabel2.setText("Esqueceu sua senha?");
        jPanel8.add(jLabel2, java.awt.BorderLayout.EAST);

        jPanel2.add(jPanel8);

        jPanel9.setPreferredSize(new java.awt.Dimension(400, 50));

        btnLogar.setText("Entrar");
        btnLogar.setPreferredSize(new java.awt.Dimension(250, 30));
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });
        jPanel9.add(btnLogar);

        jPanel2.add(jPanel9);

        getContentPane().add(jPanel2, java.awt.BorderLayout.WEST);

        jPanel3.setToolTipText("");
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 400));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0);
        flowLayout1.setAlignOnBaseline(true);
        jPanel3.setLayout(flowLayout1);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/unpbank__3__resized-removebg-preview.png"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(450, 400));
        jPanel3.add(jLabel6);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        Logar();


    }//GEN-LAST:event_btnLogarActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        FlatRobotoFont.install();
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField txtIDLogar;
    private javax.swing.JPasswordField txtSenhaLogar;
    // End of variables declaration//GEN-END:variables

    private void Logar() {
        try {
            String id_conta = txtIDLogar.getText();
            String senha_conta = txtSenhaLogar.getText();

            ContaDTO objcontadto;
            objcontadto = new ContaDTO();
            objcontadto.setId_conta(id_conta);
            objcontadto.setSenha_conta(senha_conta);

            ContaDAO objcontadao = new ContaDAO();
            ResultSet rscontadao = objcontadao.autenticacaoUsuario(objcontadto);
            if (rscontadao.next()) {
                dispose();
                main.setVisible(true);
                main.pack();
                main.setLocationRelativeTo(null);
                main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                main.txtID.setText(id_conta);

                try {
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, "Login realizado com sucesso!");
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                //enviar mensagem dizendo incorreto

                JOptionPane.showMessageDialog(null, "Conta ID ou senha inválidos");

            }

        } catch (SQLException Erro) {
            JOptionPane.showMessageDialog(null, "LOGIN_SCREEN" + Erro);
        }

    }

}
