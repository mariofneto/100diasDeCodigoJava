package introducao_java.exercicios_estruturas_repeticao_while;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
            um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
            4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
            que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
            mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
            exemplo.
         */
        int alcool = 0, gasolina = 0, diesel = 0;
        int res = sc.nextInt();

        while(res != 4){
            if(res > 4){
                res = sc.nextInt();
            }else{
                switch (res){
                    case 1: alcool++; break;
                    case 2: gasolina++; break;
                    case 3: diesel++; break;
                    case 4: res = 4; break;
                }
                res = sc.nextInt();
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
