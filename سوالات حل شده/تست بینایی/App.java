import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str1 = scan.next();
        String str2 = scan.next();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                counter++;
            } 
        }
        System.out.println(counter);
    }
}
