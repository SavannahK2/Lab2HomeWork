
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0786954
 */
public class BarChart {
    public static void main(String[] args) {
        
        //Again, variables. KEEP SIMPLE. Stop over complicating
        int store1Sales;
        int store2Sales;
        int store3Sales;
        int store4Sales;
        int store5Sales;
        
        
        //add scanner
        Scanner keyboard = new Scanner(System.in);
        
        //ask user for input. 
        System.out.print("Enter the total amount of sales for store 1: ");
        store1Sales=keyboard.nextInt();
        System.out.print("Enter the total amount of sales for store 2: ");
        store2Sales=keyboard.nextInt();
        System.out.print("Enter the total amount of sales for store 3: ");
        store3Sales=keyboard.nextInt();
        System.out.print("Enter the total amount of sales for store 4: ");
        store4Sales=keyboard.nextInt();
        System.out.print("Enter the total amount of sales for store 5: ");
        store5Sales=keyboard.nextInt();
        
        //Chart out. Use for (int) from chapt 4 vid. each * should be 100 sales for the chart
        System.out.println("Sales Bar Chart");
        System.out.print("Store 1: ");
            for (int i=0; i<store1Sales; i+=100){
                System.out.print("*");
            }
                System.out.println();
                System.out.print("Store 2: ");
            for (int i=0; i<store2Sales; i+=100){
                System.out.print("*");
            }
                System.out.println();
                System.out.print("Store 3: ");
            for (int i=0; i<store3Sales; i+=100){
                System.out.print("*");
            }
                System.out.println();
                System.out.print("Store 4: ");
            for (int i=0; i<store4Sales; i+=100){
                System.out.print("*");
            }
                System.out.println();
                System.out.print("Store 5: ");
            for (int i=0; i<store5Sales; i+=100){
                System.out.print("*");
            }
    }  
}
