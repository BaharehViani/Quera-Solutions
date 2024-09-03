import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String letter = scan.next();
        scan.close();
        char[] word = new char[letter.length()];
        for (int i = 0; i < word.length; i++) {
            word[i] = letter.charAt(i);
        }
        int counter = 1;
        for (int i = 0; i < word.length-1; i++) {
            if (word[i] == word[i+1]) {
                counter++;
            }
            else {
                if (counter % 2 == 1) {
                    break;
                }
                counter = 1;
            } 
        }
        if (counter % 2 == 0) {
            System.out.println("khoob");
        } else {
            System.out.println("bad");
        }
	} 
}       
