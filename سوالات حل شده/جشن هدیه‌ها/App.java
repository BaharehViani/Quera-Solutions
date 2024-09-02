import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
        String[] names = new String[n];
        int[] profit = new int[n];
        for (int i = 0; i < names.length; i++) {
            names[i] = scan.next();
        }
        for (int i = 0; i < n; i++) {
            String str = scan.next();
            int money = scan.nextInt();
            int people = scan.nextInt();
            for (int j = 0; j < n; j++) {
                if (str.equals(names[j])) {
                    profit[j] += -money;
                    if (people == 0) {
                        break;
                    } else {
                        profit[j] += money % people;
                        break;
                    }
                }
            }
            for (int j = 0; j < people; j++) {
                String name = scan.next();
                for (int k = 0; k < n; k++) {
                    if (name.equals(names[k])) {
                        profit[k] += money/people;
                        break;
                    }
                }    
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(names[i] + " ");
            System.out.print(profit[i]);
            System.out.println();
        }
    }    
}
