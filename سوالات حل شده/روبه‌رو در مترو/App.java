import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {                       
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String first[] = str1.split(" ");
        String str2 = scan.nextLine();
        String second[] = str2.split(" ");
        int count = 0;
        for (int i = 0; i < second.length; i++) {
            if (first[i].equals(second[i]) && first[i].equals("1")) {
                count++;
            }
        }
        System.out.println(count);      
    }
}
