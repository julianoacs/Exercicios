import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Escreva uma medida em metros: ");
        double metros = teclado.nextDouble();
        double mm = metros * 1000;
        double cm = metros * 100;
        double km = metros / 1000;
        double mh = metros / 1609;
        System.out.println(metros + "Metros, convertido para Milimetros e igual a " + mm + " MM");
        System.out.println(metros + "Metros, convertido para Centimetros e igual a " + cm + " CM");
        System.out.println(metros + "Metros, convertido para Kilometros e igual a " + km + " KM");
        System.out.println(metros + "Metros, convertido para Milhas e igual a " + mh + " MH");
    }
}