
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
public class BankCharge {
    public static void main(String[] args) {
        
        //similar set up, add scanner then variables
        Scanner keyboard = new Scanner(System.in);
        
	int numberOfChecks = 0;
	double charge = 0;
        double total = 0;
        double baseFee = 10;
	
        //ask user for the input
	System.out.print("Please enter the number of checks written for the month: ");
	numberOfChecks = keyboard.nextInt();
        
        //If statement next
	if(numberOfChecks < 20)
            {
            charge = numberOfChecks * 0.10;
            }
	else if(numberOfChecks < 40)		
            {
            charge = numberOfChecks * 0.08;
            }
	else if(numberOfChecks < 60)
            {
            charge = numberOfChecks * 0.06;
            }
	else if(numberOfChecks >= 60)
            {
            charge = numberOfChecks * 0.04;
            }
        
        //Finish calculation and display results
        total = baseFee + charge;
        System.out.println("The service fees for the month is $" + charge + ".");
	System.out.println("The Total for the month is $" + total + ".");
	
    }
}
