import java.util.*;

public class ArrayEleInsert {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int val, ind;
//        int indexPointer = -1;
//        int arr[] = new int[10];
//        arr[++indexPointer] = 5;
//        arr[++indexPointer] = 9;
//        arr[++indexPointer] = 6;
//        arr[++indexPointer] = 10;
//        arr[++indexPointer] = 12;
//        arr[++indexPointer] = 7;
//        System.out.println("Enter the value you want to enter: ");
//        val = s.nextInt();
//        System.out.println("Enter the index at which you want to place the new value:");
//        ind = s.nextInt();
//        for (int i = indexPointer; i >= ind; i--) {
//            arr[i + 1] = arr[i];
//        }
//        arr[ind] = val;
//        ++indexPointer;
//        for (int i = 0; i <= indexPointer ; ++i){
//            System.out.println(arr[i]);
//        }

        int A[] = new int[10];
        A[0] = 5;
        A[1] = 9;
        A[2] = 6;
        A[3] = 10;
        A[4] = 12;
        A[5] = 7;
        int n = 6, val, ind;
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + ",");
        }
        System.out.println();

        System.out.println("Enter the value you want to enter: ");
        val = s.nextInt();
        System.out.println("Enter the index at which you want to place the new value:");
        ind = s.nextInt();
        for (int i = n; i >= ind; i--) {
            A[ i + 1 ]=A[i];
        }
            A[ind]=val;
        System.out.println("The new array is :");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(A[i] + ",");


        }
    }
}
