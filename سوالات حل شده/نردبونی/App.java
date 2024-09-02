import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

		  long x = scan.nextLong();
        long y = scan.nextLong();
        if (x < 0) {
            x = Math.abs(x);
        }
        if (y < 0) {
            y = Math.abs(y);
        }
        if (x == 0) {
            System.out.print(y);
        }
        else if (y == 0) {
            System.out.print(x);
        } 
        else {
            System.out.print(gcd(x, y));
        }
    }

    public static long gcd(Long x, Long y) {
        long r = 0, a, b;
        a = (x > y) ? x : y; 
        b = (x < y) ? x : y;
        r = b;
        while (a % b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
}
