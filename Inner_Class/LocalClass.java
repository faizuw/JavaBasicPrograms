package Inner_Class;

class Outer1 {
    public void show() {
        class Inner1 {
            public void display() {
                System.out.println("hello");
            }
        }
        new Inner1().display();
    }
}

public class LocalClass {
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        o.show();
    }
}
