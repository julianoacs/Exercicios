/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg008;

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
        double dollar = 4.96; //Dollar conversion to Real on August 19th 
        double real = 0; 
        double conversion = 0;
                
        System.out.println("Type how much you want to convert to dollars: ");
        real = keyboard.nextDouble();
        conversion = real * dollar;
        System.out.println("You will have US$" + conversion + " Dollars");              
    }
    
}
