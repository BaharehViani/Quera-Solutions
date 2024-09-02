import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        if (k % 2 != 0) {
            System.out.println("Payin Barare");
        }
        else {
            System.out.println("Bala Barare");
        }
    }
}
