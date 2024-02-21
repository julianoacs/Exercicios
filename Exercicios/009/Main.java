import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Conversor de Reail para Dolar");
        System.out.print("Digite o valor a ser convertido: R$ ");
        double real = teclado.nextDouble();
        double dolar = real / 5.38;
        System.out.println("O valor convertido para dolar é: US$ " + String.format("%.2f", dolar));
        teclado.close();
    }
}