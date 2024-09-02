import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long sum = 0;
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}       
