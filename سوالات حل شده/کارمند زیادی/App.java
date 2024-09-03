import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] name = new String[n];
        int counter = 1, max = 0;
      
        for (int i = 0; i < n; i++) {
            String firtName = scan.next();
            String lastName = scan.next();
            name[i] = firtName;
        }

        for (int i = 0; i < name.length; i++) {
            for (int j = i; j < name.length-1; j++) {
                if (name[i].equals(name[j+1])) {
                    counter++;
                }
            }
            max = counter > max ? counter : max;
            counter = 1;
        }
        System.out.println(max);
	}   
} 
