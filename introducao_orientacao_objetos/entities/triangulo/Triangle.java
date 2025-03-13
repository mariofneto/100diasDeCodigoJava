package introducao_orientacao_objetos.entities.triangulo;


public class Triangle {

    public double a;
    public double b;
    public double c;
    private double p;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.p = (this.a+this.b+this.c)/2;
    }





    private double area(){
        double resultado = Math.sqrt(this.p*(this.p-this.a)*(this.p-this.b)*(this.p-this.c));
        return resultado;
    }

    public String areaFormatada(){
        return  String.format("%.4f", area());
    }


    public static void maiorAreaDeDoisTriangulos(Triangle triangle1, Triangle triangle2){
        if(triangle1.area() > triangle2.area()) {
            System.out.println("Larger area: X");
        }
        else{
            System.out.println("Larger area: Y");

        }
    }
}
