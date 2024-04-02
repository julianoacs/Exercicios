import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o numero inicial: ");
        int numeroInicio = teclado.nextInt();
        System.out.print("Digite o numero final: ");
        int numeroFinal = teclado.nextInt();
        System.out.print("Digite o intervalo: ");
        int incremento = teclado.nextInt();
        if (numeroInicio <= numeroFinal){
            while (numeroInicio <= numeroFinal){
                System.out.println(numeroInicio);
                numeroInicio = numeroInicio + incremento;
            }
        } else {
            while (numeroInicio >= numeroFinal){
                System.out.println(numeroInicio);
                numeroInicio = numeroInicio - incremento;
            }
        }
        System.out.println("Acabou!");
    }
}