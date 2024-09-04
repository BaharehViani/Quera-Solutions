import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] haftsin = {"sib", "samanoo", "senjed", "seke", "serke", "sabze", "saat"};
        for (int i = 0; i < n; i++) {
            System.out.println(haftsin[i]);
        }
    }
}
