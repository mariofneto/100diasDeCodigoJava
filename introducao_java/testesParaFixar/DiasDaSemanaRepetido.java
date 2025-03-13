package introducao_java.testesParaFixar;


import java.util.Scanner;

public class DiasDaSemanaRepetido {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean sair = true;

        while (sair) {
            int diaSemana = sc.nextInt();
            String dia;


            switch (diaSemana) {
                case 1:
                    dia = "Domingo";
                    System.out.println("Dia da Semana é: " + dia);
                    break;
                case 2:
                    dia = "Segunda";
                    System.out.println("Dia da Semana é: " + dia);
                    break;
                case 3:
                    dia = "Terça";
                    System.out.println("Dia da Semana é: " + dia);
                    break;
                case 4:
                    dia = "Quarta";
                    System.out.println("Dia da Semana é: " + dia);

                    break;
                case 5:
                    dia = "Quinta";
                    System.out.println("Dia da Semana é: " + dia);

                    break;
                case 6:
                    dia = "Sexta";
                    System.out.println("Dia da Semana é: " + dia);

                    break;
                case 7:
                    dia = "Sábado";
                    System.out.println("Dia da Semana é: " + dia);

                    break;
                default:
                    dia = "Invalido";
                    System.out.println("Dia da Semana é: " + dia);

                    sair = false;
            }
        }


    }
}
