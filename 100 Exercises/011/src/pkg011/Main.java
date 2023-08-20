/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg011;

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
        System.out.println("Enter product name: ");
        String product = keyboard.nextLine();
        System.out.println("Type your price: ");
        float price = keyboard.nextFloat();
        float desc = (price*5) / 100;
        float prfi = price - desc;
        System.out.println("The final value with discount is US$" + prfi + " Dolaers");
    }
    
}
