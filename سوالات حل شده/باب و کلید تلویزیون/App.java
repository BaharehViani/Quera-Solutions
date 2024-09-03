import java.util.Scanner;
 
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int initial_channel = scan.nextInt();
        int k = scan.nextInt();
        int final_channel;
        String[] channel = new String[n];
        for (int i = 0; i < channel.length; i++) {
            channel[i] = scan.next();
        }
        final_channel = initial_channel + k;
        while (final_channel > n) {
            final_channel -= n;
        }
        System.out.println(channel[final_channel-1]);
    }
}       
