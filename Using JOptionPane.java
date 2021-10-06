package com.codewithme;
//example one for today's class
import javax.swing.JOptionPane;//Program uses JOptionPane
// to import the feauture to the code
public class Main {

    public static void main(String[] args) {
	// obtain user input from JOptionPane inputdialog
        String firstNumber = JOptionPane.showInputDialog("Enter First Integer");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer");
        //convert String inputs to int value for use of calculation

        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int sum = number1 + number2; //add numbers

        //display result in JOptionPane
        JOptionPane.showMessageDialog(null,"The sum is" + sum,
                "Sum of two integers",JOptionPane.PLAIN_MESSAGE);


    }//End of method

}// end of class
