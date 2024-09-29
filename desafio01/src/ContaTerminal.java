import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);       
        
        System.out.println("Por favor, digite o número da Conta: ");
        String contaString = scanner.nextLine();
        int conta = Integer.parseInt(contaString);
        
        System.out.println("Por favor, digite o a Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome: ");
        String nome = scanner.nextLine();
        System.out.println(nome);
        
        System.out.println("Por favor, digite o seu Saldo: ");
        String saldoString =  scanner.nextLine();
        double saldo = Double.parseDouble(saldoString);

        System.out.printf("\n\n\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, conta, saldo);

        scanner.close();
    }
}