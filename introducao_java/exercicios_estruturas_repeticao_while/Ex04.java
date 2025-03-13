package introducao_java.exercicios_estruturas_repeticao_while;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
            cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
            menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
         */
        int cordX = 1, cordY = 1;

        while (cordX != 0 && cordY != 0) {
            cordX = sc.nextInt();
            cordY = sc.nextInt();

            if (cordX > 0 && cordY > 0) {
                System.out.println("primeiro");
            } else if (cordX < 0 && cordY > 0) {
                System.out.println("segundo");
            } else if (cordX < 0 && cordY < 0){
                System.out.println("terceiro");
            } else if (cordX > 0 && cordY < 0){
                System.out.println("quarto");
            } else{
                System.out.println(" ");
            }
        }


        sc.close();
    }
}
