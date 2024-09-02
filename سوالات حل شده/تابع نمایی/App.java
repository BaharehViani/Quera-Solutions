import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        double e = 1 , surat , makhraj = 1;

        for (int i = 1; i < n; i++) {
            surat = Math.pow(x, i);
            for (int j = i; j > 0; j--) {
                makhraj *= j; 
            }
            e += surat / makhraj;
            makhraj = 1;
        }
        System.out.printf("%.3f", e);
    }
}                       
