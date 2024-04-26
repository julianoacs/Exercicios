import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Escreva um numero: ");
        double numero = teclado.nextDouble();
        double num1 = numero + numero;
        double num2 = numero / 3;
        System.out.println("O dobro de " + numero + " é igual a" + num1);
        System.out.println("Um terço de " + numero + " é igual a" + num2);
    }
}
