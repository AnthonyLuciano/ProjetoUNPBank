import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Pesquisar {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Conexão com o banco de dados
        // Colocar As informações do MySQL e DataBase
        //serio, coloque
        String url = "jdbc:mysql://localhost:3306/Database";
        String username = "(Login)";
        String password = "(senha)";

        // Inicializa o scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a opção de pesquisa:");
        System.out.println("1 - Nome");
        System.out.println("2 - CPF");
        System.out.println("3 - ID");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        // Variáveis para armazenar o campo e o valor de pesquisa
        String campo = "";
        String valor = "";

        // Seleciona o campo de pesquisa com base na opção escolhida
        switch (opcao) {
            case 1:
                System.out.print("Digite o nome do cliente: ");
                valor = scanner.nextLine();
                campo = "nome_cliente";
                break;
            case 2:
                System.out.print("Digite o CPF do cliente: ");
                valor = scanner.nextLine();
                campo = "cpf_cliente";
                break;
            case 3:
                System.out.print("Digite o ID do cliente: ");
                valor = scanner.nextLine();
                campo = "id_cliente";
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        // Consulta SQL para pesquisar o carro com base no campo e valor fornecidos
        String sql = "SELECT * FROM clientes WHERE " + campo + " = ?";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Define o valor do parâmetro na consulta SQL
            pstmt.setString(1, valor);
            try (ResultSet rs = pstmt.executeQuery()) {
                // Verifica se encontrou um resultado e exibe as informações do carro
                if (rs.next()) {
                    System.out.println("Nome: " + rs.getString("nome_cliente"));
                    System.out.println("CPF: " + rs.getString("cpf_cliente"));
                    System.out.println("Idade: " + rs.getInt("idade_cliente"));
                    System.out.println("ID: " + rs.getDouble("id_cliente"));
                    System.out.println("Sexo: " + rs.getString("sexo_cliente"));
                } else {
                    // Exibe uma mensagem caso não encontre nenhum resultado
                    System.out.println("Nenhum cliente encontrado com " + campo + " " + valor);
                }
            }
        } catch (Exception e) {
            // Exibe uma mensagem de erro caso ocorra algum problema na consulta SQL
            System.out.println("Erro ao buscar: " + e.getMessage());
        } finally {
            // Fecha o scanner
            scanner.close();
        }
    }
    
}
