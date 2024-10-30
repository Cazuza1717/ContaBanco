import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
//    int numero_conta;
//    String agemcia, nome_cliente;
//    double saldo;

    System.out.println("SEJA BEM VINDO AO BANCO!");
    System.out.println("Por favor, digite o número da Agência: ");
    String agencia = sc.nextLine();
    System.out.println("Por favor, digite o número da conta: ");
    int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do cliente: ");
        String nome = sc.nextLine();
    System.out.println("Digite o saldo da conta: ");
    double saldo = sc.nextDouble();

    System.out.println("Olá " + nome + ",  obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque ");

    sc.close();
    }
}