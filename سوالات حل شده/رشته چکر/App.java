import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
		    String str1 = scan.next();
        String str2 = scan.next();
        if (str1.charAt(0) == str2.charAt(str2.length()-1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }  
	  }	
}       
