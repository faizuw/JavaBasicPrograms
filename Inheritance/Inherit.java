package Inheritance;

import java.util.*;

class Circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;

    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

}

class Cylinder extends Circle {
    double height;

    public double lidArea() {
        return area();
    }

    public double surfaceArea() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
    }
    public double volume(){
        return area()*height;

    }

}

public class Inherit {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.radius = 10;
        c.height = 20;
        System.out.println(c.lidArea());
        System.out.println(c.surfaceArea());
        System.out.println(c.volume());
    }
}
