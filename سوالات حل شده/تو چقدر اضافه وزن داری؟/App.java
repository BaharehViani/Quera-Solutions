import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double m = scan.nextDouble();
        double BMI = n / (m*m);
        System.out.printf("%.2f \n", BMI);
        if (BMI < 18.5) {
            System.out.printf("Underweight");
        }
        else if (BMI >= 18.5 && BMI < 25) {
            System.out.printf("Normal");
        }
        else if (BMI >= 25 && BMI < 30) {
            System.out.printf("Overweight");
        }
        else {
            System.out.printf("Obese");
        }        
    }
}
