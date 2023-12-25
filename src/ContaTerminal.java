import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Objects;

public class ContaTerminal {

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.err.println("Por favor, digite seu Nome !");
            String nome = sc.next();

            System.err.println("Por favor, digite o número da Agência !");
            int agencia = sc.nextInt();

            System.err.println("Por favor, digite o número da Conta !");
            int conta = sc.nextInt();

            System.err.println("Saldo Atual ?");
            double saldo = sc.nextDouble();

            System.err.println("Olá [" + nome + "], " + "obrigado por criar uma conta  em nosso banco, sua agência é ["
                    + agencia + "], conta[" + conta + "] e seu Saldo [" + saldo + "] já está disponivel para saque.");
        } catch (InputMismatchException e) {
            System.out.println("os Campos Agência e Conta Devem ser Numericos");
        }

    }

}