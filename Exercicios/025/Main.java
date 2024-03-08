import java.util.Scanner;

public class Main {
    public static boolean triangulo(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite os lados de um triângulo para saber se é possível formar um triângulo.");
        System.out.print("Lado A: ");
        double ladoA = teclado.nextDouble();
        System.out.print("Lado B: ");
        double ladoB = teclado.nextDouble();
        System.out.print("Lado C: ");
        double ladoC = teclado.nextDouble();
        if (triangulo(ladoA, ladoB, ladoC)) {
            System.out.println("É possível formar um triângulo.");
        } else {
            System.out.println("Não é possível formar um triângulo.");
        }
    }
}
