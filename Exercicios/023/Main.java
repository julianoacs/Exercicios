import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite seu Nome: ");
        String nome = teclado.nextLine();
        System.out.println("Qual seu Genero: ");
        System.out.println("H - para Homen");
        System.out.println("M - para Mulher");
        String genero = teclado.nextLine();
        System.out.println("Digite o valor das suas compras: R$ ");
        float preco = teclado.nextFloat();
        if (genero.equalsIgnoreCase("M")) {
            float descontoMulher = (preco*13)/100;
            float precoMulher = preco - descontoMulher;
            System.out.println("Parabéns, você ganhou 13% de desconto!");
            System.out.println("Valor das Compras: RS$ " + precoMulher + " Reais");
        } else {
            float descontoHomen = (preco*5)/100;
            float precoHomen = preco - descontoHomen;
            System.out.println("Muito obrigado por sua compra, você ganhou 5% de desconto!");
            System.out.println("Valor das compras: RS$ " + precoHomen + " Reais");
        }
    }
}