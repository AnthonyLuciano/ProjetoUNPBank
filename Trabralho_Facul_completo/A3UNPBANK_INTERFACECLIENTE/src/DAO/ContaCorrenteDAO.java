
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContaCorrenteDAO {
    private Connection conn;

    public ContaCorrenteDAO(Connection conn) {
        this.conn = conn;
    }

    public boolean sacar(int id, double valor) {
    String selectQuery = "SELECT saldo_cliente FROM contacorrente WHERE id_conta = ?";
    String updateQuery = "UPDATE contacorrente SET saldo_cliente = ? WHERE id_conta = ?";

    try (PreparedStatement selectStatement = conn.prepareStatement(selectQuery)) {
        selectStatement.setInt(1, id);
        ResultSet resultSet = selectStatement.executeQuery();

        if (resultSet.next()) {
            double saldoAtual = resultSet.getDouble("saldo_cliente");

            if (valor > 0 && valor <= saldoAtual) {
                double novoSaldo = saldoAtual - valor;

                try (PreparedStatement updateStatement = conn.prepareStatement(updateQuery)) {
                    updateStatement.setDouble(1, novoSaldo);
                    updateStatement.setInt(2, id);
                    updateStatement.executeUpdate();
                    System.out.println("Saque realizado com sucesso!");
                    return true;
                }
            } else {
                System.out.println("Saque não permitido. Verifique o valor do saque e o status da conta.");
            }
        } else {
            System.out.println("Conta não encontrada.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}
     public boolean depositar(int id, double valor) {
        String selectQuery = "SELECT saldo_cliente FROM contacorrente WHERE id_conta = ?";
        String updateQuery = "UPDATE contacorrente SET saldo_cliente = ? WHERE id_conta = ?";

        try (PreparedStatement selectStatement = conn.prepareStatement(selectQuery)) {
            selectStatement.setInt(1, id);
            ResultSet resultSet = selectStatement.executeQuery();

            if (resultSet.next()) {
                double saldoAtual = resultSet.getDouble("saldo_cliente");

                if (valor > 0) {
                    double novoSaldo = saldoAtual + valor;

                    try (PreparedStatement updateStatement = conn.prepareStatement(updateQuery)) {
                        updateStatement.setDouble(1, novoSaldo);
                        updateStatement.setInt(2, id);
                        updateStatement.executeUpdate();
                        System.out.println("Depósito realizado com sucesso!");
                        return true;
                    }
                } else {
                    System.out.println("Depósito não permitido. Verifique o valor do depósito.");
                }
            } else {
                System.out.println("Conta não encontrada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
     public boolean transferir(int idOrigem, int idDestino, double valor) {
        try {
            conn.setAutoCommit(false); // Inicia a transação

            boolean saqueRealizado = sacar(idOrigem, valor);
            if (saqueRealizado) {
                boolean depositoRealizado = depositar(idDestino, valor);
                if (depositoRealizado) {
                    conn.commit(); // Confirma a transação
                    System.out.println("Transferência realizada com sucesso!");
                    return true;
                } else {
                    conn.rollback(); // Reverte a transação em caso de erro no depósito
                }
            } else {
                conn.rollback(); // Reverte a transação em caso de erro no saque
            }
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                conn.rollback(); // Reverte a transação em caso de erro
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                conn.setAutoCommit(true); // Restaura o modo de confirmação automática
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}