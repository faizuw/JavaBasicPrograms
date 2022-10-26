// Write a Java program that takes a number as input and prints its multiplication table upto 10
package Basic_Programs;
import java.util.*;
public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.print("Enter the number for which you want to display multiplication table: ");
        num = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
