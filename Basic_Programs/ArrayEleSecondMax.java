import java.util.*;
public class ArrayEleSecondMax{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x,max1=0,max2=0;
        System.out.println("Enter the size of an array: ");
        x=s.nextInt();
        int arr[]=new int[x];
        System.out.println("Enter the elements of an array: ");
        for (int i=0;i< arr.length;i++){
            arr[i]=s.nextInt();
        }
        for (int i=0;i< arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];

            }
        }
        System.out.println("The Second greatest element present in the array is: "+max2);

    }
}
