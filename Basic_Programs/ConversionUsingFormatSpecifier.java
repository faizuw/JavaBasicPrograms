import java.util.*;
public class ConversionUsingFormatSpecifier {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int number;
        System.out.print("Enter the decimal number you want to convert: ");
        number=s.nextInt();
        System.out.printf("The binary form of number "+ number + " is: "+ Integer.toBinaryString(number));
        System.out.printf("\nThe octal form of number "+ number + " is: %o",number);
        System.out.printf("\nThe hexa-decimal form of number "+ number + " is: %x",number);
        System.out.printf("\nThe char form of number "+ number + " is: %c",number);
    }
}
