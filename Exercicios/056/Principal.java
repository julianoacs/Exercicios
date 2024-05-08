public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Juliano Silva";
        conta.setNumeroConta(0001);
        conta.setSaldo(10000);

        conta.exibirInformacoes();
    }
}
