//Write a Java program to print the area and perimeter of a circle
package Basic_Programs;
import java.util.*;
public class Area_Perimeter_Circle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double radius, area, perimeter;
        System.out.print("Enter the radius of circle: ");
        radius = s.nextDouble();
        area = Math.PI * (radius * radius);
        System.out.print("\nThe Area of circle is: " + area);
        perimeter = 2 * Math.PI * radius;
        System.out.println("\nThe perimeter of circle is: " + perimeter);

    }
}
