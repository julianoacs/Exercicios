public class Main {
    public static void main(String[] args) {
        int soma = 0;

        for (int numero = 6; numero <= 100; numero +=2 ){
            soma += numero;
        }
        System.out.println("A Soma e: " + soma);
    }
}