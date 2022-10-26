package Inner_Class;
class Outer{
    int x=10;
    class Inner{
        int y=20;
        void display(){
            System.out.println(x);
            System.out.println(y);
        }
    }
//    void outerDisplay(){
//        Inner n=new Inner();
//        n.display();
//        System.out.println(n.y);
//    }
}
public class NestedClass {
    public static void main(String[] args) {
//        Outer o=new Outer();
//        o.outerDisplay();
        Outer.Inner oi=new Outer().new Inner();
        oi.display();

    }
}
