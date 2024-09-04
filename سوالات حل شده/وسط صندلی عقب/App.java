import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] name = new String[4];
        String[] enterance = new String[4];
        for (int i = 0; i < 4; i++) {
            name[i] = scan.next();
            enterance[i] = scan.next();
        }
        int left = 0, right = 0, count = 0;
        for (int i = 0; i < enterance.length; i++) {
            if (enterance[i].equals("L")) {
                left++;
            }
            else if (enterance[i].equals("R")) {
                right++;
            }
        }
        if (left % 2 == 0 && right != 3) {
            for (int i = 0; i < enterance.length; i++) {
                if (enterance[i].equals("L")) {
                    System.out.println(name[i]);
                    break;
                }
            }
        }
        else if (right % 2 == 0 && left != 3) {
            for (int i = 0; i < enterance.length; i++) {
                if (enterance[i].equals("R")) {
                    System.out.println(name[i]);
                    break;
                }
            }
        }
        else if (left % 2 == 1) {
            for (int i = 0; i < enterance.length; i++) {
                if (enterance[i].equals("L")) {
                    count++;
                    if (count==1) {
                        continue;
                    } else {
                        System.out.println(name[i]);
                        break;
                    }
                }
            }
        }
        else {
            for (int i = 0; i < enterance.length; i++) {
                if (enterance[i].equals("R")) {
                    count++;
                    if (count==1) {
                        continue;
                    } else {
                        System.out.println(name[i]);
                        break;
                    }
                }
            }
        }
	}	
}       
