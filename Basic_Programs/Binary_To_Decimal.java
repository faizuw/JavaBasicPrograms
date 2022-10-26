//Write a java program to convert binary number to decimal number
package Basic_Programs;

import java.util.*;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int binary, decimal = 0, rem, i = 1;
        System.out.println("Enter a binary number! ");
        binary = s.nextInt();
        if (binary % 10 > 1) {
            System.out.println("Enter a valid binary value: ");

        } else {
            while (binary > 0) {
                rem = binary % 10;
                decimal = decimal + rem * i;
                i = i * 2;
                binary = binary / 10;
            }
            System.out.println("The decimal value is: " + decimal);
        }
    }
}
