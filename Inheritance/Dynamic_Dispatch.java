package Inheritance;
class Super{
    public void display(){
        System.out.println("Super class");
    }
}
class Sub extends Super{
    public void display(){
        System.out.println("Sub class");
    }
}
public class Dynamic_Dispatch {
    public static void main(String[] args) {
        Super s;
        s=new Sub();
        s.display();
    }
}
