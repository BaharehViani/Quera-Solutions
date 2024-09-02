import java.util.Scanner;
 
public class App {

	public static void main(String[] args) {
	  
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int hour = 12 - n1;
		int minute = 60 - n2;

		if (n1==0 && n2==0) {
			System.out.print("00:00");
		}
		else if (n1==0) {
			System.out.print("00:");
		}
		else if (hour < 10) {
			System.out.print("0" + hour + ":");
		}
		else {
			System.out.print(hour + ":");
		}
		
		if (n1==0 && n2==0) {
		}
		else if (n2==0) {
			System.out.print("00");
		}
		else if (minute < 10) {
			System.out.print("0" + minute);
		}
		else {
			System.out.print(minute);
		}
	}
}  
