import java.util.*;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num;
        System.out.println("Enter the number you want to check:");
        num=s.nextInt();
        for (int i=2;i<num;i++){
            if(num%i==0){
                System.out.println("The number is not prime");
                System.exit(0);
            }

        }
        System.out.println("Number is prime");
    }
}
