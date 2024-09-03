import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
 
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] board = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = scan.nextInt();
            }
        }
        int counter = 0;
        for (int i = 1; i < n-1; i++) {
            for (int j = 1; j < m-1; j++) {
                if (board[i][j] > board[i][j-1] && board[i][j] > board[i][j+1] &&
                    board[i][j] < board[i-1][j] && board[i][j] < board[i+1][j]) {
                    counter++;
                }
                else if (board[i][j] < board[i][j-1] && board[i][j] < board[i][j+1] &&
                    board[i][j] > board[i-1][j] && board[i][j] > board[i+1][j]) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
	}	
}       
