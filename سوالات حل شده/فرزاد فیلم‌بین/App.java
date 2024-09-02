import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = Integer.parseInt(str);
        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            System.out.println(capitalize(name));
        }
	}
  public static String capitalize(String name) {
        
        String[] words = name.split("\\s");
        String capitalizedWord = "";
        for (String w:words) {  
            String first = w.substring(0,1);  
            String afterfirst = w.substring(1);  
            capitalizedWord += first.toUpperCase() + afterfirst.toLowerCase() + " ";  
        } 
        return capitalizedWord.trim();
   }
}       
