import java.util.*;

public class ArithemeticProgression {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double start, diff;
        int number;
        System.out.println("Enter the starting term:");
        start = s.nextDouble();
        System.out.println("Enter the difference:");
        diff = s.nextDouble();
        System.out.println("Enter the number of terms up-to which it should continue: ");
        number = s.nextInt();
        //System.out.println(start);

//        for (int i=1;i<=number;i++){
//            System.out.println(start);
//            start=start+diff;
//
//        }

        int count = 1;
//        while (count <= number) {
//            System.out.println(start);
//            start = start + diff;
//            count++;
//
//
//        }

do{

    System.out.println(start);
           start = start + diff;
           count++;
}while(count<=number);

    }
}
