import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x-y == 0 || x-y == 2) {
                if (x % 2 == 0) {
                    System.out.println(x+y);
                } else {
                    System.out.println(x+y-1);
                }
            } 
            else {
                System.out.println(-1);
            }
        }
    }
}
