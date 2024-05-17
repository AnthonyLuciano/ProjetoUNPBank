import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

class Cliente {
    private String id;
    private String nome;

    public Cliente(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id.equals(cliente.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Cliente{id=" + id + ", nome='" + nome + '\'' + '}';
    }

    public static String generateUniqueID() {
        String uuid = UUID.randomUUID().toString().replace("-", ""); // Remove os hífens
        return uuid + "0"; // Adiciona um dígito extra para completar 33 caracteres
    }
}

public class Main {
    public static void main(String[] args) {
        Set<Cliente> clientes = new HashSet<>();

        Cliente cliente1 = new Cliente(Cliente.generateUniqueID(), "Maria");
        Cliente cliente2 = new Cliente(Cliente.generateUniqueID(), "João");
        Cliente cliente3 = new Cliente(Cliente.generateUniqueID(), "Ana");
        Cliente cliente4 = new Cliente(Cliente.generateUniqueID(), "Pedro");

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
