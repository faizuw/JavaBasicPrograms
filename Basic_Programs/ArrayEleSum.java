import java.util.*;
public class ArrayEleSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0,x;
        System.out.print("Enter the size of an array: ");
        x=s.nextInt();
        int arr[]=new int[x];
        System.out.println("Enter the elements of an array: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("The sum of all elements of an array is: "+sum);
    }
}
