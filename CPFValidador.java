import java.util.Scanner;

public class CPFValidador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o numero de CPF: ");
        String cpf = scanner.nextLine();
        scanner.close();

        if (ÉCpfValido(cpf)) {
            System.out.println("[O CPF é valido.]");
        } else {
            System.out.println("[O CPF é invalido, reinicie o programa e tente novamente]");
        }
    }

    public static boolean ÉCpfValido(String cpf) {
        cpf = cpf.replace(".", "").replace("-", "");

        if ((cpf == null) || (cpf.length() != TamanhoCPF)) {
            return false;
        }

        int[] numeros = new int[TamanhoCPF];
        for (int i = 0; i < TamanhoCPF; i++) {
            numeros[i] = Character.getNumericValue(cpf.charAt(i));
        }

        int resto = 0;
        for (int i = 0; i < 9; i++) {
            resto += numeros[i] * (10 - i);
        }
        int verificador = resto % TamanhoCPF;
        if ((verificador == 0) || (verificador == 1)) {
            verificador = 0;
        } else {
            verificador = TamanhoCPF - verificador;
        }
        if (verificador != numeros[9]) {
            return false;
        }

        resto = 0;
        for (int i = 0; i < 10; i++) {
            resto += numeros[i] * (TamanhoCPF - i);
        }
        verificador = resto % TamanhoCPF;
        if ((verificador == 0) || (verificador == 1)) {
            verificador = 0;
        } else {
            verificador = TamanhoCPF - verificador;
        }
        if (verificador != numeros[10]) {
            return false;
        }

        return true;
    }
    private static final int TamanhoCPF = 11;
}