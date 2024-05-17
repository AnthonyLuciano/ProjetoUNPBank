import java.util.UUID;

public class Conta {
    private UUID id;
    private String nome;
    private double saldo;

    public Conta(String nome, double saldo) {
        this.id = UUID.randomUUID(); // Gera um ID único
        this.nome = nome;
        this.saldo = saldo;
    }

    // Getters e Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public static void main(String[] args) {
        Conta conta1 = new Conta("João", 1000.0);
        Conta conta2 = new Conta("Maria", 2000.0);

        System.out.println(conta1);
        System.out.println(conta2);
    }
}
