import java.util.Scanner;
 
public class App {

	public static void main(String[] args) {
	  
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int count = 0;
		for (int i = 0; i < n-1; i++) {
			int z = scan.nextInt();
			if (z != x) {
				count++;
			}
			x = z;
		}
		System.out.println(count);
	}
}  
