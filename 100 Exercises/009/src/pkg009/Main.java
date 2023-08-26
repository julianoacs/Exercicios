/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg009;

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
        System.out.println("Enter a distance in meters: ");
        double meters = keyboard.nextDouble();
        double mm = meters * 1000;
        double cm = meters * 100;
        double km = meters / 1000;
        double mh = meters / 1609;
        System.out.println("The measurement in millimeters is " + mm);
        System.out.println("The measurement in centimeters is " + cm);
        System.out.println("The measurement in hectometer is " + km);
        System.out.println("The measurement in miles is " + mh);
    }
    
}
