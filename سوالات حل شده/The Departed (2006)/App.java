import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean cia_jet = false;
        for (int i = 0; i < 5; i++) {
            String str = scan.next();
            if (str.contains("FBI")) {
                System.out.print(i+1 + " ");
                cia_jet = true;
            }
        }
        if (cia_jet == false) {
            System.out.println("HE GOT AWAY!");
        }
    }    
}
