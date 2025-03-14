package introducao_orientacao_objetos.exercicios.ex05_cotacaoDolar;

public class CurrencyConverter {

    private double dollarValue;
    private double realQuantity;
    private final double IOF = 0.06;


    public CurrencyConverter(double dollarValue, double realQuantity){
        this.dollarValue = dollarValue;
        this.realQuantity = realQuantity;
    }

    public double calculatedPriceWithIOF(double dollarValue, double realQuantity){
        double valueFinalIOF = dollarValue * realQuantity * this.IOF;
        return dollarValue * realQuantity + valueFinalIOF;
    }

    public void showResult(){
        System.out.printf("Amount to be paid in reais = %.2f%n", calculatedPriceWithIOF(this.dollarValue, this.realQuantity));
    }
}
