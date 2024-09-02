import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int tavan, sigma = 0;

        for (int i = -10; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                tavan = (int)Math.pow(i + j, 3);
                sigma += tavan / (int)Math.pow(j, 2);
            }
        }
        System.out.println(sigma);
    }
}
