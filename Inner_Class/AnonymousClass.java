package Inner_Class;

abstract class My {
    abstract void display();
}

class Outer2 {
    public void meth() {
        My m = new My() {
            void display() {
                System.out.println("Hello");
            }
        };
        m.display();
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        Outer2 o = new Outer2();
        o.meth();
    }
}
