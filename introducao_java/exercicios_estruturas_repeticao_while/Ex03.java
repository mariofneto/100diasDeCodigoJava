package introducao_java.exercicios_estruturas_repeticao_while;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = "2002";
        String respostaUsuario = sc.nextLine();

        while(!respostaUsuario.equals(senha)){
            System.out.println("Senha inválida");
            respostaUsuario = sc.nextLine();
        }

        System.out.println("Acesso permitido");

    }
}
