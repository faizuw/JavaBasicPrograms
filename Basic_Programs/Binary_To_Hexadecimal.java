//Write a Java program to convert a binary number to hexadecimal number
package Basic_Programs;

import java.util.*;

public class Binary_To_Hexadecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int binary, rem, decimal = 0, i = 1, rem1;
        char arr[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexadecimal = "";
        System.out.println("Enter a binary number: ");
        binary = s.nextInt();
        if (binary % 10 > 1) {
            System.out.println("Enter a valid binary value! Try again....");
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
            rem1 = decimal % 16;
            hexadecimal = arr[rem1] + hexadecimal;
            decimal = decimal / 16;

        }
        System.out.print("The hexadecimal value is: " + hexadecimal);
    }
}
