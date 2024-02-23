import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite o valor do Produto: R$ ");
        double valor = teclado.nextDouble();
        double desconto = valor * (5.00/100);
        double valorDesconto = valor - desconto;
        System.out.println("O valor do produto com 5% de Desconto e R$ " + valorDesconto);
    }
}