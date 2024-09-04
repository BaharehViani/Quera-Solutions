import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] travel = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                travel[i][j] = scan.nextInt();
            }
        }

        int totalPrice = 0;
        for (int i = 0; i < m; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            totalPrice += travel[x-1][y-1];
        }
        System.out.println(totalPrice);
    }
}                    
