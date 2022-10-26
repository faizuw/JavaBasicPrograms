package Abstract_Class;
abstract class Super{
    public Super(){

    }
    public void method1(){
        System.out.println("Super class method");

    }
    abstract public void method2();
}
class Sub extends Super{
    public Sub(){
        System.out.println("Sub class constructor");
    }
    @Override
    public void method2(){
        System.out.println("Sub class method 2");
    }
}



public class Abstract_Demo {
    public static void main(String[] args) {
        Super s=new Sub();
        s.method1();
        s.method2();
    }
}
