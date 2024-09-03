import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int n1 = scan.nextInt();
			if (n1 == 1) {
				String word = scan.next();
				char letter = word.charAt(0);
				int counter = 1;
				for (int j = 1; j < word.length(); j++) {
					if (letter == word.charAt(j)) {
						counter++;
					}
					else {
						System.out.print(letter);
						if (counter > 1) {
							System.out.print(counter);
						}
						counter = 1;
						letter = word.charAt(j);
					}
				}
				System.out.print(letter);
				if (counter > 1) {
					System.out.print(counter);
				}
			}
			else if (n1 == 2) {
				String word = scan.next();
				int j = 0;
				while (j < word.length()) {
					char letter = word.charAt(j);
					try {
                        int a = 0;
                        String temp1 = "", temp2 = "", temp3 = "";
                        boolean two_digits = false;
                        if (j != word.length()-2) {
                            if (Character.isDigit(word.charAt(j+2))) {
                                temp1 = String.valueOf(word.charAt(j+1));
                                temp2 = String.valueOf(word.charAt(j+2));
                                temp3 = temp1 + temp2;
                                a = Integer.parseInt(temp3);
                                two_digits = true;
                            } else {
                                a = Integer.parseInt(String.valueOf(word.charAt(j+1)));
                            }
                        } else {
                            a = Integer.parseInt(String.valueOf(word.charAt(j+1)));
                        }
						for (int k = 0; k < a; k++) {
							System.out.print(letter);
						}
                        if (two_digits) {
                            j+=3;
                        } else {
                            j+=2;
                        }
					} catch (Exception e) {
						System.out.print(letter);
						j++;
					}
				}
			} 		
			System.out.println();
		}
    } 
}
