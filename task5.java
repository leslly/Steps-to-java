import java.util.Scanner;

public class Main{
    //using 1hour 30mins 30seconds=5430seconds
    //write a program to convert time in seconds to hours, minutes and seconds
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter seconds:" );
        int sec=sc.nextInt();
        int x1=sec%60;//310%60=10
        int x2=sec/60;//310/60=5
        int x3= x2%60;//5%60=5
        x2=x2/60;

        System.out.println("HH:MM:SS-"+x2+":"+x3+":"+x1);
    }
}
