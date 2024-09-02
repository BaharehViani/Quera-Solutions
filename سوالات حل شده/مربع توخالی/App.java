import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        
        if (b >= a) {
            System.out.println("Wrong order!");
            return;
        }
        if ((a - b) % 2 != 0) {
            System.out.println("Wrong difference!");
            return;
        }
        // خطوط پر اول
        for (int i = 0; i < (a-b)/2; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // خطوط وسط که جای خالی هم دارن
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < (a-b)/2; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < b; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (a-b)/2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // خطوط پر آخر
        for (int i = 0; i < (a-b)/2; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}       
