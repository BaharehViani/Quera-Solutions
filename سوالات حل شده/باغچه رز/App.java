import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

		    int n = scan.nextInt();
        int m = scan.nextInt();
        char[][] flower = new char[m][n];
        String row = "";
        for (int i = 0; i < m; i++) {
            row = scan.next();
            for (int j = 0; j < n; j++) {
                flower[i][j] = row.charAt(j);
            }
        }
        int counter = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (flower[i][j] == 'W') {
                    counter++;
                }
            }
            if (counter % 2 == 0) {
                System.out.print("B");
            } else {
                System.out.print("F");
            }
            counter = 0;
        }  
    }    
}
