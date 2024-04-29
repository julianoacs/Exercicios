public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    void exibirInformacoes(){
        System.out.println("Nome: " + nome);
    }

    void verificarMaioridade(){
        if (idade >= 18){
            System.out.println("Você tem " + idade + " anos, Você é maior de idade");
        } else {
            System.out.println("Você tem " + idade + " anos, Você é menor de idade");
        }
    }
}