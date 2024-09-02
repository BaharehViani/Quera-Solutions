import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        scan.close();
        double answer1 = 0, answer2 = 0, delta;
        boolean entered = false, not_printed = false;
        if (a == 0 && b == 0) {
            System.out.println("IMPOSSIBLE");
        }
        else if ((a == 0 && c == 0) || (b == 0 && c == 0)) {
            answer1 = 0;
            not_printed = true;
        }
        else if (a == 0) {
            answer1 = -c/b;
            not_printed = true;
        }
        else if (b == 0) {
            if ((c > 0 && a > 0) || (c < 0 && a < 0)) {
                System.out.println("IMPOSSIBLE");
            } else {
                answer1 = Math.sqrt(-c/a);
                answer2 = -Math.sqrt(-c/a);
                entered = true;
            }
        }
        else {
            delta = Math.pow(b, 2) - (4*a*c);
            if (delta < 0) {
                System.out.println("IMPOSSIBLE");
            }
            else if (delta == 0) {
                answer1 = -b / (2*a);
                not_printed = true;
            }
            else {
                answer1 = (-b + Math.sqrt(delta)) / (2*a);
                answer2 = (-b - Math.sqrt(delta)) / (2*a);
                entered = true;
            }
        }
        if (entered) {
            if (answer1 > answer2) {
                System.out.printf("%.3f\n", answer2);
                System.out.printf("%.3f", answer1);
            } else {
                System.out.printf("%.3f\n", answer1);
                System.out.printf("%.3f", answer2);
            }
        }
        else if (not_printed) {
            System.out.printf("%.3f", answer1);
        }
	  } 
}       
