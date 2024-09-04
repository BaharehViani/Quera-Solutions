import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        if (n % m == 0) {
            System.out.println(n/m);
        }
        else {
            System.out.println((n/m)+1);
        } 
    }
}
