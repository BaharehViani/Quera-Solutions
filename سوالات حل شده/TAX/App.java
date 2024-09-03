import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int income, tax;
        while (true) {
            income = scan.nextInt();
            if (income == 0) {
                break;
            }
            if (income <= 1000000) {
                System.out.println(income);
            }
            else if (income <= 5000000) {
                tax = income / 10;
                System.out.println(income - tax);
            }
            else {
                tax = (income * 2) / 10;
                System.out.println(income - tax);
            }
        }
    } 
}
