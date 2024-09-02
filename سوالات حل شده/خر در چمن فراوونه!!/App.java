import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int l = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < l/2; i++) {
            sum += a+b;
        }
        if (l % 2 != 0) {
            sum += a;
        } 
        System.out.println(sum);
    } 
} 
