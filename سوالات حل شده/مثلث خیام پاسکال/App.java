import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        for (int i = 0; i < row; i++) {
            int num=1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i-j) / (j+1);
            }
            System.out.println();
        }
	} 
}       
