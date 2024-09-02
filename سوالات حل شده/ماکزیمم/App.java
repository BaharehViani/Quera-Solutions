import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            max = Math.max(max , x);
        }
        System.out.println(max);
    }
}
