import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.err.println("Por favor, digite seu Nome !");
        String nome = sc.next();

        System.err.println("Por favor, digite o número da Agência !");
        String agencia = sc.next();

        System.err.println("Por favor, digite o número da Conta !");
        int conta = sc.nextInt();

        System.err.println("Saldo Atual ?");
        double saldo = sc.nextDouble();

        System.err.println("Olá [" + nome + "], " + "obrigado por criar uma conta  em nosso banco, sua agência é ["
                + agencia + "], conta[" + conta + "] e seu Saldo [" + saldo + "] já está disponivel para saque.");

    }

}