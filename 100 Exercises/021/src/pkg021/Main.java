/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg021;

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
        System.out.println("Enter a Year: ");
        int year = keyboard.nextInt();
        if(year % 400 == 0){
            System.out.println(year + " And leap year.");
        // se o ano for menor que 400
        } else if((year % 4 == 0) && (year % 100 != 0)){
            System.out.println(year + " And leap year.");
        } else{
            System.out.println(year + " It's not leap year");
        }
    }
    
}
