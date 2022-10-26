package OOPs;

import java.util.*;

class Rectangle1 {
  private double length;
  private double breadth;

  public Rectangle1(){
      setLength(1);
      setBreadth(1);
  }
  public Rectangle1(double l , double b){
      setLength(l);
      setBreadth(b);
  }
  public Rectangle1(double s){
      setLength(s);
      setBreadth(s);
  }

    public double getLength() {
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setLength(double l){
        if (l>0){
            length=l;
        }else length=0;
    }
    public void setBreadth(double b){
        if (b>0){
            breadth=b;

        }else breadth=0;
    }

    public double area(){
        return getLength()*getBreadth();
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        if (length==breadth){
            return true;
        }else return false;
    }
}



public class Data_Hiding {
    public static void main(String[] args) {
      Rectangle1 r1=new Rectangle1(-10,-5);
//      r1.setLength(10);
//      r1.setBreadth(10);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.isSquare());

    }
}
