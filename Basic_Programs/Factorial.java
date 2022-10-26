import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long number,fact= 1L;
        System.out.print("Enter the number for which you want to find the Factorial:");
        number=s.nextInt();
        for (int i=1;i<=number;i++){
            fact=fact*i;

        }
        System.out.println("The factorial of number "+number+" is: "+fact);
    }
}
