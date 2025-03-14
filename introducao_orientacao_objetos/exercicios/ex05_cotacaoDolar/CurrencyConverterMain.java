package introducao_orientacao_objetos.exercicios.ex05_cotacaoDolar;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverterMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double realQuantity = sc.nextDouble();

        CurrencyConverter cc = new CurrencyConverter(dollarPrice,realQuantity);

        cc.calculatedPriceWithIOF(dollarPrice, realQuantity);

        cc.showResult();
    }
}
