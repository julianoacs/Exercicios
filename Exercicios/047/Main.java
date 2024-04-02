public class Main {
    public static void main(String[] args) {
        int soma = 0;

        for (int numero = 500; numero >= 0; numero -=50 ){
            soma += numero;
        }
        System.out.println("A Soma e: " + soma);
    }
}