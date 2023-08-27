/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg023;

import java.util.Scanner;

/**
 *
 * @author Juliano Silva
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String name = keyboard.nextLine();
        System.out.println("Enter your gender: ");
        System.out.println("M for Male.");
        System.out.println("F for Female.");
        String gender = keyboard.nextLine();
        System.out.println("Enter the value of your purchases");
        float price = keyboard.nextFloat();
        if (gender.equalsIgnoreCase("F")) {
            float disf = (price*13)/100;
            float price2 = price - disf;
            System.out.println("Congratulations on your day you get 13% off your purchases");
            System.out.println("Discounted price: US$ " + price2 + " Dollars");
        } else {
            float disf = (price*5)/100;
            float price3 = price - disf;
            System.out.println("Thank you for shopping with us, you have received a 5% discount.");
            System.out.println("Discounted price: US$ " + price3 + " Dollars");
        }
    }
    
}
