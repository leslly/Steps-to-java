/A shop keeper sold 10 bags at the rate of 500 naira each with a discount of 5% on the total sales.
 //How much did the buyer pay. Write a program to compute this.

public class Main {

    public static void main(String[] args) {
        int numberOfBags = 10;
        int rate = 500;
        int sellingPrice = (numberOfBags * rate ) / 20 ;
        // 5% is 1/20
        System.out.println(numberOfBags * rate);
        System.out.printf("Final price after discount:" + sellingPrice);
    }
}
