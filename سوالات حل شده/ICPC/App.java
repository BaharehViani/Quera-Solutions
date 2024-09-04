import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int p1 = scan.nextInt();
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int p2 = scan.nextInt();
        if (p1 + p2 > s1 + s2 || p2 > s1) {
            System.out.println("Persepolis");
        }
        else if (s1 + s2 > p1 + p2 || s1 > p2) {
            System.out.println("Esteghlal");
        }
        else {
            System.out.println("Penalty");
        }
	}	
}       
