import java.util.Scanner;

public class pairsOfArray {
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
        pairsArray(arr, size);
    }

    static public void pairsArray(int[] a, int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i] + "" + a[j] + " ");
            }
            System.out.println();
        }
    }
}
