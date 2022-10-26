import java.util.*;

public class ArrayEleMax {

    static int max(int a[]) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];

            }

        }

        return max;
    }

    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int x,max=0;
//        System.out.println("Enter the size of an array: ");
//        x=s.nextInt();
//        int arr[]=new int[x];
//        System.out.println("Enter the elements of an array: ");
//        for (int i=0;i< arr.length;i++){
//            arr[i]=s.nextInt();
//        }
//        for (int i=0;i< arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println("The greatest element present in the array is: "+max);


        //Using method

//        int arr[] = {8, 3, 15, 9, 7};
        int arr[] = {-10, -2, -1};
        int res;
        res = max(arr);
        System.out.println("The greatest element present in the array is: " + res);


    }
}
