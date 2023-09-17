import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner (System.in);
    System.out.print("Enter a number between 1 and 5: ");
    int number = keyboard.nextInt();
    int computer = (int) (Math.random() * 5 + 1);
    if (number == computer){
        System.out.println("Congrats, I thought about number " + number);
    } else {
        System.out.println("You made a mistake, enter another number." + computer);
    }
    keyboard.close();
    }
}