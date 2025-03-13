package introducao_orientacao_objetos.exercicios.ex02_funcionario;

public class Funcionario {
    private String name;
    private double grossSalary;
    private double tax;

    public Funcionario(String name, double grossSalary, double tax){
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }


    public double netSalary(){
        return grossSalary - tax;
    }

    public void showResult(){
        System.out.printf("Employee: %s, $ %.2f%n", this.name, netSalary());
    }

    public void increaseSalary(double percentage){
        double increase = grossSalary * (percentage / 100);
        double finalSalary = netSalary()+increase;

        System.out.printf("Updated data: %s, $ %.2f", this.name, finalSalary);

    }
}
