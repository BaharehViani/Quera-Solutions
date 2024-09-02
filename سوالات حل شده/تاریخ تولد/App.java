import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int saal = n / 100;
        int maah = n % 100;

        if (saal < 10) {
            System.out.println("saal:0" + saal); 
        } else {
            System.out.println("saal:" + saal);
        }

        if (maah < 10) {
            System.out.println("maah:0" + maah); 
        } else {
            System.out.println("maah:" + maah);
        }
    }
}
