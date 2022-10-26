import java.util.*;

public class StingMethods {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1,str2;
        System.out.print("Enter the string: ");
        str1=s.nextLine();
        int slength= str1.length();

        System.out.println("The length of the entered string is:"+ slength);
        System.out.println("The upper case of the entered string is: " + str1.trim().toUpperCase());
        System.out.println("The lower case of the entered string is: " + str1.toLowerCase());
    }
}
