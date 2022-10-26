package OOPs;

import java.util.*;

class CirclePractice {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double perimeter() {
        return circumference();
    }


}


public class Circle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CirclePractice c = new CirclePractice();
        System.out.println("Enter the radius of circle: ");
        c.radius = s.nextDouble();
        System.out.println("Area of circle is: " + c.area());
        System.out.println("Circumference of circle is: " + c.circumference());
        System.out.println("Perimeter of circle is: " + c.perimeter());


    }
}
