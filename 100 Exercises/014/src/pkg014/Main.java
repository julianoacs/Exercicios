/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg014;

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
        System.out.println("How many days do you want to rent the car: ");
        int days = keyboard.nextInt();
        System.out.println("How many kilometers have been driven: ");
        double kmdr = keyboard.nextInt();
        int daysvalue = days * 90;
        double kmvalue = kmdr * 0.20;
        double value = daysvalue + kmvalue;
        System.out.println("Amount to be paid: US$ " + value + " Dollars.");
    }
 
}
