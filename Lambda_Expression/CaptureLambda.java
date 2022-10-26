package Lambda_Expression;

interface MyLambda1 {
    public void display();
}

class UseLambda {
    public void callLambda(MyLambda1 ml) {
        ml.display();
    }
}

class Demo {
    public void method1() {
        UseLambda ul = new UseLambda();
        ul.callLambda(() -> {
            System.err.println("Hello how are you ");
        });


    }
}

public class CaptureLambda {

    public static void main(String[] args) {
        Demo d = new Demo();
        d.method1();
    }

}


