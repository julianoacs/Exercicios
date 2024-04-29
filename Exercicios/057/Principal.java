public class Principal {
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setNome("Juliano Silva");
        pessoa.setIdade(28);

        pessoa.exibirInformacoes();
        pessoa.verificarMaioridade();
    }
}