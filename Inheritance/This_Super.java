package Inheritance;

class Rectangle1 {
    int length, breadth;
    int x = 10;

    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Cuboid1 extends Rectangle1 {
    int height;
    int x = 20;

    public Cuboid1(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;

    }

    void display() {
        System.out.println(super.x);
        System.out.println(x);
    }
}

public class This_Super {
    public static void main(String[] args) {
        Cuboid1 C = new Cuboid1(10,20,30);
        C.display();
    }
}
