import java.math.BigInteger;
import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        BigInteger a = scan.nextBigInteger();
        BigInteger sum = a;
        for (int i = 0; i < n-1; i++) {
            BigInteger b = scan.nextBigInteger();
            sum = a.add(b);
            a = sum;
        }
        System.out.println(sum);
    }   
}       
