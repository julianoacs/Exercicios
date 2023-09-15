//Import Scanner class from java.util package.
import java.util.Scanner;

//Project mais class.
public class App {
    public static void main(String[] args) throws Exception {
       //Create a new Scanner object.
       Scanner keyboard = new Scanner(System.in);
       //Ask the user for their name.
       System.out.println("What`s your name?");
       //Read the user`s name.
       String name =  keyboard.nextLine();
       //Print a message to the user.
       System.out.println("Hello, " + name + " Nice to meet you!");
    }
}