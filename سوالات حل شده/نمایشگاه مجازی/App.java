import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
	int k = scan.nextInt();
	int counter = 1;
	for (int i = 0; i < 8; i++) {
		if (i % 2 == 0) {
			System.out.println("########.......########");
		}
		else if (k == 0) {
			System.out.println("#.....................#");
		}
		else if (k == 1) {
			System.out.println("#ghorfe"+i+"..............#");
			k = 0;
		}
		else {
			System.out.println("#ghorfe"+counter+".......ghorfe"+(counter+1)+"#");
			k = k - 2;
			counter += 2;
		}
	}
	System.out.println("#######################");
    } 
}
