import java.util.Scanner;

class MissNumber {
    public int missNumber(int[] a) {
        int ans = 0;
        int sum1 = 0;
        int sum2 = ((a.length + 1) * (a.length + 2)) / 2;
        for (int var : a) {
            sum1 += var;
        }
        ans = sum2 - sum1;
        return ans;
    }
}

class MisssingNumber {
    public static void main(String[] args) {
        MissNumber m = new MissNumber();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The missing number is " + m.missNumber(arr));
    }
}
