import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a>0 && b>0 && c>0 && a+b+c ==180) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
