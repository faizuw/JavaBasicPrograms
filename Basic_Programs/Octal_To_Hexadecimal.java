//Write a Java program to convert a octal number to a hexadecimal number
package Basic_Programs;

import java.util.*;

public class Octal_To_Hexadecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int octal, rem, rem1, decimal = 0, i = 1;
        String hexa = "";
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println("Enter a octal value: ");
        octal = s.nextInt();
        while (octal > 0) {
            rem = octal % 10;
            decimal = decimal + rem * i;
            i = i * 8;
            octal = octal / 10;
        }

        while (decimal > 0) {
            rem1 = decimal % 16;
                if(rem1<10) {
                    hexa = hex[rem1] + hexa;
                }else hexa = hex[rem1+2] + hexa;
            decimal = decimal / 16;
        }
        System.out.println("The hexa-decimal value is: " + hexa);
    }
}
