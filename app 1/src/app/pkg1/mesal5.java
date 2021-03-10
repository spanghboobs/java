/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.pkg1;
import java.util.Scanner;
/**
 *
 * @author spanghboobs
 */
public class mesal5 {
       public static void main(String[] args) {
        // TODO code application logic here
        double price, tax, total;
        
        Scanner inout = new Scanner(System.in);
        
        System.out.print ("Please enter a purchase amount: ");
        price = inout.nextDouble();
        
        tax = price * 0.09;
        total = price + tax;
        total = (int)(total * 100) / 100.0;
        
        System.out.print ("Your total payment: " + total + " Rials. ");
        System.out.println (price + " your sale and " +
                (int)(tax * 100) / 100.0 + " for taxes");
    }//end of main
}
