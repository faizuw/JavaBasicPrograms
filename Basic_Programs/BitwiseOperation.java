import java.util.Scanner;

public class BitwiseOperation {
    public static void main (String arg[]){

        int x,y, z;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x=s.nextInt();
        System.out.print("Enter the second number: ");
        y=s.nextInt();
        z=x&y;
        System.out.println("The decimal value after performing Bitwise AND operation is  "+z+ " and the Binary value is: "+  Integer. toBinaryString(z));
        z=x|y;
        System.out.println("The decimal value after performing Bitwise OR operation is  "+z+ " and the Binary value is: "+  Integer. toBinaryString(z));
        z=x^y;
        System.out.println("The decimal value after performing Bitwise XOR operation is  "+z+ " and the Binary value is: "+  Integer. toBinaryString(z));
        z=~x;
        System.out.println("The decimal value after performing Bitwise NOT operation on First number is  "+z+ " and the Binary value is: "+  Integer. toBinaryString(z));
        z=~y;
        System.out.println("The decimal value after performing Bitwise NOT operation on Second number  "+z+ " and the Binary value is: "+  Integer. toBinaryString(z));

/*
        int a,b;
        a=-10;

        b=a>>1;
        System.out.println(Integer.toBinaryString(b)    );
*/
    }


}
