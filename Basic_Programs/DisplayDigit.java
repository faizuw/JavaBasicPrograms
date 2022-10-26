import java.util.*;
public class DisplayDigit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number,rem,mod;
        System.out.println("Enter the number for which you want to display the individual digits: ");
        number=s.nextInt();
        while (number>0){
            rem=number%10;
            System.out.println("The individual digits are : "+rem);
            number=number/10;


        }
    }
}
