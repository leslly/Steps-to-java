public class Main {

    public static void main(String[] agrs)  {
        //note:scanner is used to input
        //another way is BufferedReader
        Scanner input = new Scanner(System.in);
        /*  input methods
        * methods are used to read specific type of data from the keyboard
        * input.next(); read a string
        * input.nextInt(); read integer
        * input.nextDouble(); read double
        *  .nextByte(), .nextBoolean(), .nextLong(), .nextShort(), .nextFloat()
        * n/b:input.nextLine(), prints out a whole line instead of just the first string
       */

         int firstNumber, secondNumber ;
        System.out.println("Enter first number:");
         firstNumber =input.nextInt() ;
        // System.out.println("first number:"+input.nextInt());

         System.out.println("Enter second number:");
        secondNumber= input.nextInt() ;
        // System.out.println("second number:"+input.nextInt());

        if(firstNumber>secondNumber){
            System.out.println(firstNumber);
        }else{
            System.out.println(secondNumber);
        }
    }
}
