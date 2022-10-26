import java.util.*;

public class Multiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //own logic
        /*
      int number,x;
        System.out.print("Enter the number for which you want multiplication table: ");
        number=s.nextInt();
        for (int i=number,j=1;  j<=10;   j++){
            x=i*j;
            System.out.println(i+" * "+j+" = "+x);
            }
         */

        //simple way

        int z, p;
        System.out.print("Enter the number for which you want multiplication table: ");
        z = s.nextInt();
        for (int y = 1; y <= 10; y++) {
            p = z * y;
            System.out.println(z + " * " + y + " = " + p);


        }

    }


}





