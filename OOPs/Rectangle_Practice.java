package OOPs;

import java.util.*;

class Rectangle {
    public double length;
    public double breadth;

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        if (length == breadth) {
            return true;
        } else return false;
    }
}

public class Rectangle_Practice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Rectangle r = new Rectangle();
        System.out.println("Enter the length of rectangle: ");
        r.length = s.nextDouble();
        System.out.println("Enter the breadth of circle: ");
        r.breadth = s.nextDouble();
        System.out.println("Area of Rectangle is: " + r.area());
        System.out.println("Perimeter of Rectangle is: " + r.perimeter());
        System.out.println("Is this a Square: " + r.isSquare());
    }
}
