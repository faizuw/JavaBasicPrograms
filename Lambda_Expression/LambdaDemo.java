package Lambda_Expression;
@FunctionalInterface
interface MyLambda{
   public void display();
}
public class LambdaDemo {
    static int x=10;
    public static void main(String[] args) {

        MyLambda ml=()->{

            System.out.println("Hello World");
            System.out.println("Welcome to lambda expressions");
            System.out.println(x);
            x++;
            System.out.println(x);

        };
        ml.display();
    }
}
