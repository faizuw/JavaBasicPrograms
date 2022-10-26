import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number,rem,rev=0,check;
        System.out.print("Enter a number: ");
        number=s.nextInt();
        check=number;
        while(number>0){
            rem=number%10;
            rev=rev*10+rem;
            number=number/10;
        }
        if(rev==check){
            System.out.println("The number is palindrome");
        }else System.out.println("The number is not a palindrome");
    }

}
