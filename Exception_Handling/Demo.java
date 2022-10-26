package Exception_Handling;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        int arr[]={1,2,3};
        System.out.println("Enter the Numerator: ");
        a = s.nextInt();
        System.out.println("Enter the Denominator: ");
        b=s.nextInt();
        try{
            c=a/b;

            System.out.println("Division of two numbers is: "+c);


        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            try{
                System.out.println(arr[10]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }

        System.out.println("Thanks");

    }
}
