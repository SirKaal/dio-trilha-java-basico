import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)){
        
        System.out.println("Digite o seu nome");
        String nomeCliente = scanner.next();
        
        System.out.println("Digite sua agência");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta");
        int numero = scanner.nextInt();

        System.out.println("Digite o seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta no nosso banco SirKall, sua agência é " +agencia+ ", conta "+numero+ " e seu saldo "+saldo+" já está disponível para saque.");
        }
    }
}
