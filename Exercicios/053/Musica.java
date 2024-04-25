public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numeroDeAvaliacoes;

    void avaliacoes(double nota){
        avaliacao += nota;
        numeroDeAvaliacoes++;
    }

    double mediaAvaliacoes(){
        return avaliacao / numeroDeAvaliacoes;
    }

    void exibeFichaTecnica(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lancamento: " + anoDeLancamento);
        System.out.println("Avaliacao: " + mediaAvaliacoes());
    }
}