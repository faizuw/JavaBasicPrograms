import java.util.*;
public class FindRadix {
    public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
      String str;
        System.out.print("Enter the string for which you want to find radix: ");
        str=s.nextLine();
        if(str.matches("[01]+")){
            System.out.println("The entered string is Binary and the radix is 2");
        } else if (str.matches("[0-7]+")) {
            System.out.println("The entered string is in Octal form and the radix is 8");

        } else if (str.matches("[0-9]*[A-F]+")) {
            System.out.println("The entered string is in Hexa-decimal form and the radix is 16");
        }else if (str.matches("[0-9]+")){
            System.out.println("The entered string is in Decimal form and the radix is 10");
        }else {
            System.out.println("Not a number!");
        }

       /*
        String str="23";
        boolean str1=(str.matches("[A-F]+"));
        boolean str2=(str.matches("[0-9]+"));
        boolean str3=str1&&str2;

        if (str3==true){
            System.out.println("hexa decimal");

        }else System.out.println("not a hexadecimal");

       */
    }
}
