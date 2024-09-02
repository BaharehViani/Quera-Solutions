import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (n != i) {
                    sum += i;  
                }
            }
        }
        if (sum == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
