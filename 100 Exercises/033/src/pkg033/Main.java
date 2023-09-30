/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg033;

import java.text.DecimalFormat;
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
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter the value of the house: ");
        double housevalue = keyboard.nextDouble();
        System.out.print("Enter your salary: ");
        double salary = keyboard.nextDouble();
        System.out.print("How many years do you want to pay: ");
        int year = keyboard.nextInt();
        double salary2 = (salary*30)/100;
        int years2 = year*12;
        double vpm = housevalue / years2;
        
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedVpm = df.format(vpm);
        
        if ( salary2 >= vpm ){
            System.out.println("Approved financing");
            System.out.println("You will pay R$" + formattedVpm + " dollars per month for " + year + " years");
        } else {
            System.out.println("Your financing was not approved");
        }
        
    }
    
}
