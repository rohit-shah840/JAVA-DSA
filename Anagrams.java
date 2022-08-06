import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toUpperCase();
        b = b.toUpperCase();

        if (a.length() != b.length())
            return false;
        int arr[] = new int[26];
        for (int i = 0; i < a.length(); i++) {
            int index = a.charAt(i) - 'A';
            arr[index]++;
        }
        for (int i = 0; i < b.length(); i++) {
            int index = b.charAt(i) - 'A';
            arr[index]--;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two string to checke whether they are anagram or not ?");
        String a = sc.next();
        String b = sc.next();
        System.out.println("They both are " + isAnagram(a, b));
    }
}
