public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("Clean Code");
        livro1.setAutor("Robert Cecil Martin");

        Livro livro2 = new Livro();
        livro2.setTitulo("Entendendo Algoritmos");
        livro2.setAutor("Aditya Y. Bhargava");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();

    }
}