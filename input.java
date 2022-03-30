 //READING NUMBERS FROM THE STANDARD INPUT
 import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
  /*In you compiler you have to input figures for a and b 
    3
    press enter
    4
    press entre
    7
  */
  
        int sum = a + b;

        System.out.println(sum);
    }
}
