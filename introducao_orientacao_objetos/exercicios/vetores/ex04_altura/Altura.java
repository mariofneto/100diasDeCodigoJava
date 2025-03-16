package introducao_orientacao_objetos.exercicios.vetores.ex04_altura;

import java.util.Locale;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int numQuant = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[numQuant];

        int quantMenor16anos = 0;
        String[] nomesMenor16anos = new String[numQuant];

        int contador = 0;

        for(int i = 0; i < numQuant; i++){
            System.out.println("Dados da "+ (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            Pessoa p = new Pessoa(nome, idade, altura);
            pessoas[i] = p;
            if(p.getIdade() < 16){
                nomesMenor16anos[contador] = p.getNome();
                quantMenor16anos++;
                contador++;
            }
        }

        double somaAlturas = 0.0;

        for(Pessoa p : pessoas){
            somaAlturas += p.getAltura();
        }

        System.out.printf("Altura media: %.2f%n", somaAlturas/numQuant);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", (((double)quantMenor16anos/numQuant)*100));
        for(String nome : nomesMenor16anos){
            if(nome != null) {
                System.out.println(nome);
            }
        }




    }
}
