import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String adad1 = scan.next();
        String adad2 = scan.next();

        if (adad1.charAt(2) > adad2.charAt(2)) {
            System.out.println(adad2 + " < " + adad1);
        }
        else if (adad1.charAt(2) < adad2.charAt(2)) {
            System.out.println(adad1 + " < " + adad2);
        }
        else if (adad1.charAt(1) > adad2.charAt(1)) {
            System.out.println(adad2 + " < " + adad1);
        }
        else if (adad1.charAt(1) < adad2.charAt(1)) {
            System.out.println(adad1 + " < " + adad2);
        }
        else if (adad1.charAt(0) > adad2.charAt(0)) {
            System.out.println(adad2 + " < " + adad1);
        }
        else if (adad1.charAt(0) < adad2.charAt(0)) {
            System.out.println(adad1 + " < " + adad2);
        }
        else if (adad1.charAt(0) == adad2.charAt(0) &&
                 adad1.charAt(1) == adad2.charAt(1) &&
                 adad1.charAt(2) == adad2.charAt(2)) {
            System.out.println(adad2 + " = " + adad1);
        }
    }
}
