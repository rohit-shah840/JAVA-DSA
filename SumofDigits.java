import java.util.Scanner;

class SumofDigits {
    public int sumOfDigits(int n) {

        if (n < 0) {
            return -1;
        }
        if (n > 0 && n <= 9) {
            return n % 10;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        SumofDigits s = new SumofDigits();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for digits sum :");
        int num = sc.nextInt();
        sc.close();
        System.out.println("The sum of digits of this  " + num + " is : " + s.sumOfDigits(num));
    }
}