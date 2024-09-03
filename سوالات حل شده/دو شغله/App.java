import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
	String rooz = scan.next();
        String[] hafte = {"shanbe","yekshanbe","doshanbe","seshanbe","chaharshanbe","panjshanbe","jome"};
        for (int i = 0; i < hafte.length; i++) {
            if (rooz.equals(hafte[i])) {
                if (i == 6) {
                    System.out.println("tatil");
                }
                else if (i % 2 == 0) {
                    System.out.println("perspolis");
                }
                else {
                    System.out.println("bahman");
                }
            } 
        }
    }
}
