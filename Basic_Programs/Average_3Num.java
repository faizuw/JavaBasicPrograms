//Write a java program to calculate the average of three numbers
package Basic_Programs;
import java.util.*;
public class Average_3Num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double first, second, third, avg;
        System.out.println("Enter the first number: ");
        first = s.nextDouble();
        System.out.println("Enter the second number: ");
        second = s.nextDouble();
        System.out.println("Enter the third number: ");
        third = s.nextDouble();
        avg = (first + second + third) / 3;
        System.out.println("The average of these three number is: " + avg);
    }
}
