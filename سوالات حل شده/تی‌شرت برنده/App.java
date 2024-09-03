import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        if (x1 >= x2 && y1 >= y2) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
