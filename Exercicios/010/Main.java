import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite a altura da parede: ");
        double altura = teclado.nextDouble();
        System.out.print("Digite a largura da parede: ");
        double largura = teclado.nextDouble();
        double area = altura * largura;
        double litros = area / 2;
        System.out.println("A área da parede é: " + area + " m²");
        System.out.println("A quantidade de tinta necessária é: " + litros + " litros");
    }
}