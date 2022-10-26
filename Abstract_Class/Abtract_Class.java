package Abstract_Class;
abstract class Shape{
    abstract public double perimeter();
    abstract public double area();
}
class Circle extends Shape{
    double radius;
    public Circle(int radius){
        this.radius=radius;
    }
    @Override
    public double perimeter(){
        return Math.PI * radius * radius;
    }
    @Override
    public double area(){
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shape{
    double length;
    double breadth;
    public Rectangle(double length ,double breadth){
        this.breadth=breadth;
        this.length=length;
    }

    @Override
    public double area(){
        return length * breadth;
    }
    @Override
    public double perimeter(){
        return 2 * (length + breadth);
    }
}


public class Abtract_Class {
    public static void main(String[] args) {
        Shape s1=new Circle(10);
        Shape s2=new Rectangle(10,20);
        System.out.println("Area of circle is "+s1.area());
        System.out.println("Perimeter f circle is "+s1.perimeter());
        System.out.println("Area of Rectangle is "+ s2.area());
        System.out.println("Perimeter of Rectangle is "+ s2.perimeter());


    }
}
