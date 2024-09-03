import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
	String str = scan.next();
        StringBuilder sb = new StringBuilder(str);
        
        for (int j = 0; j < sb.length(); j++) {
            if (sb.charAt(0) == '=') {
                sb.deleteCharAt(0);
                j -= 1;
            }
            else if (sb.charAt(j) == '=') {
                sb.deleteCharAt(j);
                sb.deleteCharAt(j-1);
                j -= 2;
            }
        }
        System.out.println(sb);
    }
}
