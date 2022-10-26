//Write a Java program to convert a octal number to a decimal number
package Basic_Programs;

import java.util.*;

public class Octal_To_Decimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int octal, rem, decimal = 0, i = 1;
        System.out.println("Enter a octal number: ");
        octal = s.nextInt();
        while (octal > 0) {
            rem = octal % 10;
            decimal = decimal + rem * i;
            octal = octal / 10;
            i = i * 8;
        }
        System.out.println("The decimal value is: " + decimal);
    }
}
