import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero inteiro positivo: ");
        int numero = teclado.nextInt();
        int contador = 0;
        while (contador <= numero){
            System.out.println(contador);
            contador++;
        }
        System.out.println("Acabou!");
    }
}