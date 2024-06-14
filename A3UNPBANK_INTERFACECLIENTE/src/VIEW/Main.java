package VIEW;

import DAO.ContaCorrenteDAO;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Font;
import javax.swing.UIManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 * @author tosca
 */
public class Main extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    private ContaCorrenteDAO ContaCorrenteDAO;

    public Main() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/unpbank", "root", "password");
            ContaCorrenteDAO = new ContaCorrenteDAO(conn);
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTransfer = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lbID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lbValor = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txtSaldo = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIDDestino = new javax.swing.JTextField();
        txtValorTrans = new javax.swing.JTextField();
        Valor = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnTransfer.setText("Transferir");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        jButton2.setText("Depositar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Sacar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lbID.setText("ID Conta");

        txtID.setEditable(false);
        txtID.setBorder(null);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        lbValor.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbValor.setText("Valor");

        jButton4.setBackground(new java.awt.Color(242, 242, 242));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8-eye-24.png"))); // NOI18N
        jButton4.setText("Ver Saldo");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtSaldo.setEditable(false);
        txtSaldo.setBorder(null);

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        jLabel5.setText("ID Destinatário");

        txtValorTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTransActionPerformed(evt);
            }
        });

        Valor.setText("Valor");

        Logout.setBackground(new java.awt.Color(242, 242, 242));
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8-log-out-32.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.setBorder(null);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/logo1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Logout)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(txtSaldo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton4))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbID)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtID))))
                        .addContainerGap(280, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(lbValor))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtValorTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIDDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnTransfer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(43, 43, 43)
                                            .addComponent(jLabel5))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(69, 69, 69)
                                            .addComponent(Valor)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(lbValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIDDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Valor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTransfer)
                .addGap(40, 40, 40)
                .addComponent(Logout)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        realizarDeposito();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        realizarSaque();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void txtValorTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTransActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorTransActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        realizarTransferencia();
    }//GEN-LAST:event_btnTransferActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        consultarSaldo();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        login_screen objlogin_screen = new login_screen();
        objlogin_screen.setVisible(true);
        dispose();             
    }//GEN-LAST:event_LogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMacLightLaf.setup();
        FlatRobotoFont.install();
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout;
    private javax.swing.JLabel Valor;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbValor;
    public javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDDestino;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValorTrans;
    // End of variables declaration//GEN-END:variables

    public double getSaldo(int id) {
        String url = "jdbc:mysql://localhost:3306/unpbank";
        String user = "root";
        String password = "password";

        String query = "select saldo_cliente FROM contacorrente WHERE id_conta = ?";

        try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, id);
            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()) {
                return resultSet.getDouble("saldo_cliente");
            }
        } catch (SQLException e) {
        }
        return 0.0;
    }

    private void consultarSaldo() {
        try {

            int id = Integer.parseInt(txtID.getText());
            double saldo = getSaldo(id);
            txtSaldo.setText(String.valueOf(saldo));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um ID válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void realizarSaque() {
        try {
            int id = Integer.parseInt(txtID.getText());
            double valor = Double.parseDouble(txtValor.getText());

            boolean sucesso = ContaCorrenteDAO.sacar(id, valor);
            if (sucesso) {
                double saldo = getSaldo(id);
                txtSaldo.setText(String.valueOf(saldo));
                JOptionPane.showMessageDialog(this, "Saque realizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Saque não permitido. Verifique o valor do saque e o status da conta.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void realizarDeposito() {
        try {
            int id = Integer.parseInt(txtID.getText());
            double valor = Double.parseDouble(txtValor.getText());

            boolean sucesso = ContaCorrenteDAO.depositar(id, valor);
            if (sucesso) {
                double saldo = getSaldo(id);
                txtSaldo.setText(String.valueOf(saldo));
                JOptionPane.showMessageDialog(this, "Depósito realizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Depósito não permitido. Verifique o valor do depósito.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void realizarTransferencia() {
        try {
            int id = Integer.parseInt(txtID.getText());
            int idDestino = Integer.parseInt(txtIDDestino.getText());
            double valor = Double.parseDouble(txtValorTrans.getText());

            boolean sucesso = ContaCorrenteDAO.transferir(id, idDestino, valor);
            if (sucesso) {
                double saldo = getSaldo(id);
                txtSaldo.setText(String.valueOf(saldo));
                JOptionPane.showMessageDialog(this, "Transferência realizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Transferência não permitida. Verifique o valor da transferência e os IDs das contas.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

}
