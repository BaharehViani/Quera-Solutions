import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double answer = Math.pow(a, b);
        System.out.printf("%.3f", answer);
	  }
}       
