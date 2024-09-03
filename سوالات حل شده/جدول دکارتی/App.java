import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(" _");
            }
            System.out.println();
            for (int j = 0; j < c+1; j++) {
                System.out.print("| ");
            }
            System.out.println();
        }
        for (int i = 0; i < c; i++) {
            System.out.print(" _");
        }
    }
}
