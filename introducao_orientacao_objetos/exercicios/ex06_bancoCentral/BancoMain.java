package introducao_orientacao_objetos.exercicios.ex06_bancoCentral;

import java.util.Locale;
import java.util.Scanner;

public class BancoMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String nomeTitular = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)?");
        char resposta = sc.nextLine().toLowerCase().charAt(0);

        Banco b = new Banco(numeroConta, nomeTitular);

        if(resposta == 'y'){
            System.out.print("Enter initial deposit value: ");
            b.setSaldo(sc.nextDouble());

            System.out.println("Account data:");
            b.msgSaldo();

            System.out.print("Enter a deposit value: ");
            b.deposito(sc.nextDouble());

            System.out.print("Enter a withdraw value: ");
            b.saque(sc.nextDouble());


        }else{
            System.out.println("Account data:");
            b.msgSaldo();

            System.out.print("Enter a deposit value: ");
            b.deposito(sc.nextDouble());

            System.out.print("Enter a withdraw value: ");
            b.saque(sc.nextDouble());
        }

    }
}
