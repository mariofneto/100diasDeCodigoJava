package introducao_java.exercicios_estruturas_repeticao_for;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        for(int i = 0; i < numero; i++){
            if(!(i % 2 == 0)){
                System.out.println(i);
            }
        }

    }
}
