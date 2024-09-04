import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] weight = new int[n];
    
        for (int i = 0; i < weight.length; i++) {
            weight[i] = scan.nextInt();
        }
        int max = 0;
        for (int i = 0; i < weight.length-1; i++) {
            max = weight[i] > max ? weight[i] : max;
        }
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] == max) {
                System.out.println(i+1);
            }
        }
    }
}
