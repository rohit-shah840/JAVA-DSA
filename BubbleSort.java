public class BubbleSort {
    public int[] sort(int[] a) {
        boolean isswap;
        for (int i = 0; i < a.length - 1; i++) {
            isswap = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    isswap = true;
                }
            }
            if (isswap == false)
                break;
        }
        return a;
    }

    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int arr[] = { 1, 9, 4, 6, 0, 2 };
        arr = b.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
