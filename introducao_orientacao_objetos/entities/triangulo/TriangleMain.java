package introducao_orientacao_objetos.entities.triangulo;

import java.util.Locale;
import java.util.Scanner;

public class TriangleMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        Triangle triangleX = new Triangle(a, b, c);

        System.out.println("Enter the measures of triangle Y:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        Triangle triangleY = new Triangle(a, b, c);

        System.out.println("Triangle X area: " + triangleX.areaFormatada());
        System.out.println("Triangle Y area: " + triangleY.areaFormatada());

        Triangle.maiorAreaDeDoisTriangulos(triangleX, triangleY);
    }
}
