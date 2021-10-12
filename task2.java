public class Main {
    public static void main(String[] args) {
        //   Write a code to show the result of the following:

        //  y = x ++; means assign the value of x to y, then increment x by 1
        //   y = ++x; means increment x by 1, then assign this new value to y
        //   y + = x means y = y +x
        int y = 2;
        int x = 3;
        System.out.println(y = x++);
        System.out.println(y = ++x);
        System.out.println(y += x);
    }
} 
