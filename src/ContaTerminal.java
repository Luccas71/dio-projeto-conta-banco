import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Por favor, digite o número da agência(ex.: xxx-x):");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Por favor, digite o saldo(ex.: 00.00): ");
        double saldo = sc.nextDouble();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.", nome, agencia, numeroConta, saldo);

        sc.close();
    }
}
