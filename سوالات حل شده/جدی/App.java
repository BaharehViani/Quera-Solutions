import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

  		  int n = scan.nextInt();
        int[] arr = new int[n];
  		  for (int i = 0; i < n; i++) {
  			    arr[i] = scan.nextInt();
  		  }
  		  scan.close();
  		  int length = 1;
    		boolean soudi = false;
    		boolean nozuli = true;
    		for (int i = 0; i < n-1; i++) {
    			  if (arr[i] < arr[i+1]) {
    				  if (soudi) {
    					  continue;
    				  } else {
      					length++;
      					soudi = true;
      					nozuli = false;
    				  }	
    			  }  
    			  else {
      				if (nozuli) {
      					continue;
      				} else {
      					length++;
      					nozuli = true;
      					soudi = false;
      				}
    			  }
    		}
    		System.out.println(length);	
    }
}
