/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg015;

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
        System.out.println("How many cigarettes do you smoke per day: ");
        int cig = keyboard.nextInt();
        System.out.println("How many years do you smoke: ");
        int year = keyboard.nextInt();
        int cigsmokes = year * 365 * cig * 10;
        int dayslost = cigsmokes / (24 * 60);
        System.out.println("You wasted " + dayslost + " days of your life.");  
    }
    
}
