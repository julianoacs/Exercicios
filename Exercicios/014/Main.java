import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Sistema de locadora de Veiculos
        System.out.print("Dias com carro alugado: ");
        int dias = teclado.nextInt();
        System.out.print("KM rodados: ");
        int km = teclado.nextInt();
        double diarias = dias * 90;
        double kmRodados = km * 0.20;
        double total = diarias + kmRodados;
        System.out.println("Valor a pagar: " + total);
    }
}