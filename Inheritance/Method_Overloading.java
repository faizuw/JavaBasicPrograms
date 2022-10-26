package Inheritance;
import java.util.*;
class Test{
    public int max(int a,int b){
        if (a>b){
            return a;
        }else return b;
    }
    public int max(int a,int b,int c){
        if (a>b ||a>c){
            return a;
        }else if(b>c) {
        return b;
        }else return c;
    }
}
public class Method_Overloading {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter the 1 number ");
        x=s.nextInt();
        System.out.println("Enter the 2 number ");
        y=s.nextInt();
        System.out.println("Enter the 3 number ");
        z=s.nextInt();
        Test t=new Test();


        System.out.println("The greatest of the 2 numbers is "+t.max(x,y));
        System.out.println("The greatest of the 3 numbers is "+t.max(x,y,z));

    }
}
