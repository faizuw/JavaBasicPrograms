import java.util.*;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number,rem,sum=0;

        System.out.println("Enter the number: ");
        number=s.nextInt();
        int check=number;

        while(number>0){
            rem=number%10;
            sum=sum+rem*rem*rem;
            number=number/10;


        }
        if (check==sum){
            System.out.println("The number is a Armstrong number");
        }else System.out.println("The number is not a Armstrong number");
    }
}
