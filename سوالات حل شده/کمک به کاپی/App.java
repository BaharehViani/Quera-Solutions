import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();

        for (int i = 0; i < n; i++) {
            System.out.print("copy of ");
        }
        System.out.print(str);     
    }
}
