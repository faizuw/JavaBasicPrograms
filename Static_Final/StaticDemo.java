package Static_Final;
class Test{
    static int x=10;
    int y=20;
    public void show(){
        System.out.println("The value of x is: "+x+ " and the value of y is: "+y);
    }
    static void display(){
        System.out.println(x);

    }
}
public class StaticDemo {
    public static void main(String[] args) {
        Test t=new Test();
        t.show();

        t.x=50;
        t.y=80;
        Test t1=new Test();
        t1.show();

    }
}
