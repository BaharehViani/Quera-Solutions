import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char[] word = str.toCharArray();
        System.out.println(str);
        for (int i = 0; i < word.length-1; i++) {
            for (int j = i; j >= 0; j--) {
                word[j] = word[i+1];
            }
            for (char c : word) {
                System.out.print(c);
            }
            System.out.println();
        }
    }   
}             
