import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Por favor, digite o seu nome: ");
        String nomeCliente = input.nextLine();
        System.out.print("Por favor, digite o número da conta: ");
        int numero = input.nextInt();
        input.nextLine();
        System.out.print("Por favor, digite o número da agência com o dígito: ");
        String agencia = input.nextLine();
        System.out.print("Por favor, digite o seu saldo: ");
        float saldo = input.nextFloat();

        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "
                + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
