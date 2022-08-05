import java.util.Scanner;

public class powerOfNumber {
    public float pow(float num, int x) {
        float ans = 0;
        if (x < 0) {
            return -1;
        }
        if (x == 0 || num == 1) {
            return 1;
        }
        return ans += num * pow(num, x - 1);
    }

    public static void main(String[] args) {
        powerOfNumber s = new powerOfNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and power :");
        float num = sc.nextFloat();
        int power = sc.nextInt();
        sc.close();
        System.out.println("The sum of digits of this  " + num + " is : " + s.pow(num, power));
    }
}
