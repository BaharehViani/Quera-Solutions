import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x1 = scan.nextInt();
        int v1 = scan.nextInt();
        int x2 = scan.nextInt();
        int v2 = scan.nextInt();
        
        if (v1 == v2) {
            System.out.println("WAIT WAIT");
        }
        else if ((v2 > v1 && x2 > x1) || (v1 > v2 && x1 > x2)) {
            System.out.println("BORO BORO");
        }
        else if ((v1 > v2 && x2 > x1) || (v2 > v1 && x1 > x2)) {
            System.out.println("SEE YOU");
        }
    } 
} 
