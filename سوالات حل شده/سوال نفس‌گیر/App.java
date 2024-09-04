import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] nafas = new int[2][n];
        // filling Array
        for (int i = 0; i < nafas.length; i++) {
            for (int j = 0; j < n; j++) {
                nafas[i][j] = scan.nextInt();
            }
        }
        // multiplying values in each column
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nafas[0][i] * nafas[1][i];
        }
        System.out.println(sum);
    }
}       
