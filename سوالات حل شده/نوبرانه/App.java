import java.util.Scanner;
 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] waterMelon = new int[5];
        for (int i = 0; i < waterMelon.length; i++) {
            waterMelon[i] = scan.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < waterMelon.length; i++) {
            if (waterMelon[i] >= 80) {
                counter++;
            }
        }
        if (counter >= 3) {
            System.out.println("Mamma mia!");
        }
        else if (counter >= 1) {
            System.out.println("Mamma mia!!");
        }
        else {
            System.out.println("Mamma mia!!!");
        }
    }
}    
