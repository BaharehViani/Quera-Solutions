import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] hafte = {"shanbe", "1shanbe", "2shanbe", "3shanbe", "4shanbe", "5shanbe", "jome"};
        int counter = 7;
        String str = "";
      
        int n1 = scan.nextInt();
        for (int i = 0; i < n1; i++) {
            str = scan.next();
            for (int j = 0; j < hafte.length; j++) {
                if (str.equals(hafte[j])) {
                    counter--;
                    hafte[j] = "0";
                    break;
                }
            }
        }
      
        int n2 = scan.nextInt();
        for (int i = 0; i < n2; i++) {
            str = scan.next();
            for (int j = 0; j < hafte.length; j++) {
                if (str.equals(hafte[j])) {
                    counter--;
                    hafte[j] = "0";
                    break;
                }
            }
        }

        int n3 = scan.nextInt();
        for (int i = 0; i < n3; i++) {
            str = scan.next();
            for (int j = 0; j < hafte.length; j++) {
                if (str.equals(hafte[j])) {
                    counter--;
                    hafte[j] = "0";
                    break;
                }
            }
        }
        System.out.println(counter);
	  }
}       
