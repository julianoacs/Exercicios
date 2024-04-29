public class ContaBancaria {
    String titular;
    private int numeroConta;
    private double saldo;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void exibirInformacoes(){
        System.out.println("Conta Bancaria.");
        System.out.println("Titular: " + titular);
        System.out.println("Numero Conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }
}