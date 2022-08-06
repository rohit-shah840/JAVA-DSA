import java.util.Scanner;

public class StringToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        s = s.trim();
        String str[] = s.split("[^a-zA-Z]+");
        if (s.length() == 0)
            System.out.println(0);
        else
            System.out.println(str.length);

        for (String w : str) {
            System.out.println(w);
        }
    }

}
