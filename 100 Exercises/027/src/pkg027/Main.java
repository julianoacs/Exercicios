/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg027;

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
        System.out.print("Enter first note: ");
        double number1 = keyboard.nextDouble();
        System.out.print("Enter second note: ");
        double number2 = keyboard.nextDouble();
        double media = (number1 + number2)/2;
        if (media >= 7) {
            System.out.println("Media: " + media);
            System.out.println("Status: Aproved.");
        } else if (( media >= 5 ) && (media <= 6.99)) {
            System.out.println("Media: " + media);
            System.out.println("Status: Recorvery ");
        } else {
            System.out.println("Media: " + media);
            System.out.println("Status: Reproved.");
        }
    }
    
}
