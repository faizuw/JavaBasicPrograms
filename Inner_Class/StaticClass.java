package Inner_Class;

class Outer3 {
    int x = 10;
    static int y = 20;

    static class Inner3 {
        void display() {
            System.out.println(y);

        }
    }
}

public class StaticClass {
    public static void main(String[] args) {
        Outer3.Inner3 i = new Outer3.Inner3();

        i.display();
    }
}
