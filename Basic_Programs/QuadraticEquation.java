import java.lang.*;
import java.util.*;



public class QuadraticEquation {
    public static void main(String[] args) {
        double a,b,c,r1,r2;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the coefficient of A: ");
        a=s.nextDouble();
        System.out.print("Enter the coefficient of B: ");
        b=s.nextDouble();
        System.out.print("Enter the coefficient of C: ");
        c=s.nextDouble();
        r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("The roots are:\n"+r1+"\n"+r2);


    }
}
