import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter your birth month: ");
        int birthMonth = scanner.nextInt();

        System.out.print("Enter your birth day: ");
        int birthDay = scanner.nextInt();

        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate today = LocalDate.now();

        Period period = Period.between(birthDate, today);
        int years = period.getYears();

        System.out.println("You are " + years + " years old.");
    }
}
