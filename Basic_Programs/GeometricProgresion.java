import java.util.*;

public class GeometricProgresion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double start, ratio;
        int number;
        System.out.println("Enter the starting term:");
        start = s.nextDouble();
        System.out.println("Enter the common ratio:");
        ratio = s.nextDouble();
        System.out.println("Enter the number of terms up-to which it should continue: ");
        number = s.nextInt();
    for(int i=0;i<=number;i++){
        System.out.println(start);
        start=start*ratio;
    }



    }
}
