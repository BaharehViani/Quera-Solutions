import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int R = scan.nextInt();
		    String firstString = "1";
        String lastString = "1";
 
        for (int i = 0; firstString.length() <= R + 1; i++) {
            if (i == 0) {
                firstString = "10";
                lastString = "01";
            }
            String temp = lastString + firstString;
            firstString += lastString;
            lastString = temp;
        }
        System.out.println(firstString.substring(L - 1,R));
    }    
}       
