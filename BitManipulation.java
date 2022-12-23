import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation u want to perform press 0 for get bit 1 for set bit and 2 for clear bit");
        int op = sc.nextInt();
        System.out.println("Enter the  number : ");
        int num = sc.nextInt();
        System.out.println("Enter the postion");
        int pos = sc.nextInt();
        int bitmask = 1 << pos;
        if (op == 0) {
            // get
            int result = bitmask & num;
            System.out.println(result);
            if (result == 0) {
                System.out.println("The bit in " + pos + " is 0");
            } else {
                System.out.println("The bit in " + pos + " is 1");
            }
        } else if (op == 1) {
            // for the set 1
            int result = bitmask | num;
            System.out.println(result);
        } else if (op == 2) {
            // for the set 0
            int not = ~(bitmask);
            System.out.println(num & not);
        }

    }
}
