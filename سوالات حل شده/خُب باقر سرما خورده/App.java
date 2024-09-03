import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = scan.nextLine();
        String str4 = scan.nextLine();
        String str5 = scan.nextLine();

        boolean flag = true;

        if (flag) {
            if (str1.contains("MOLANA") || str1.contains("HAFEZ")) {
                System.out.print("1 ");
                flag = false;
            }
            if (str2.contains("MOLANA") || str2.contains("HAFEZ")) {
                System.out.print("2 ");
                flag = false;
            }
            if (str3.contains("MOLANA") || str3.contains("HAFEZ")) {
                System.out.print("3 ");
                flag = false;
            }
            if (str4.contains("MOLANA") || str4.contains("HAFEZ")) {
                System.out.print("4 ");
                flag = false;
            }
            if (str5.contains("MOLANA") || str5.contains("HAFEZ")) {
                System.out.print("5 ");
                flag = false;
            }  
        }   
        if (flag) {
            System.out.println("NOT FOUND!"); 
        }
    }
}
