import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // TODO: Conhecer e importar a classe Scanner

        Scanner sc = new Scanner(System.in);

        // Exibir as mensagens para nosso usuário
        // Obter pela classe Scanner os valores digitados no terminal
        
        System.out.println("Bem vindo usuário!!");
        System.out.println("Por favor, digite o número de sua agência: ");
        String agencia = sc.nextLine();

        System.out.println("Digite o número de sua conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Valor de depósito: ");
        float saldo = sc.nextFloat();

        // Exibir a mensagem da conta criada

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque!");

        sc.close();
    }
}
