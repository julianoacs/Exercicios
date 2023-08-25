/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg019;

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
        System.out.print("Enter the first note: ");
        double note1 = keyboard.nextDouble();
        System.out.print("Enter the first note: ");
        double note2 = keyboard.nextDouble();
        double media = (note1 + note2)/2;
        if (media >= 7){
            System.out.println("Congratulations your average is " + media + " You Passed.");
        } else {
            System.out.println("Your average was " + media + " You failed.");
        }     
    }
}
