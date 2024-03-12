import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Classificação de Terrenos");
        System.out.println("Digite a largura do terreno: ");
        double largura = teclado.nextDouble();
        System.out.println("Digite o comprimento do terreno: ");
        double comprimento = teclado.nextDouble();
        double metrosQuadrados = largura * comprimento;
        if (metrosQuadrados < 100) {
            System.out.println("Metros Quadrados: " + metrosQuadrados);
            System.out.println("Classificação: TERRENO POPULAR");
        } else if ((metrosQuadrados >= 100) && (metrosQuadrados <= 500)){
            System.out.println("Metros Quadrados: " + metrosQuadrados);
            System.out.println("Classificação: TERRENO MASTER");
        } else {
            System.out.println("Metros Quadrados: " + metrosQuadrados);
            System.out.println("Classificação: TERRENO VIP");
        }
    }
}