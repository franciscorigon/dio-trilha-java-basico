import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Digite seu nome: ");
                String nome = sc.next();

                System.out.println("Digite seu sobrenome: ");
                String sobrenome = sc.next();

                System.out.println("Digite sua idade: ");
                int idade = sc.nextInt();

                System.out.println("Digite sua altura: ");
                double altura = sc.nextDouble();

                System.out.println("Olá, me chamo " + nome + " " + sobrenome + ", tenho " + idade + " anos e " + altura + " metros de altura.");
                validInput = true;  // Se todas as entradas são válidas, interrompe o loop
            } catch (InputMismatchException e) {
                System.out.println("Os campos idade e altura devem ser numéricos e com ponto, não vírgula.");
                sc.nextLine(); // Limpa o buffer do scanner
            }
        }

        sc.close();
    }
}
