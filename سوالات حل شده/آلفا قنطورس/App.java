import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int mabna = scan.nextInt();
        String str = Integer.toString(number, mabna);
        System.out.println(str.toUpperCase());  
    }    
}
