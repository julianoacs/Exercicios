import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite o valor da Casa: ");
        double valorCasa = teclado.nextDouble();
        System.out.print("Digite seu salario: ");
        double salario = teclado.nextDouble();
        System.out.print("Quantos anos voce deseja pagar: ");
        int anos = teclado.nextInt();
        double salario2 = (salario*30)/100;
        int anos2 = anos*12;
        double valorPorMes = valorCasa / anos2;

        DecimalFormat df = new DecimalFormat("#.00");
        String formattedVpm = df.format(valorPorMes);

        if ( salario >= valorPorMes ){
            System.out.println("Financiamento aprovado");
            System.out.println("Voce vai pagar R$" + formattedVpm + " reais por " + anos + " anos");
        } else {
            System.out.println("Financiamento nao aprovado");
        }

    }
}