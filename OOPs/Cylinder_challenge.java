package OOPs;

import java.util.Scanner;

class cylinder{
    private double radius;
    private double height;

    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
    public void setRadius(double r){
        if (r>0){
            radius=r;
        }else radius =0;
    }
    public void setHeight(double h){
        if (h>0){
            height=h;

        }else height =1;
    }

    public cylinder(){
        radius=1;
        height=1;

    }
    public cylinder(double r){
        height=1;
        setRadius(r);
    }
    public cylinder (double r, double h){
        setRadius(r);
        setHeight(h);
    }

    public double lidArea(){
        return Math.PI*getRadius()*getRadius();
    }
public double surfaceArea(){
        return (2*Math.PI*getRadius()*getHeight())+(2*Math.PI*getRadius()*getRadius());
}
public double volume(){
        return Math.PI*getRadius()*getRadius()*getHeight();
}
    public double perimeter()
    {
        return 2*Math.PI*getRadius();
    }
}




public class Cylinder_challenge {
    public static void main(String[] args) {


        cylinder c=new cylinder(10,20);
//        c.setHeight(10);
//        c.setRadius(20);
        System.out.println("The Lid area of cylinder is :"+c.lidArea());
        System.out.println("The surface area of cylinder is :"+c.surfaceArea());
        System.out.println("The volume of cylinder is :"+c.volume());
        System.out.println("The circumference of cylinder is :"+c.perimeter());
    }
}
