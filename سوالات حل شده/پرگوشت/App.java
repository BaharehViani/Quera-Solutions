import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            String row = scan.next();
            for (int j = 0; j < m; j++) {
                if (row.charAt(j) == '*') {
                    counter++;
                }
            }
        }
        System.out.print(counter + " ");
        counter = 0;
        for (int i = 0; i < n; i++) {
            String row = scan.next();
            for (int j = 0; j < m; j++) {
                if (row.charAt(j) == '*') {
                    counter++;
                }
            }
        }
        System.out.print(counter);
    }    
}
