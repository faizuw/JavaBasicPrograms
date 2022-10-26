import java.util.*;
public class DigitCount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number,count=0;
        System.out.println("Enter the number for which you want to calculate the number of digits: ");
        number=s.nextInt();
        while(number>0){
            number=number/10;
            count++;
        }
        System.out.println("The total number of digits present in the number are: "+count);
    }
}
