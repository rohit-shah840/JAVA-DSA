import java.util.Scanner;

public class reverseArray {
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
        revArray(arr, size);
    }

    static public void revArray(int[] a, int n) {
        int i;
        int temp;
        for (i = 0; i < n / 2; i++) {
            temp = a[n - 1 - i];
            a[n - 1 - i] = a[i];
            a[i] = temp;
        }
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
