import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos anos você e fumante?");
        int anos = teclado.nextInt();
        System.out.println("Quantos cigarros você fuma por dia?");
        int cigarros = teclado.nextInt();
        int totalCigarros = anos * 365 * cigarros * 10;
        int diasPerdidos = totalCigarros / (24 * 60 );
        System.out.println("Você perdeu " + diasPerdidos + " dias de vida");
    }
}