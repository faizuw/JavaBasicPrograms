//Write a Java program to convert a binary number to a Octal number
package Basic_Programs;

import java.util.*;

public class Binary_To_Octal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int binary, rem, decimal = 0, i = 1, rem1;
        String octal = "";
        System.out.println("Enter a binary number: ");
        binary = s.nextInt();
        if (binary /10 > 1) {
            System.out.println("Enter a valid binary value! Please try again...");
            System.exit(0);
        } else {
            while (binary > 0) {
                rem = binary % 10;
                decimal = decimal + rem * i;
                binary = binary / 10;
                i = i * 2;
            }
        }
        while (decimal > 0) {
            rem1 = decimal % 8;
            octal = rem1 + octal;
            decimal = decimal / 8;
        }
        System.out.print("The octal value is: " + octal);
    }
}
