import java.util.Scanner;

public class practiceTwo {
    public static void main(String[]args){
       /* Write a program that reads four numbers and decrements each of them.
          The program must output the results in the same order separated by spaces.

            Sample Input 1:

            10 11 -2 -3
            Sample Output 1:

            9 10 -3 -4 */
        
        Scanner input = new Scanner(System.in);
        System.out.println("input any four numbers");
        int a = input.nextInt();// Read user input
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        System.out.println(--a +" "+ --b +" "+ --c +" "+ --d +" ");


    }
}
