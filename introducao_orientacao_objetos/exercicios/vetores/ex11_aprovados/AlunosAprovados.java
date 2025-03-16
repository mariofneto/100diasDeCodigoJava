package introducao_orientacao_objetos.exercicios.vetores.ex11_aprovados;

import java.util.Locale;
import java.util.Scanner;

public class AlunosAprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int alunosQuantidade = sc.nextInt();
        sc.nextLine();

        Aluno[] alunos = new Aluno[alunosQuantidade];

        for(int i = 0; i < alunosQuantidade; i++){
            System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+"o aluno:");

            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            sc.nextLine();

            alunos[i] = new Aluno(nome, nota1, nota2);

        }



        System.out.println("Alunos aprovados: ");

        for(Aluno aluno : alunos){
            if((aluno.getNota1() + aluno.getNota2()) / 2 >= 6.0){
                System.out.println(aluno.getNome());
            }
        }
    }
}
