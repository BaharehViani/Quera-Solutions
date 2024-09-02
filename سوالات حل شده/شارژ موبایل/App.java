import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int sum = 0, javab = 0;
        for (int i = 0; i < k; i++) {
            sum = i + 1;
            javab += sum;
        }
        System.out.println(javab);
    }
}
