import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int counter = 1;
        String str = "";

        while (true) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }
            if (counter == 1) {
                str = String.valueOf(n);
            }
            else {
                str = String.valueOf(n) + "\n" + str;
            }
            counter++;
        }
        System.out.println(str);
    }
}
