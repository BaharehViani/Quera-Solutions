import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
        //fill array
        String[] name = new String[n];
        for (int i = 0; i < name.length; i++) {
            name[i] = scan.next();
        }
        // salam
        for (int i = 1; i < name.length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(name[i] + ": salam " + name[i-j] + "!"); 
            }
        }
        // khodafez
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i] + ": khodafez bacheha!");
            for (int j = 1; j < name.length-i; j++) {
                System.out.println(name[j+i] + ": khodafez " + name[i] + "!");
            }
        }
    }	
}       
