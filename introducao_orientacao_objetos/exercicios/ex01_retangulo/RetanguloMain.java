package introducao_orientacao_objetos.exercicios.ex01_retangulo;

import java.util.Locale;
import java.util.Scanner;

public class RetanguloMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height:");
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Retangulo rt = new Retangulo(width, height);
        rt.showResult();
    }
}
