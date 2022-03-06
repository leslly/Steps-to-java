import java.util.Scanner;
public class practice {
   public static void main(String[]args){

      /* Imagine that you are an HR manager at a restaurant and you need to hire a chef.
       To do that, you need to collect some preliminary data about the candidates.
     You have a special form for the candidates that includes 3 fields: first name, years of experience and cuisine preference.
    Your program should read all the words (or numbers) from the three lines and output "The form for first name is completed.
     We will contact you if we need a chef who cooks cuisine preference dishes and has years of experience years of experience."
     */
       Scanner scanner = new Scanner(System.in);

               int number = 8;


               String Eugene = scanner.next();
               number = scanner.nextInt();
               String fusion = scanner.next();

               System.out.println("The form for " + Eugene + " is completed. We will contact you if we need a chef who cooks " + fusion + " dishes and has "+ number +" years of experience.");
               /* when solving this problem or coding, the most occurent mistake was space before and after the '+' sign.
               my output would come out something like
               ... cooksfusion dishes ...
               which would cause me to fail the test
               look out for syntax errors 
               codestyle is another thing i got errors for and i'm learning the approriate code style because it is not just enough to know the syntax of
               a programming language. you must also pay mind to placement.*/
       }

   }
