import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int[] numberOfBooks = new int[3];
		    for (int i = 0; i < 3; i++) {
			    numberOfBooks[i] = scan.nextInt();
		    }
		    scan.close();
		    boolean[] possible = {false, false , false};
		    int evens = 0, odds = 0;
		    for (int i = 0; i < 3; i++) {
			    if (numberOfBooks[i] % 2 == 0) {
				    evens++;
			    } else {
				      odds++;
			    }
		    }
		    if (odds == 1 && evens == 2) {
			    for (int i = 0; i < 3; i++) {
				    if (numberOfBooks[i] % 2 == 1) {
					    possible[i] = true;
					    break;
				    }
			    }
		    }
		    else if (odds == 2 && evens == 1) {
			    for(int i = 0; i < 3; i++) {
				    if (numberOfBooks[i] % 2 == 0) {
					    possible[i] = true;
					    break;
				    }
			    }
		    }
		    for (int i = 0; i < 3; i++) {
			    if (possible[i]) {
				    System.out.print("YES ");
			    }
          else {
				      System.out.print("NO ");
			    }
		    }
	  }
}
