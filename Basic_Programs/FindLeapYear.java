import java.util.*;
public class FindLeapYear {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int year;
        System.out.print("Enter the year that you want to check:");
        year=s.nextInt();
        if (year%4==0){
            if(year%100==0){
                if (year%400==0){
                    System.out.println("This year is a leap year");
                }else {
                    System.out.println("Not a leap year");
                }
            }else {
                System.out.println("This year is a leap year");
            }

        }else {
            System.out.println("Not a leap year");
        }
    }
}
