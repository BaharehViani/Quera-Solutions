import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        n = 2*n+1;
        n = n/2+1;

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n-i-1 ; j++){
                System.out.print(" "); 
            }
            for(int j=0 ; j<2*i+1 ; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(int i=0 ; i<n-1 ; i++){
            for(int j=0 ; j<n+i-(n-1) ; j++){
                System.out.print(" ");
            }
            for(int j=0 ; j<(n*2)-3-i-i ; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
