import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0, count = 0;
    		for (int i = 1; i <= n; i++) {
    			for (int j = 1; j <= i; j++){
    				if (i % j == 0) {
    					sum += j;
    					count++;
    				}
    			} 
    		}
        System.out.println(count + " " + sum);
    }    
}       
