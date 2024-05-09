public class Principal {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Fiesta");
        meuCarro.definirPrecos(26000, 25000 , 23500);
        meuCarro.exibirInfo();
    }
}
