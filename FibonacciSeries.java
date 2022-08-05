import java.util.Scanner;

public class FibonacciSeries {
    public int fibonacciSeries(int n) {
        // unintenseional case
        if (n < 0) {
            return -1;
        }
        // Base case
        if (n == 0 || n == 1) {
            return n;
        }
        // recursive case
        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
    }

    public static void main(String[] args) {
        FibonacciSeries f = new FibonacciSeries();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for the fibonaccis series : ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("The ans will be : " + f.fibonacciSeries(num));

    }
}
