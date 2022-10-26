package Static_Final;
class Test1{
    final int x; {
        x=10;
    }

    static {
        System.out.println("Block1");

    }
    static {
        System.out.println("Block2");
    }
    final public void show1(){
        System.out.println("Final Block");
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main method");
        Test1 t=new Test1();
        t.show1();    //we can not override the final show method.
        System.out.println("Value of final x value is "+t.x);
    }
}
