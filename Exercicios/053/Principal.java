public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.titulo = "It was a Good Day";
        musica.artista = "Ice Cube";
        musica.anoDeLancamento = 1992;

        musica.avaliacoes(8);
        musica.avaliacoes(5);
        musica.avaliacoes(9);

        musica.exibeFichaTecnica();
    }
}