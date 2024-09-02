import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int temperature = scan.nextInt();
            if (temperature > 15) {
                System.out.println("cooler");
            } else {
                System.out.println("heater");
            }
        }
    }
}
