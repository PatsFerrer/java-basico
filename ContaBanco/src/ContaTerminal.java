import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta");
        int conta = sc.nextInt();

        System.out.println("Digite o número da agência");
        String agencia = sc.next();
        
        System.out.println("Digite o nome do cliente");
        String nomeCliente = sc.next();

        
        System.out.println("Saldo");
        double saldo = sc.nextDouble();
        
        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
        
        sc.close();
    }
}
