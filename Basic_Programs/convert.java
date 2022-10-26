import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

class Convert{
public static void main (String arg[]){
Scanner s= new Scanner(System.in);
int x;
System.out.println("Enter the decimal number: ");
x=s.nextInt();
System.out.println("The binary equalant of number  "+ x + " is: "+ Integer.toBinaryString(x));
System.out.println("The octal equalant of number  "+ x + " is: "+ Integer.toOctalString(x));
System.out.println("The hexadecimal equalant of number  "+ x + " is: "+ Integer.toHexString(x));

}


}