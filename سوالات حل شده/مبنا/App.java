import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int mabna = scan.nextInt();
        String str = Integer.toString(number, mabna);
        String sum1 = "", sum2 = "";
        for (int i = 0; i < str.length(); i+=2) {
            String str2 = String.valueOf(str.charAt(i));
            sum1 = sum1 + str2;
        }
        for (int i = 1; i < str.length(); i+=2) {
            String str2 = String.valueOf(str.charAt(i));
            sum2 = sum2 + str2;
        }
        int a = Integer.parseInt(sum1);
        int b = Integer.parseInt(sum2);
        int sumA = 0, sumB = 0;
        while (a > 0) {
            int x = a % 10;
            sumA = sumA + x;
            a = a / 10;
        }
        while (b > 0) {
            int x = b % 10;
            sumB = sumB + x;
            b = b / 10;
        }
        if (sumA == sumB) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }    
}
