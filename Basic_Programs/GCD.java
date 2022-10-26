import java.util.*;

public class GCD {
    static int calGDC(int x, int y) {
        int z;
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }

        }
        z = x;
        return z;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first, second, res;
        System.out.print("Enter the first number: ");
        first = s.nextInt();
        System.out.print("\nEnter the second number: ");
        second = s.nextInt();


        System.out.println("Factors of " + first);
        for (int i = 1; i < first; ++i) {
            if (first % i == 0)
                System.out.print(i + " ");
        }
        System.out.println("Factors of " + second);
        for (int i = 1; i < second; ++i) {
            if (second % i == 0)
                System.out.print(i + " ");
        }

        res = calGDC(first, second);
        System.out.println("\nThe Greatest Common Diviser of number " + first + " and " + second + " is:  " + res);

    }
}
