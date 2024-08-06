import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        //TODO: coletar informações do usuário

        System.out.println("Digite seu numero:");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o número da Agência:");
        String agencia = sc.nextLine();

        System.out.println("Digite o seu nome completo:");
        String nome = sc.nextLine();

        System.out.println("Digite o seu saldo:");
        double saldo = sc.nextDouble();

        // exibir mensagem do sistema

        System.out.println("Olá " + nome +"! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo 
         + "Já está disponível para saque!");

         sc.close();

    }
}
