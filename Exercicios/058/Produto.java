public class Produto {
    private String nome;
    private double preco;
    private double desconto;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(){
        return preco - (preco * desconto / 100);
    }

    void exibirPrduto(){
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Desconto: " + aplicarDesconto());
    }
}