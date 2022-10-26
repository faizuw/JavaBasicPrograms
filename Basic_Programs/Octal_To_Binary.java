//Write a Java program to convert a octal number to a binary number
package Basic_Programs;
import java.util.*;
public class Octal_To_Binary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int octal = 0, decimal = 0, rem, rem1, i = 1, check, temp;
        String x = "";
        String binary="";
        String octalString = "";
        System.out.println("Enter a octal number: ");
        x = s.next();

//        check = octal;
//
//
//        while (check > 0) {
//            temp = check % 10;
//            x = temp + x;
//            check = check / 10;
//        }

        x = x.trim();
        try{
            octal = Integer.parseInt(x);
        }catch (Exception e){
            System.out.println("Invalid Input.");
            System.exit(0);
        }

        if (x.matches("[0-7]+")) {
            //octal to decimal
            while (octal > 0) {
                rem = octal % 10;
                decimal = decimal + rem * i;
                octal = octal / 10;
                i = i * 8;
            }
            //decimal to binary
            while (decimal>0){
                rem1=decimal%2;
                binary=rem1+binary;
                decimal=decimal/2;
            }
            System.out.println("The binary value is: "+binary);
        } else {
            System.out.println("Enter a valid octal number! try again...");
            System.exit(0);
        }
    }
}