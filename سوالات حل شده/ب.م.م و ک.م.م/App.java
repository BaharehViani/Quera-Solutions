import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long x = scan.nextLong();
        long y = scan.nextLong();
      	long gcd, lcm, remainder, numerator, denominator;
      
        if (x > y) { 
            numerator = x;
            denominator = y;
        } else {
            numerator = y;
            denominator = x;
        }
        remainder = numerator % denominator;
        while (remainder != 0) {
            numerator = denominator;
            denominator = remainder;
            remainder = numerator % denominator;
        }
        gcd = denominator;
        lcm = (x * y)/gcd;

        System.out.print(gcd + " ");
        System.out.print(lcm);
	}
}             
