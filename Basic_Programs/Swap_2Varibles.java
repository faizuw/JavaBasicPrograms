//Write a Java program to swap two variables
package Basic_Programs;
import java.util.*;
public class Swap_2Varibles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first, second, temp;
        System.out.println("Enter the first variable:");
        first = s.nextInt();
        System.out.println("Enter the second variable:");
        second = s.nextInt();

        temp = first;
        first = second;
        second = temp;
        System.out.println("*After swapping the values*\nFirst number now is: " + first + "\nSecond number now is: " + second);
    }
}
