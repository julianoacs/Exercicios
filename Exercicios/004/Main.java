import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double numero1 = teclado.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double numero2 = teclado.nextDouble();
        double resultado = numero1 + numero2;
        System.out.println("A soma entre " + numero1 + " e " + numero2 + " e igual a " + resultado); 
    }
}
