 /*You need to write a program to display the resulting grid of a Tic-Tac-Toe game.

The grid is shown below.

O X X
O X O
X O X
Note, O is not a zero, it is a capital letter just like X.
Where the first square bracket is for row
second is for column
   */
public class practice {
    public static void main(String[]args) {
        String [][] name = {
                {"0","x","x"},
                {"0","x","0"},
                {"x","0","x"},

        };
        for(int i=0;i<3;i++){
            for(int j=0;j<3; j++){

                System.out.print(name[i][j]+ "  ");
            }
            System.out.println();
        }

     
    }
}
