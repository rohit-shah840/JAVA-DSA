import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();
        int count = 0;
        int x = A.length();
        /* Enter your code here. Print output to STDOUT. */
        for (int i = 0; i < x / 2; i++) {
            if (A.charAt(i) == A.charAt(x - 1 - i)) {
                count++;
            } else {
                break;
            }
        }
        if (count == x / 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
