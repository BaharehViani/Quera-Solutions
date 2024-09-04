import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        if (c <= 10) {
            System.out.print("Right ");
            System.out.print(10-r+1 + " ");
            System.out.print(c);
        }
        else {
            System.out.print("Left ");
            System.out.print(10-r+1 + " ");
            System.out.print(20-c+1);
        } 
    }
}
