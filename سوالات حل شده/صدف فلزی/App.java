import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
	int t = scan.nextInt();
        int w = scan.nextInt();
        double temp = 0;
        for (int i = 0; i < w; i++) {
            temp += 1 / Math.pow(2, i);
        }
        double d = t / temp; 
        System.out.printf("%.4f", d);
    }	
}
