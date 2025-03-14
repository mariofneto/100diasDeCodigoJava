package introducao_orientacao_objetos.exercicios.ex06_bancoCentral;

public class Banco {

    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public Banco(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public Banco(int numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valorDepositado){
        this.saldo += valorDepositado;
        msgSaldo();
    }

    public void saque(double valorSaque){
        this.saldo = (this.saldo - valorSaque) - 5.00;
        msgSaldo();
    }


    public void msgSaldo(){
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n%n", numeroConta, nomeTitular, this.saldo);
    }

}
