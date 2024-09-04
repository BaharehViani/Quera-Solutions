import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int t = scan.nextInt();
            if (t<=3) {
                for (int j = 0; j < t; j++) {
                    System.out.print("*");
                }
            }
            else {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
