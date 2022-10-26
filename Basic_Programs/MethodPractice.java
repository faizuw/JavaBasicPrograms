import java.util.*;

public class MethodPractice {

    //     int sum(int x ,int y){
//        int z;
//        z=x+y;
//        return z;
//
//    }
//     int sub(int x ,int y){
//        int z;
//        z=x-y;
//        return z;
//
//    }
    static int isPrime(int x) {

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                System.out.println("Number is composite");
                return x;
            }
        }
        System.out.println("Number is Prime");
        return x;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int a,b,c;
//        System.out.println("Enter the first number: ");
//        a=s.nextInt();
//        System.out.println("Enter the second number: ");
//        b=s.nextInt();
//        //creating object to access method
//        MethodPractice obj1=new MethodPractice();
//        c=obj1.sum(a,b);
//        System.out.println("The sum of two numbers is: "+c);
//        c=obj1.sub(a,b);
//        System.out.println("The subtraction of two numbers is: "+c);
        //Prime number
        int num, res;
        System.out.println("Enter the number: ");
        num = s.nextInt();
        res = isPrime(num);
        System.out.println(res);




//        for (int i = 2; i <= 100; ++i){
//            if (isPrime(i)){
//                System.out.print(i+" ");
//            }
//        }

    }
}
