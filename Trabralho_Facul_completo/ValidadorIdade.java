import java.util.Scanner;

public class ValidarIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        
        if (idade >= 18 && idade < 120) {
            System.out.println("Idade válida.");
        } else {
            System.out.println("Idade inválida. A idade deve ser superior a 18 e inferior a 120.");
        }
    }
}
