package introducao_orientacao_objetos.exercicios.ex03_aluno;

public class Aluno {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

    private double passingGrade = 60.0;

    public Aluno(String name, double grade1, double grade2, double grade3){
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }


    public double sumGrades(){
        return grade1 + grade2 + grade3;
    }

    public double missPoints(){
        return passingGrade - sumGrades();
    }

    public void pass(){
        if(sumGrades() >= passingGrade){
            System.out.printf("FINAL GRADE: = %.2f%nPASS", sumGrades());
        }else{
            System.out.printf("FINAL GRADE: = %.2f%nFAILED%n", sumGrades());
            System.out.printf("MISSING %.2f POINTS", missPoints());
        }
    }
}
