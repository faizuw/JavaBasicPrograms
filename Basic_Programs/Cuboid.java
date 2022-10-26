import java.lang.*;
import java.util.*;
public class Cuboid {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double length, breadth, height, area, volume, perimeter;
        System.out.print("Enter the Length of Cuboid: ");
        length=s.nextDouble();
        System.out.print("Enter the Breadth of Cuboid: ");
        breadth=s.nextDouble();
        System.out.print("Enter the Height of Cuboid: ");
        height=s.nextDouble();
        area=2*(length*breadth+breadth*height+length*height);
        volume=length*breadth*height;
        perimeter=4*(length+breadth+height);
        System.out.println("The area of cuboid is: "+area);
        System.out.println("The volume of cuboid is: "+volume);
        System.out.println("The Perimeter of cuboid is: "+perimeter);


    }




}
