import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] marker = new int[101];
		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			for (int j = 0; j < marker.length; j++) {
				if (j == x) {
					marker[j]++;
					break;
				}
			}
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < marker.length; i++) {
			if (marker[i] != 0) {
				min = marker[i] < min ? marker[i] : min;
			}
		}
		for (int i = 0; i < marker.length; i++) {
			if (marker[i] == min) {
				System.out.println(i);
				break;
			}
		}
    } 
}
