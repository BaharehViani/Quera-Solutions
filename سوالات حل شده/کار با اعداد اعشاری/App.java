import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
        float max=0, min=0, avg=0;

        for (int i = 0; i < n; i++) {
            float number = scan.nextFloat();
            if (i==0) {
                max = number;
                min = number;
                avg = number;
            } else {
                max = number > max ? number : max;
                min = min < number ? min : number;
                avg += number;
            }
        }
        scan.close();
        
        System.out.printf("Max: %.3f \n", max);
        System.out.printf("Min: %.3f \n", min);
        System.out.printf("Avg: %.3f \n", avg/n);
    }	
}       
