import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = 0;
        if (n/2==0) {
            int x = n/2 + 1;
            max = x*x;
        }
        else {
            int x = Math.round(n/2);
            int y = n - x;
            max = (x+1)*(y+1);
        }
        System.out.println(max);
    }
}
