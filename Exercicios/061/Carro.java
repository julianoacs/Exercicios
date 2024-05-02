public class Carro {
    private String modelo;
    private double valorAno1;
    private double valorAno2;
    private double valorAno3;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.valorAno1 = precoAno1;
        this.valorAno2 = precoAno2;
        this.valorAno3 = precoAno3;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1: " + valorAno1);
        System.out.println("Preço Ano 2: " + valorAno2);
        System.out.println("Preço Ano 3: " + valorAno3);
        System.out.println("Menor Preço: " + MenorValor());
        System.out.println("Maior Preço: " + MaiorValor());
    }

    private double MenorValor() {
        double menorPreco = valorAno1;

        if (valorAno2 < menorPreco) {
            menorPreco = valorAno2;
        }

        if (valorAno3 < menorPreco) {
            menorPreco = valorAno3;
        }

        return menorPreco;
    }

    private double MaiorValor() {
        double maiorPreco = valorAno1;

        if (valorAno2 > maiorPreco) {
            maiorPreco = valorAno2;
        }

        if (valorAno3 > maiorPreco) {
            maiorPreco = valorAno3;
        }

        return maiorPreco;
    }
}