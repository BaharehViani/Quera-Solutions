import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
		    int squareX = scan.nextInt();
        int squareY = scan.nextInt();
        int r = scan.nextInt();
        int glassX = scan.nextInt();
        int glassY = scan.nextInt();
        
        if (glassX >= squareX && glassY <= squareY && glassX <= squareX + r && glassY >= squareY - r) {
            System.out.println("Mahdi");
        } else {
            System.out.println("Parsa");
        }
	}	
}       
