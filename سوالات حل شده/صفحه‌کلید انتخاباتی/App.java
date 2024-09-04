import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String letter = "";
        String word = "";
        boolean caps = false;
        int counter = 1;

        for (int i = 0; i < n; i++) {
            letter = scan.next();
            if (letter.equals("CAPS") && counter % 2 == 1) {
                counter++;
                caps = true;
                continue;
            }
            else if (letter.equals("CAPS") && counter % 2 == 0) {
                counter++;
                caps = false;
                continue;
            } 
            if (caps) {
                word += letter.toUpperCase();
            } else {
                word += letter;
            }
        }
        System.out.println(word);
    }
}       
