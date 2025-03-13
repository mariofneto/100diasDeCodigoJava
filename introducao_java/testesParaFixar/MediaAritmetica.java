package introducao_java.testesParaFixar;

import java.util.Locale;
import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double primeiroNumero = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        double segundoNumero = sc.nextInt();

        double mediaAritmetica = (primeiroNumero + segundoNumero) / 2;
        String resultado = String.format("A média desses dois números é %.1f", mediaAritmetica);

        System.out.println(resultado);
        sc.close();
    }
}
