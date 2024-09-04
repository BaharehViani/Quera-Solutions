import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int array[] = new int[n+1];
        array[0] = 1;
        array[1] = 2;

        for (int i = 2; i < n; i++) {
            array[i] = array[i-1] + array[i-2];
        }
 
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if(i == array[j]){
                System.out.print("+");
                j++;
            }
            else {
                System.out.print("-");
            }    
        }
    }
}
