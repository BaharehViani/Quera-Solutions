import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();
        int g = scan.nextInt();
        int h = scan.nextInt();

        if (a + b + c + d > e + f + g + h) {
            System.out.println("Gunnar"); 
        }
        else if (a + b + c + d < e + f + g + h) {
            System.out.println("Emma");
        }
        else {
            System.out.println("Tie");
        }
    }
}
