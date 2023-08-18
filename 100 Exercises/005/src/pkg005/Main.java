/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg005;

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
        System.out.println("First Note: ");
        float note1 = keyboard.nextFloat();
        System.out.println("Second Note: ");
        float note2 = keyboard.nextFloat();
        float average = (note1 + note2)/2;
        System.out.println("Your Average: " + average);
    }
    
}
