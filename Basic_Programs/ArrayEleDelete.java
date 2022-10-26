import java.util.*;
public class ArrayEleDelete {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]={2,4,6,7,9,12,34};
        for (int i=0; i< arr.length;i++){
            System.out.print(arr[i]+",");
        }
        int index;
        System.out.println();
        System.out.print("Enter the index that you want to delete: ");
        index=s.nextInt();

        for (int i=index;i< arr.length-1;i++){
            arr[i]=arr[i+1];

        }
        //arr[arr.length-1]=0;k
        for (int i=0; i< arr.length-1;i++){
            System.out.print(arr[i]+",");}


    }
}
