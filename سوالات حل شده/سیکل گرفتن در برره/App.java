import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String key = scan.next();
        String keyvoon = "3311223311223311223311223311223311223311223311223311223311223311223311223311223311223311223311223311";
        String nezam = "1231231231231231231231231231231231231231231231231231231231231231231231231231231231231231231231231231";
        String shirfarhad = "2123212321232123212321232123212321232123212321232123212321232123212321232123212321232123212321232123";
        int KEYVOON = 0, NEZAM = 0, SHIRFARHAD = 0;
        
        for (int i = 0; i < n; i++) {
            if (key.charAt(i) == keyvoon.charAt(i)) {
                KEYVOON++;
            }
            if (key.charAt(i) == nezam.charAt(i)) {
                NEZAM++;
            }
            if (key.charAt(i) == shirfarhad.charAt(i)) {
                SHIRFARHAD++;
            }
        }

        int max = Math.max(KEYVOON, Math.max(NEZAM, SHIRFARHAD));
        System.out.println(max);

        if (KEYVOON == max) {
            System.out.println("keyvoon");
        }
        if (NEZAM == max) {
            System.out.println("nezam");
        }
        if (SHIRFARHAD == max) {
            System.out.println("shir farhad");
        }
    }
}       
