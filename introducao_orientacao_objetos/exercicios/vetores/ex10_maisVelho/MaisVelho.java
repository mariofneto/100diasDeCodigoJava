package introducao_orientacao_objetos.exercicios.vetores.ex10_maisVelho;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int numQuantidade = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[numQuantidade];
        int pessoaMaisVelhaIdade = 0;
        String pessoaMaisVelhaNome = "";

        for(int i = 0; i < numQuantidade; i++){
            System.out.println("Dados da "+(i+1)+"a pessoa:");
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();

            pessoas[i] = new Pessoa(nome, idade);
            pessoaMaisVelhaIdade = pessoas[0].getIdade();
            pessoaMaisVelhaNome = pessoas[0].getNome();
        }

        for(Pessoa p : pessoas){
            if(p.getIdade() > pessoaMaisVelhaIdade){
                pessoaMaisVelhaIdade = p.getIdade();
                pessoaMaisVelhaNome = p.getNome();
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + pessoaMaisVelhaNome);
    }
}
