import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        if (n % 8 == 1) {
            System.out.println("c");
        }
        else if (n % 8 == 2) {
            System.out.println("o");
        }
        else if (n % 8 == 3) {
            System.out.println("d");
        }
        else if (n % 8 == 4) {
            System.out.println("e");
        }
        else if (n % 8 == 5) {
            System.out.println("c");
        }
        else if (n % 8 == 6) {
            System.out.println("u");
        }
        else if (n % 8 == 7) {
            System.out.println("p");
        }
        else if (n % 8 == 0) {
            System.out.println("6");
        }
    }
}    
