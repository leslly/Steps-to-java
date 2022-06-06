import java.util.Scanner;
// input: 320, output: 023
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reverseNum = 0;
        final int multiplier = 10;
        
        while (number != 0) {
            int remainder = number % multiplier;
            reverseNum = reverseNum * multiplier + remainder;
            number = number / multiplier;
        }
        
        System.out.println(reverseNum);
    }
}
