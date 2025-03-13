package introducao_orientacao_objetos.exercicios.ex01_retangulo;

public class Retangulo {
    public double width;
    public double height;

    public Retangulo(){}
    public Retangulo(double width, double height){
        this.width = width;
        this.height = height;
    }

    private double area(){
        return width * height;
    }

    private double perimeter(){
        return 2*(width + height);
    }
    /*
            d = √(6² + 8²)
            d = √(36 + 64)
            d = √100
            d = 10 cm
            A diagonal do retângulo mede 10 cm
     */
    private double diagonal(){
        return Math.sqrt((Math.pow(width, 2) + Math.pow(height,2)));
    }

    public void showResult(){
        System.out.println(String.format("AREA = %.2f%nPERIMETER = %.2f%nDIAGONAL = %.2f", area(), perimeter(),
                diagonal()));
    }


}
