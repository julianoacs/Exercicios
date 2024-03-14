import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os lados de um triângulo para saber se é possível formar um triângulo.");
        System.out.print("Lado A: ");
        double ladoA = teclado.nextDouble();
        System.out.print("Lado B: ");
        double ladoB = teclado.nextDouble();
        System.out.print("Lado C: ");
        double ladoC = teclado.nextDouble();
        if ((ladoA + ladoB > ladoC) && (ladoA + ladoB > ladoC) && (ladoB + ladoC > ladoA)){
            if ((ladoA == ladoB) && (ladoA == ladoC)){
                System.out.println("É possível formar um triângulo EQUILÁTERO");
            } else if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC)){
                System.out.println("É possível formar um triângulo ISÓSCELES");
            } else {
                System.out.println("É possível formar um triângulo ESCALENO");
            }
        } else {
            System.out.println("Não é possível formar um triângulo.");
        }
    }
}