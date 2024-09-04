import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        int k = scan.nextInt();
        for (int i = 0; i < k; i++) {
            n = n / 2;
        }
        double y = Math.floor(n);
        int z = (int)y;
        System.out.println(z);
    }
}
