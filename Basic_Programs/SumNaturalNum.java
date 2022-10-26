import java.util.*;
public class SumNaturalNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number,sum=0;
        System.out.print("Enter the number up-to which you have to find the sum of natural numbers: ");
        number=s.nextInt();
        for (int i=1;i<=number;i++){

            sum=sum+i;

        }
        System.out.println("The sum of "+number+" natural number is: "+sum);

    }


}

