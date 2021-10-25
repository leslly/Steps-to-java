/* Consider a bank that offers four different types of account ( A, B, C, X).
The followig table illustrates the annual rate of interest offered
for each type of account. Design and implement a program that allows the user to enter an amount of money and a type of bank acount,
before displaying the amount of money that can be earned in one year as interest on that money given tyype of bank account.
Use any control statements you hav learntand make your program GUI based*/

// Account    - Annual rate of interest
// A          - 1.5
// B          - 2
// C          - 1.5
// X          - 5

//Having a file error but run this and tell me how it is

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Bank {

    public static void bank(String[] agrs){
        Scanner in = new Scanner(System.in);

        char type  = JOptionPane.showInputDialog(null,"Enter Type of account");

        if(type == 'A'){

            int Amount = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter any amount");
                Amount *= 1.5 ;
            String res = String.format("Account type:%c\nIntrest loan:%d",type,Amount);

            // JOptionPane.showMessageDialog(null,res,name + "\'s Semesters GPA",
            //  JOptionPane.INFORMATION_MESSAGE);
        }


   /* int Amount = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter score" +
            (i+1)));
    */
    }

}
