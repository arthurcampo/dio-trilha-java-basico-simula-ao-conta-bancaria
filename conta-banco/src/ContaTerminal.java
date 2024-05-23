import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome completo: ");
        String nomeCliente = scanner.next ();

        System.out.println("Por favor, digite seu numero da conta: ");
        int numero = scanner.nextInt ();

        System.out.println("Por favor, digite sua agencia: ");
        String agencia = scanner.next ();

        System.out.println("Por favor, digite seu saldo: ");
        double saldo = scanner.nextDouble ();

        System.out.println("Olá "+ nomeCliente+", obrigado por criar uma conta em nosso banco, sua Agencia é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" ja esta disponivel para saque.");
    }
<<<<<<< HEAD
}
=======
>>>>>>> f5279438ec0115bb8947d3a3b4e622553e8ee705
