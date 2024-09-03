import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        int[][] keyboard = new int[n][m];
        for (int i = 0; i < k; i++) {
            int r = scan.nextInt();
            int c = scan.nextInt();
            keyboard[r-1][c-1] = -1;
        }
        if (k % 2 == 1) {
            System.out.println(0);
        }
        else if (k >= n*m) {
            System.out.println(-1);
        } 
        else {
            System.out.println(1);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (keyboard[i][j] != -1) {
                        System.out.print(i+1 + " ");
                        System.out.print(j+1);
                        return;
                    }
                }
            }
        }
    }
}
