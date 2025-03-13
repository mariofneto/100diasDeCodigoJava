package introducao_orientacao_objetos.exercicios.ex04_calculator;

public class Calculator {

    // C = 2πr ----- CIRCUNFERENCIA

    public static double circumference(double radius){
        return 2 * Math.PI * radius;
    }

    // V = (4/3) * π * r³  ----- VOLUME

    public static double volume(double radius){
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }
}
