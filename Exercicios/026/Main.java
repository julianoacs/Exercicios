import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Comparador de Numeros");
        System.out.println("Digite o primeiro numero: ");
        int numero1 = teclado.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = teclado.nextInt();
        if (numero1 == numero2){
            System.out.println("Os numeros sao iguais");
        } else if (numero1 > numero2) {
            System.out.println("O numero " + numero1 + " e maior.");
        } else {
            System.out.println("O numero " + numero2 + " e maior.");
        }
    }
}