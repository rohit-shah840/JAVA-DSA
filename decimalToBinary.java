
import java.util.Scanner;

public class decimalToBinary {
    public int DecimalToBinary(int num) {
        int ans = 0;
        if (num == 0) {
            return 0;
        }
        return ans += (num % 2) + 10 * DecimalToBinary(num / 2);
    }

    public static void main(String[] args) {
        decimalToBinary s = new decimalToBinary();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num1 = sc.nextInt();
        sc.close();
        System.out.println("The binary value of " + num1 + " is : " + s.DecimalToBinary(num1));
    }
}
