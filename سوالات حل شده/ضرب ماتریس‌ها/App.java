import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
      
        //size of matrix A
        int r_a = scan.nextInt();
        int c_a = scan.nextInt();

        //size of matrix B
        //int r_b = scan.nextInt(); == c_a
        int c_b = scan.nextInt();

        int[][] A = new int[r_a][c_a];
        int[][] B = new int[c_a][c_b];
        int[][] E = new int[r_a][c_b];

        // A
        for (int r = 0; r < r_a; r++) {
            for (int c = 0; c < c_a; c++) {
                A[r][c] = scan.nextInt();
            }
        }

        // B
        for (int r = 0; r < c_a; r++) {
            for (int c = 0; c < c_b; c++) {
                B[r][c] = scan.nextInt();
            }
        }

        // E = A * B
        for (int r = 0; r < r_a; r++) {
            for (int c = 0; c < c_b; c++) {
                for (int i = 0; i < c_a; i++) {
                    E[r][c] += A[r][i] * B[i][c];
                }
            }
        }

        // print E
        for (int r = 0; r < r_a; r++) {
            for (int c = 0; c < c_b; c++) {
                System.out.print(E[r][c] + " ");
            }
            System.out.println();
        }
    }
}       
