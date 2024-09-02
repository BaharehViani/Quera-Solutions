import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> money = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            names.add(scan.next());
            money.add(scan.nextInt());
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < money.size(); i++) {
            if (money.get(i) > max) {
                max = money.get(i);
                index = i;
            }
        }
        System.out.println(names.get(index));
    }
}
