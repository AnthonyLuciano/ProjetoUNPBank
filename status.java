import java.util.Scanner;
//cria a classe cliente
class Client {
    private String nome;
    private String status;

    public Client(String nome) {
        this.nome = nome;
        this.status = "ativo";
    }
    //variavel classe status
    public void setStatus(String newStatus) {
        if (newStatus.equalsIgnoreCase("ativo") || newStatus.equalsIgnoreCase("Inativo")) {
            this.status = newStatus;
        } else {
            System.out.println("Invalid status. Please choose 'ativo' or 'Inativo'.");
        }
    }

    public boolean taativo() {
        return this.status.equalsIgnoreCase("ativo");
    }

    public String getname() {
        return this.nome;
    }

    public String getStatus() {
        return this.status;
    }
}

public class status {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //nome do cliente
        Client client = new Client("joão maria");
        //introdução
        System.out.println("Bem vindo, " + client.getname() + ".");
        nada();
        System.out.println("[Current client status: " + client.getStatus() + "]");
        //painel de controle
        while (true) {
            System.out.println("1. trocar status");
            System.out.println("2. checar se pode performar transações");
            System.out.println("3. Sair");
            System.out.println("\n[escolha uma opção:]");

            int choice = scanner.nextInt();
            nada();
            //saida das escolhas em loop.  
            switch (choice) {
                case 1:
                    System.out.print("[coloque o novo status do cliente (ativo/Inativo)]: ");
                    scanner.nextLine();
                    String newStatus = scanner.nextLine();
                    client.setStatus(newStatus);
                    System.out.println("::status atualizado.::");
                    nada();
                    break;
                case 2:
                    if (client.taativo()) {
                        System.out.println("[Cliente pode performar transações.]");
                        nada();
                    } else {
                        System.out.println("[Cliente não pode performar transações.]");
                        nada();
                    }
                    break;
                case 3:
                    System.out.println("::adeus!::");
                    nada();
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("::Escolha invalida, reinicie e tente novamente.::");
                    nada();
            }
        }
    }
    //espaço vazio
    public static void nada(){System.out.println("\n");}
}