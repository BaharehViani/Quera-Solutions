import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 0) {
            System.out.println(n / 2);
        } 
        else {
            for (int i = 3; i <= Math.sqrt(n); i+=2) {
                if (n % i == 0) {
                    System.out.println(n / i);
                    return;
                }
            }
            System.out.println(1);           
        }
	}	
}       
