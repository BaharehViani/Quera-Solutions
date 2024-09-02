import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int tavan = 1;
        for (int i = 0; i < n; i++) {
            tavan *= 2;
            if (tavan >= n) {
                System.out.println(tavan);
                break;
            }  
        } 
    }
}
