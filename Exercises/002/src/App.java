import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();
        System.out.println("Hello " + name + ", Nice to meet you !");
        keyboard.close();
    }
}
