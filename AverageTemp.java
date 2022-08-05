import java.util.Scanner;

public class AverageTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("How many days the temperature :");
        int n = sc.nextInt();
        float arr[] = new float[n];
        System.out.println("Enter the tempreture of days :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        float avg = 0;
        for (int i = 0; i < n; i++) {
            avg += arr[i];
        }
        avg /= n;
        int x = 0;
        // no of days that is above the average temp
        for (int i = 0; i < n; i++) {
            if (arr[i] > avg) {
                x++;
            }
        }
        System.out.println("the average temp is : " + avg + " on " + x + "days");

    }
}
