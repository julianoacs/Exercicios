public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modeloDoCarro = "Fiesta";
        carro.anoDoCarro = 2010;
        carro.corDoCarro = "Preto";

        carro.exibirFichaTecnica();
    }
}