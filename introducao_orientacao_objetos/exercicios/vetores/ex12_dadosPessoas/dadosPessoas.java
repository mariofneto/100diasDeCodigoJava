package introducao_orientacao_objetos.exercicios.vetores.ex12_dadosPessoas;

import java.util.Locale;
import java.util.Scanner;

public class dadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int quantPessoas = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[quantPessoas];
        int numeroHomens = 0;
        double somaAlturaMulheres = 0.0;
        int numeroMulheres = 0;
        double menorAltura = 10000.00;
        double maiorAltura = 0.0;

        for(int i=0; i<quantPessoas; i++){
            System.out.print("Altura da "+(i+1)+"a pessoa: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            System.out.print("Genero da "+(i+1)+"a pessoa: ");
            char genero = sc.nextLine().toLowerCase().charAt(0);

            if(genero == 'm'){
                numeroHomens++;
            }else{
                somaAlturaMulheres += altura;
                numeroMulheres++;
            }


            pessoas[i] = new Pessoa(altura, genero);
            //System.out.println(pessoas[i].getAltura() +" "+ pessoas[i].getGenero());


            if(pessoas[i].getAltura() > maiorAltura){
                maiorAltura = pessoas[i].getAltura();
            }
            if(pessoas[i].getAltura() < menorAltura){
                menorAltura = pessoas[i].getAltura();
            }
        }

        double mediaAlturaMulheres = somaAlturaMulheres / numeroMulheres;

        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Media altura mulheres = %.2f%n", mediaAlturaMulheres);
        System.out.printf("Numero de homens = %d", numeroHomens);
    }
}
