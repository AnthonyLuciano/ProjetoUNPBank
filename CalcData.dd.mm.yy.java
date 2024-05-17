import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataNascimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data de nascimento (dd/MM/yyyy): ");
        String dataString = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataString, formatter);

        System.out.println("Data de nascimento: " + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        int idade = calcularIdade(dataNascimento);
        System.out.println("Idade: " + idade);
    }

    public static int calcularIdade(LocalDate dataNascimento) {
        LocalDate hoje = LocalDate.now();
        int idade = hoje.getYear() - dataNascimento.getYear();

        if (hoje.getMonthValue() < dataNascimento.getMonthValue() ||
                (hoje.getMonthValue() == dataNascimento.getMonthValue() && hoje.getDayOfMonth() < dataNascimento.getDayOfMonth())) {
            idade--;
        }

        return idade;
    }
}
