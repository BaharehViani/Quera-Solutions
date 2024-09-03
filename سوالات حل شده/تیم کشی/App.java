import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        int b1 = scan.nextInt();
        int a2 = scan.nextInt();
        int b2 = scan.nextInt();
        int a3 = scan.nextInt();
        int b3 = scan.nextInt();
        int team1 = a1 > b1 ? b1 : a1;
        int team2 = a2 > b2 ? b2 : a2;
        int team3 = a3 > b3 ? b3 : a3;
        System.out.println(team1 + team2 + team3);
    }
}
