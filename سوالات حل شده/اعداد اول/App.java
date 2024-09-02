import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
      
        int a = scan.nextInt();
        int b = scan.nextInt();
      
        for (int i = a; i <= b; i++) {
            int count = 0;
            for (int j = 1 ; j <= i ; j++) {
				        if (i % j == 0) {
					        count += 1;
                }    
			      }
            if(count == 2) {
				        System.out.println(i);
            }
        }
        scan.close();
    }
}
