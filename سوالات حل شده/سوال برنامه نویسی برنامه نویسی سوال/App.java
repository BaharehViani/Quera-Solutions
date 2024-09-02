import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String sentence = "", word = "";
        for (int i = 0; i < n; i++) {
            word = scan.next();
            if (i == 0) {
                sentence = word;
            }
            else {
                sentence = word + " " + sentence;
            }    
        }
        System.out.println(sentence);
    }
}
