import java.util.Scanner;

public class GCD {
    public int gcd(int num1, int num2) {
        if (num1 < 0 || num2 < 0) {
            return -1;
        }
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }

    public static void main(String[] args) {
        GCD s = new GCD();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and power :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        System.out.println("The GCD of " + num1 + " and " + num2 + " is : " + s.gcd(num1, num2));
    }
}
