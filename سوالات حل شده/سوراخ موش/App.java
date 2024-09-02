import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int x2 = scan.nextInt();
        if (x1 == x2) {
            System.out.println("Saal Noo Mobarak!"); 
        }
        else if (x2 > x1) {
            int ekhtelaf = x2 - x1;
            for (int i = 0; i < ekhtelaf; i++) {
                System.out.print("R");
            }
        }
        else {
            int ekhtelaf = x1 - x2;
            for (int i = 0; i < ekhtelaf; i++) {
                System.out.print("L");
            } 
        }
    }
}  
