import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] pelle = new int[n + 4];
        pelle[0] = 1;
        pelle[1] = 1;
        pelle[2] = 2;
        pelle[3] = 3;
        pelle[4] = 5;

        for (int i = 5; i <= n; i++) {
            pelle[i] = pelle[i - 1] + pelle[i - 2] + pelle[i - 5];
        }
        System.out.println(pelle[n]);
    }
}
