public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Computador");
        produto1.setPreco(2999);
        produto1.setDesconto(10);

        Produto produto2 = new Produto();
        produto2.setNome("Iphone");
        produto2.setPreco(1500);
        produto2.setDesconto(10);

        produto1.exibirPrduto();

        produto2.exibirPrduto();
    }
}
