import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++ ) {
            factorial = factorial*i;
		    }
        System.out.println(factorial);
    }
}
