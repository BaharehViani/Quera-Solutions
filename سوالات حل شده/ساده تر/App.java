import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        double sum = a + b + c + d;
        double average = sum / 4;
        double product = a * b * c * d;
        double max = Math.max(d, Math.max(c, Math.max(a,b)));
        double min = Math.min(d, Math.min(c, Math.min(a,b)));
      
        System.out.printf("Sum : %.6f \n", sum);
        System.out.printf("Average : %.6f \n", average);
        System.out.printf("Product : %.6f \n", product);
        System.out.printf("MAX : %.6f \n", max);
        System.out.printf("MIN : %.6f \n", min);
    }
}
