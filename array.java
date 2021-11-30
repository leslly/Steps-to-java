/*Write a program to find the largest element in an array of size 10
A program to find a particular element in an array 
This element sould exist in the array*/





import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double [] h={1,2,3,4,5,6,7,8,9,10};
        int num;
      //  h = new double[10];


        System.out.println("Input any value of your choice between 1 to 10");
        num=input.nextInt();

        boolean result=readH(h,num);
        if(result){
            System.out.println("The Value Exist in the Array");
        }
        else{
            System.out.println("The Value does not exist in the Array");
        }

    }

    static boolean readH(double[]high,int n){
        boolean flag=false;
        int i;
        for ( i=0 ; i<high.length; i++){

          if(high[i]==n){
             // System.out.println(i);
            flag=true;
            break;
          }


        }


       return flag;
    }

}

