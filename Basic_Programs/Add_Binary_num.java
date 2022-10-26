//Write a Java program to add two binary numbers
package Basic_Programs;
import java.util.*;
public class Add_Binary_num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2, sum = 0, carry = 0, digit1, digit2;
        int[] arr = new int[10];
        String ans;

        System.out.println("Enter first binary number:");
        num1 = s.nextInt();
        System.out.println("Enter second binary number:");
        num2 = s.nextInt();
        for (int i = arr.length - 1; i >= 0; i--) {
            digit1 = num1 % 10;
            digit2 = num2 % 10;
            num1 = num1 / 10;
            num2 = num2 / 10;

            sum = digit1 + digit2 + carry;
            if (sum == 0) {
                arr[i] = 0;
                carry = 0;
            } else if (sum == 1) {
                arr[i] = 1;
                carry = 0;

            } else if (sum == 2) {
                arr[i] = 0;
                carry = 1;
            } else if (sum == 3) {
                arr[i] = 1;
                carry = 1;

            }


        }
        System.out.println("Sum of two binary numbers is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }


    }


}

