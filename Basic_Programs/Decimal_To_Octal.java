//Write a Java program to convert a decimal number to octal number
package Basic_Programs;
import java.util.*;
public class Decimal_To_Octal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int decimal, rem;
        String octal = "";
        System.out.println("Enter the decimal value: ");
        decimal = s.nextInt();
        while (decimal > 0) {
            rem = decimal % 8;
            octal = rem + octal;
            decimal = decimal / 8;
        }
        System.out.println("The octal value is: " + octal);
    }
}
