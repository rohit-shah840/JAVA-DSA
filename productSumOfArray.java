import java.util.Scanner;

public class productSumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array element.");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        psOfArray(arr, size);
    }

    static public void psOfArray(int[] arr, int n) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println("The sum of array : " + sum);
        System.out.println("The product of array : " + product);
    }
}
