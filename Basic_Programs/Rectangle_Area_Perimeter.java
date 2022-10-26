//Write a Java program to print the area and perimeter of a rectangle
package Basic_Programs;
import java.util.*;
public class Rectangle_Area_Perimeter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double length, breadth, area, perimeter;
        System.out.println("Enter the length of rectangle: ");
        length = s.nextDouble();
        System.out.println("Enter the breadth of rectangle: ");
        breadth = s.nextDouble();
        perimeter = 2 * (length + breadth);
        area = length * breadth;
        System.out.println("The area of rectangle is: " + area);
        System.out.println("The perimeter of rectangle is: " + perimeter);
    }
}
