import java.util.Scanner;

public class Pangram {
    public static boolean isPangram(String in) {
        boolean[] alpha = new boolean[26];

        
        in = in.toLowerCase();

        for (int i = 0; i < in.length(); i++) {
            char ch = in.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                alpha[ch - 'a'] = true;
            }
        }

       
        for (boolean c : alpha) {
            if (!c) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String in = sc.nextLine();
            boolean result = isPangram(in);

            if (result) {
                System.out.println("The input is a pangram.");
            } else {
                System.out.println("The input is not a pangram.");
            }
        }
    }
   
}

