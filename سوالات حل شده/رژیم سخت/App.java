import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String barchasb = scan.next();
        int red = 0;
        int yellow = 0;
      
        for (char i : barchasb.toCharArray()) {
            if (String.valueOf(i).equals("R")) {
                red++;
            }
            else if (String.valueOf(i).equals("Y")) {
                yellow++;
            }
        }

        if (red >= 3 || (red >= 2 && yellow >= 2) || yellow == 5 || red == 5 || (yellow == 4 && red == 1)) {
            System.out.println("nakhor lite");
        }
        else {
            System.out.println("rahat baash");
        }
    }
}
