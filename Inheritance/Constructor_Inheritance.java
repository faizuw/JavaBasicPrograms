package Inheritance;

//class Parent {
//    public Parent() {
//        System.out.println("Non parameterized constructor of parent class");
//    }
//
//    public Parent(int x) {
//        System.out.println("parameterized constructor of parent class " + x);
//    }
//}
//
//class Child extends Parent {
//    public Child() {
//        System.out.println("Non parameterized constructor of child class");
//    }
//
//    public Child(int x) {
//        super(x);
//        System.out.println("parametrized constructor of child class " + x);
//    }
//
//    public Child(int x, int y) {
//        super(x);
//        System.out.println("2 parametrized constructor of child class " + x + " " + y);
//    }
//}

class Rectangle {
    int length;
    int breadth;

    public Rectangle() {
        length = breadth = 1;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }
}
class Cuboid extends Rectangle{
    int height;
    public Cuboid(){
        height=1;
    }
    public Cuboid(int height){
        this.height=height;
    }
    public Cuboid(int length,int breadth,int height){
        super(length,breadth);
        this.height=height;

    }
    int volume(){
     return length*breadth*height;
    }
}
public class Constructor_Inheritance {
    public static void main(String[] args) {

//        Child c = new Child();
//        Child c1 = new Child(10);
//        Child c2 = new Child(20, 30);

        Cuboid c=new Cuboid();
        Cuboid c1=new Cuboid (10);

        Cuboid c3=new Cuboid (10,20,30);
        System.out.println(c.volume());
        System.out.println(c1.volume());
        System.out.println(c3.volume());
    }
}
