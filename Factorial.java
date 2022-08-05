import java.util.Scanner;

public class Factorial {
    public int factorial(int n) {
        // unpredictable condition like -ve num
        if (n < 0) {
            return -1;
        }
        // Base case
        if (n == 1 || n == 0)
            return 1;
        // recursively calling fun
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for factorial :");
        int fac = sc.nextInt();
        sc.close();
        System.out.println("The factorial of " + fac + " is : " + f.factorial(fac));
    }
}