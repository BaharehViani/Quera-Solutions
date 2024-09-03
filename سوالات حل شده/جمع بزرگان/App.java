import java.math.BigInteger;
import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        BigInteger x = scan.nextBigInteger();
	tring str = scan.next();
        BigInteger y = scan.nextBigInteger();
        scan.close();

        if (str.equals("+")) {
    		System.out.print(x.add(y));
    	} else {
		System.out.print(x.multiply(y));
	}
    }
}
