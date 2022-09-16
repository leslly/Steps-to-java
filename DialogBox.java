import java.util.Scanner;
 import javax.swing.JOptionPane;

class practiceTwo {
    public static void main(String[]args){
        /* A code printing out the response in dialog box  */

        Scanner GirlBoy = new Scanner(System.in);

        System.out.println("Are you a girl or a boy ?");
        String girlboy = GirlBoy.next();

        if(girlboy.equals("Girl")) {
            JOptionPane.showMessageDialog(null, "Hello, Beautiful!!", "Display Message", JOptionPane.INFORMATION_MESSAGE);
        } else if(girlboy.equals("Boy")) {
            JOptionPane.showMessageDialog(null, "Hello, Handsome!!", "Display Message", JOptionPane.INFORMATION_MESSAGE );
        }
    }
}
