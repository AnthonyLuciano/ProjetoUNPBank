import java.util.Scanner;

class ContaCorrente {
    private int idConta;
    private String cpfTitular;
    private double saldo;
    private boolean status;

    public ContaCorrente(int idConta, String cpfTitular, double saldo) {
        this.idConta = idConta;
        this.cpfTitular = cpfTitular;
        this.saldo = saldo;
        this.status = true; // Por padrão, a conta é criada como ativa
    }

    // Métodos para depositar, retirar e verificar saldo
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void retirar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Retirada de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para retirada.");
        }
    }

    public double verificarSaldo() {
        return saldo;
    }

    // Método para desativar a conta
    public void desativarConta() {
        status = false;
        System.out.println("Conta desativada.");
    }

    // Método para reativar a conta
    public void reativarConta() {
        status = true;
        System.out.println("Conta reativada.");
    }

    // Método para exibir informações da conta
    public void exibirInfo() {
        System.out.println("ID da Conta: " + idConta);
        System.out.println("CPF do Titular: " + cpfTitular);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Status: " + (status ? "Ativa" : "Inativa"));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar informações para criar a conta
        System.out.print("Informe o ID da conta: ");
        int idConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Informe o CPF do titular: ");
        String cpfTitular = scanner.nextLine();
        System.out.print("Informe o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        // Criar a conta com as informações fornecidas
        ContaCorrente conta1 = new ContaCorrente(idConta, cpfTitular, saldoInicial);

        // Menu de operações
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Verificar Saldo");
            System.out.println("4. Desativar Conta");
            System.out.println("5. Reativar Conta");
            System.out.println("6. Exibir Informações da Conta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta1.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Informe o valor da retirada: ");
                    double valorRetirada = scanner.nextDouble();
                    conta1.retirar(valorRetirada);
                    break;
                case 3:
                    System.out.println("Saldo atual: R$" + conta1.verificarSaldo());
                    break;
                case 4:
                    conta1.desativarConta();
                    break;
                case 5:
                    conta1.reativarConta();
                    break;
                case 6:
                    conta1.exibirInfo();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
