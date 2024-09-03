import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] skill = new int[4][3];
        int max = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                skill[i][j] = scan.nextInt();
                max = skill[i][j] >= max ? skill[i][j] : max;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (skill[i][j] == max) {
                    System.out.println(i+1);
                }
            }
        }
    }	
}
