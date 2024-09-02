import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int number;
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + ": ");
            number = Character.getNumericValue(str.charAt(i));
            for (int j = 0; j < number; j++) {
                System.out.print(number);
            }
            System.out.println();
        }
    } 
}       
