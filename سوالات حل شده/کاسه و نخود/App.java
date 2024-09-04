import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int location = 1;
        for (int i = 0; i < n; i++) {
            int bowl1 = scan.nextInt();
            int bowl2 = scan.nextInt();
            if (bowl1 == location || bowl2 == location) {
                location = (location == bowl1) ? bowl2 : bowl1;
            }
        }
        System.out.println(location);
    }
}
