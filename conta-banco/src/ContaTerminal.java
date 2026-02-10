
import java.util.Scanner;
public class ContaTerminal { 

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da agência: ");
        int numeroAgencia = sc.nextInt();
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.println("Por favor, digite o nome do titular da conta: ");
        String nomeTitular = sc.next();
        System.out.println("Por favor, digite o saldo da conta: ");
        double saldoConta = sc.nextDouble();
    
        System.out.println("Parabéns " + nomeTitular + ", sua conta foi criada com sucesso!");
    }





}
    





