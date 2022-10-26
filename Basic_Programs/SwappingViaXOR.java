import java.util.*;
public class SwappingViaXOR {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int x,y,z;
        System.out.println("Enter the first number: ");
        x=s.nextInt();
        System.out.println("Enter the second number: ");
        y=s.nextInt();
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("The numbers after swapping are: First no. "+x+ " and Second no." +y);


    }
}
