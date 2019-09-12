
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
public class TestScoreGrades {
    public static void main(String[] args) {
        
        //Variable inputs for user
        String input1, input2, input3;
        
        //Add double for scores
        double testScore1;
        double testScore2;
        double testScore3;
        double average;
        
        //Add scanner
        Scanner keyboard = new Scanner(System.in);
        
        //Gain input
        input1= JOptionPane.showInputDialog(null, "Enter the first test score: ");
        input2= JOptionPane.showInputDialog(null, "Enter the second test score: ");
        input3= JOptionPane.showInputDialog(null, "Enter the third test score: ");
        
        //Input to data
        testScore1 = Double.parseDouble(input1);
        testScore2 = Double.parseDouble(input2);
        testScore3 = Double.parseDouble(input3);
        
        //calculate
        average = (testScore1 + testScore2 + testScore3) / 3;
        
        //If statement for the average
        if (average <= 100){

			if(average >= 90){
				JOptionPane.showMessageDialog(null, "Your average is " + average + " or A");
			}
			else if(average >= 80){
				JOptionPane.showMessageDialog(null, "Your average is " + average + " or B");
			}
			else if(average >= 70){
				JOptionPane.showMessageDialog(null, "Your average is " + average + " or C");
			}
			else if(average >= 60){
				JOptionPane.showMessageDialog(null, "Your average is " + average + " or D");
			}
			else if(average < 60) {
				JOptionPane.showMessageDialog(null, "Your average is " + average + " or F");
			}
        }
		else
		{
			JOptionPane.showMessageDialog(null,  "Your average is out of bounds, check test scores.");
		}

    }
}