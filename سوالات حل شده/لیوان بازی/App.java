import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String position = scan.next();
        for (int i = 0; i < n; i++) {
            String switchPosition1 = scan.next();
            String switchPosition2 = scan.next();
            if (switchPosition1.equals(position) || switchPosition2.equals(position)) {
                if (position.equals(switchPosition1)) {
                    position = switchPosition2;
                } else {
                    position = switchPosition1;
                }
            }
        }
        System.out.println(position);
    }
}       
