import java.lang.*;
import java.util.*;


public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        //USING SIMPLE FORMULA = 1/2 BH

        double base, height, area;
        System.out.println("Enter the base of a triangle ");
        base=s.nextDouble();
        System.out.println("Enter the height of a triang]e ");
        height=s.nextDouble();
        area=(base*height)/2;
        System.out.println("The area of the Triangle is "+area);

        // USING ALL SIDES FORMULA

        double a,b,c,e;
        System.out.println("Enter the value of first side: ");
        a=s.nextDouble();
        System.out.println("Enter the value of second side: ");
        b=s.nextDouble();
        System.out.println("Enter the value of third side: ");
        c=s.nextDouble();
        e=(a+b+c)/2;
        area=Math.sqrt(e*(e-a)*(e-b)*(e-c)) ;
        System.out.println("The area of triangle is: " +area );


    }
}
