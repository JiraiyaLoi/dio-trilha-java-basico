import java.util.Scanner;
// Importando Scanner

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Inicializando Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibindo mensagem para usuário e recebendo dados
        System.out.println("Seja Bem Vindo ao nosso Banco DIO, para criar sua conta Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número de sua agência (Ex: 067-8): ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número de sua conta (Ex: 1021): ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite seu saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();
        // Fechando Scanner

        // Exibindo mensagem conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
