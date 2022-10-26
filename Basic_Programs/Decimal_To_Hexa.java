//Write a Java program to convert a decimal number to hexadecimal number
package Basic_Programs;
import java.util.*;
public class Decimal_To_Hexa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int decimal, rem;
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexadecimal = "";
        System.out.println("Enter the decimal number: ");
        decimal = s.nextInt();
        while (decimal > 0) {
            rem = decimal % 16;
            hexadecimal = hex[rem] + hexadecimal;
            decimal = decimal / 16;
        }
        System.out.println(hexadecimal);
    }
}
