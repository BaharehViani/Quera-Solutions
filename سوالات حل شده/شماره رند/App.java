import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            boolean shart1=false, shart2=false, shart3=false;
            String number = scan.next();
            char[] shomare = new char[8];
            for (int j = 0; j < 8; j++) {
                shomare[j] = number.charAt(j);
            }
            // shart1
            int counter = 1;
            for (int j = 0; j < shomare.length; j++) {
                for (int j2 = 1; j2 < shomare.length; j2++) {
                    if (j+j2 == 8) {
                        break;
                    }
                    if (shomare[j] == shomare[j+j2]) {
                        counter++;
                    }
                }
                if (counter == 4) {
                    shart1 = true;
                    break;
                }
                counter = 1;
            }
            // shart2
            for (int j = 0; j < 8; j++) {
                if (j == 6) {
                    break;
                }
                if (shomare[j] == shomare[j+1] && shomare[j+1] == shomare[j+2]) {
                    shart2 = true;
                    break;
                }
            }
            // shart3
            String baraksNumber = "";
            for (int j = 7; j >= 0; j--) {
                baraksNumber += shomare[j];
            }
            if (number.equals(baraksNumber)) {
                shart3 = true;
            }
            // print answer
            if (shart1 || shart2 || shart3) {
                System.out.println("Ronde!");
            }
            else if ((shart1=shart2=shart3) == false) {
                System.out.println("Rond Nist");
            }
        }
    } 
}       
