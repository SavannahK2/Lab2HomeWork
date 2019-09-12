
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
public class SumOfNumbers {
    public static void main(String[] args) {
    // input variable
    int number;
    int sum = 0;
    
    // User input
    String input1 = JOptionPane.showInputDialog("Enter a positive nonzero integer");
   
    // conversion to data
    number = Integer.parseInt(input1);
    
    // Make number loop
    while(number >= 1)
        {
        sum += number;
        number--;
	}
    JOptionPane.showMessageDialog(null, "The Sum is: " + sum);
	}
}
