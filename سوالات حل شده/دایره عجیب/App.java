import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int hasani = 1, count = 1;
        if (n==k) {
            System.out.println(count);
            return;
        }
        hasani+=k;
        while (hasani!=1) {
            hasani+=k;
            count++;
            if (hasani>=n) {
                hasani-=n;
            }
        }
	System.out.println(count);
    }
} 
