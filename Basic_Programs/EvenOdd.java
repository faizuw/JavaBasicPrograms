import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double x;
        System.out.print("Enter the number you want to check: ");
        x=s.nextDouble();
        if(x%2==0){
            System.out.println("Number "+x+ " is Even");

        }
        else{
            System.out.println("Number "+x+" is Odd");

        }


    }
}
