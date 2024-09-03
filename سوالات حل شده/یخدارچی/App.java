import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        if (t>100) {
            System.out.print("Steam"); 
        }
        else if(t<0) {
            System.out.print("Ice");
        }
        else {
            System.out.print("Water");
        }
    }
}
