import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter the value of A: ");
        double a = keyboard.nextDouble();
        System.out.print("Enter the value of B: ");
        double b = keyboard.nextDouble();
        System.out.print("Enter the value of C: ");
        double c = keyboard.nextDouble();
        double delta = b * b - 4 * a * c;
        System.out.println("Delta is: " + delta);
    }
}