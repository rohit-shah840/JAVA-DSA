import java.util.*;

public class PairsOftwoSumNumber {

    static public int[] sumOfPairs(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("Not found such pairs in the given array.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int t = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr1 = sumOfPairs(arr, t);
        System.out.println("The index of two pairs sum is  " + Arrays.toString(arr1));

    }
}
