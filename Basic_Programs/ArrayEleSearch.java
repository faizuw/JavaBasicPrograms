
import java.util.*;
public class ArrayEleSearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x,search;
        System.out.println("Enter the size of an array: ");
        x=s.nextInt();
        int arr[]=new int[x];
        System.out.println("Enter the elements of an array: ");
        for (int i=0;i< arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.print("Enter the element you want to search: ");
        search=s.nextInt();
        for (int i=0;i< arr.length;i++){
            if(search==arr[i]){
                System.out.println("Element Found at location: "+(i+1));
                System.exit(0);
            }
        }

            System.out.println("Element is not present in the array!");


    }
}
