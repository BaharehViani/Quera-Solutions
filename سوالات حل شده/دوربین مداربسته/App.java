import java.util.Scanner;
 
public class App {

	public static void main(String[] args) {
	  
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int n4 = scan.nextInt();
		int n5 = scan.nextInt();
		int n6 = scan.nextInt();

		if (n1==n3) {
			System.out.print(n5 + " ");
		}
		else if (n1==n5) {
			System.out.print(n3 + " ");
		}
		else if (n3==n5) {
			System.out.print(n1 + " ");
		}
		
		if (n2==n4) {
			System.out.print(n6);
		}
		else if (n2==n6) {
			System.out.print(n4);
		}
		else if (n4==n6) {
			System.out.print(n2);
		}
	}
} 
