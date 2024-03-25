import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculadora de IMC");
        System.out.print("Digite sua altura: ");
        double altura = teclado.nextDouble();
        System.out.print("Digite seu peso: ");
        double peso = teclado.nextDouble();

        double imc = peso / (altura * altura);

        DecimalFormat formatacaoImc = new DecimalFormat("#.##");
        String imcFormatado = formatacaoImc.format(imc);

        if (imc <= 18.5){
            System.out.println("IMC: " + imcFormatado + " - Abaixo do peso.");
        } else if ((imc >= 18.5) && (imc <= 25)){
            System.out.println("IMC: " + imcFormatado + " - Peso ideal.");
        } else if ((imc > 25) && (imc <= 30)){
            System.out.println("IMC: " + imcFormatado + " - Sobrepeso.");
        } else if ((imc > 30) && (imc <= 40)){
            System.out.println("IMC: " + imcFormatado + " - Obesidade.");
        } else {
            System.out.println("IMC: " + imcFormatado + " - Obseidade mórbida");
        }
    }
}