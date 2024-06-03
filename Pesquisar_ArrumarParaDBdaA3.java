package A3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Pesquisar_ArrumarParaDBdaA3 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Conexão com o banco de dados
        // Colocar As informações do MySQL e DataBase 
        String url = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        // Inicializa o scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a opção de pesquisa:");
        System.out.println("1 - Modelo");
        System.out.println("2 - Cor");
        System.out.println("3 - Ano de fabricação");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        // Variáveis para armazenar o campo e o valor de pesquisa
        String campo = "";
        String valor = "";

        // Seleciona o campo de pesquisa com base na opção escolhida
        switch (opcao) {
            case 1:
                System.out.print("Digite o modelo do carro: ");
                valor = scanner.nextLine();
                campo = "modelo";
                break;
            case 2:
                System.out.print("Digite a cor do carro: ");
                valor = scanner.nextLine();
                campo = "cor";
                break;
            case 3:
                System.out.print("Digite o ano de fabricação do carro: ");
                valor = scanner.nextLine();
                campo = "ano";
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        // Consulta SQL para pesquisar o carro com base no campo e valor fornecidos
        String sql = "SELECT * FROM carros WHERE " + campo + " = ?";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Define o valor do parâmetro na consulta SQL
            pstmt.setString(1, valor);
            try (ResultSet rs = pstmt.executeQuery()) {
                // Verifica se encontrou um resultado e exibe as informações do carro
                if (rs.next()) {
                    System.out.println("Modelo: " + rs.getString("modelo"));
                    System.out.println("Cor: " + rs.getString("cor"));
                    System.out.println("Ano de fabricação: " + rs.getInt("ano"));
                    System.out.println("Valor: " + rs.getDouble("valor"));
                    System.out.println("Código de marca: " + rs.getInt("codMarca"));
                } else {
                    // Exibe uma mensagem caso não encontre nenhum resultado
                    System.out.println("Nenhum carro encontrado com " + campo + " " + valor);
                }
            }
        } catch (Exception e) {
            // Exibe uma mensagem de erro caso ocorra algum problema na consulta SQL
            System.out.println("Erro ao buscar carro: " + e.getMessage());
        } finally {
            // Fecha o scanner
            scanner.close();
        }
    }
    
}