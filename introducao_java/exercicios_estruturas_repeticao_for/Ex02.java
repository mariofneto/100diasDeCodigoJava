package introducao_java.exercicios_estruturas_repeticao_for;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quant = sc.nextInt();
        int contadorIn = 0;
        int contadorOut = 0;

        for(int i = 0; i < quant; i++ ){
            int num = sc.nextInt();
            if(num > 20 || num < 10){
                contadorOut++;
            }else{
                contadorIn++;
            }
        }

        System.out.println(contadorIn + " in");
        System.out.println(contadorOut + " out");
    }
}
