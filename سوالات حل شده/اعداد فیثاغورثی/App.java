import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        boolean shart1 = (a*a == b*b + c*c);
        boolean shart2 = (b*b == c*c + a*a);
        boolean shart3 = (c*c == a*a + b*b);

        if (shart1 || shart2 || shart3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
