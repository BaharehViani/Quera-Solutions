import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        if (n==0) {
            System.out.println(20);  
        }
        else if(n==7) {
            System.out.println(x);
        }
        else if(x >= n) {
            System.out.println(x - n);
        }
        else if(x < n){
            System.out.println(0);
        }
    }
}
