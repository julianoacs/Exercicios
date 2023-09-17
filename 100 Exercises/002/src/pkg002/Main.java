package pkg002;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = keyboard.nextLine();
        System.out.println("Hello " + name + " Nice to meet you!");
    }
    
}