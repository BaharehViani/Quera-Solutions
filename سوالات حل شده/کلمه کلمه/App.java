import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String[] names = name.split("");
        int count = 0;
        for (int i = 0; i < names.length; i++) {  
            if (names[i].equals("a") || names[i].equals("e") || names[i].equals("i") ||
                names[i].equals("o") || names[i].equals("u")) {
                count++;
            }
        }
        System.out.println((int)Math.pow(2,count));   
    }
}
