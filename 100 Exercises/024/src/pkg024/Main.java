/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg024;

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
        System.out.println("Enter how many kilometers you are going to travel.");
        int travel = keyboard.nextInt();
        if (travel <= 200) {
            double price1 = travel * 0.45;
            System.out.println("Value of your trip US$ " + price1 + " Dollars");
        } else {
            double price2 = travel * 0.45;
            System.out.println("Value of your trip: US$ " + price2 + " Dollars");
        }   
    }
    
}
