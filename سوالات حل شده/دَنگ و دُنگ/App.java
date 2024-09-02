import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int S = scan.nextInt();
            int a = scan.nextInt();
            int varizi = (S - a) / n;
            if (varizi > 0 && (S - a) % n == 0) {
                System.out.println(varizi);
            }
            else {
                System.out.println(-1);
            }
        }
    }
}    
