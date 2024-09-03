import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        String[] array = new String[m];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            array = scan.next().split("");
            for (int j = 0; j < m; j++) {
                if(array[j].equals("*")) {
                    counter++;
                }
            }
        }  
        System.out.println(counter);
    }
}
