import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int c = scan.nextInt();
            k -= c;
        }
        if (k <= 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }  
    }
}
