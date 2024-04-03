import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0;
        int parada = 0;

        while (parada <= 6){
            System.out.print("Digite um numero: ");
            double numero = teclado.nextDouble();
            parada++;
            soma += numero;
        }
        System.out.println("A soma dos numero e: " + soma);
    }
}