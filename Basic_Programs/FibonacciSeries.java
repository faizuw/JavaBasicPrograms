import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      int number,first=0,second=1,fib=1;
        System.out.print("Enter the number of terms: ");
        number=s.nextInt();
        System.out.print("Fibonacci series is :");
        System.out.print(first+",");
        System.out.print(second+",");
        for (int i=1; i<=number-2;i++){         //number-2 bcz we already printed first 2 terms
            fib=first+second;
            System.out.print(fib+",");
            first=second;
            second=fib;
        }


    }
}
