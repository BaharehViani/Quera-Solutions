import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String number = scan.next();
        String baraksNumber = "";
        for (int i = number.length(); i > 0; i--) {
            baraksNumber += number.charAt(i-1);
        }
        if (number.equals(baraksNumber)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
	  } 
}       
