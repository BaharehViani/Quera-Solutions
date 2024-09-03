import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String music1 = scan.next();
        String music2 = scan.next();
        String music3 = scan.next();
        String music4 = scan.next();
        if (music1.equals(music2) || music3.equals(music4) || music1.equals(music4) || music2.equals(music3)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
	  } 
}       
