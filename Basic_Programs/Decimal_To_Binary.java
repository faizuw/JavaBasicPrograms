//Write a Java program to convert a decimal number to binary number
package Basic_Programs;
import java.util.Scanner;
public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int decimal, rem, rem1;
        String binary = "";
        String test = "";
        String check="";
        System.out.println("Enter a Decimal number: ");
        decimal = s.nextInt();
        check = String.valueOf(decimal);

        if (check.matches("[0-9]+")) {
            while (decimal != 0) {
                rem = decimal % 2;
                binary = rem + binary;
                decimal = decimal / 2;
            }
            System.out.println("The binary value is: " + binary);
        }else {
            System.out.println("Enter a valid decimal value! try again...");
            System.exit(0);
        }
    }
}
