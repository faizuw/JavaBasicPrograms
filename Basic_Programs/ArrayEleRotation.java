public class ArrayEleRotation {
    public static void main(String[] args) {
        int arr[] = {5, 9, 6, 10, 12, 7, 3, 5, 4, 2};
        System.out.println("Original array:");
        for (int x : arr) {
            System.out.print(x+" ");
        }
//        //left shift
//       int temp1 = arr[0];
        int temp2= arr[arr.length-1];
//
//        for (int i = 1; i < arr.length; i++) {
//            arr[i - 1] = arr[i];
//        }
//        arr[arr.length - 1] = temp1;
//        System.out.println();
//        for (int y : arr) {
//            System.out.print(y+" ");
//        }
//right shift

        for (int i= arr.length-1;i>0; i--) {
              arr[i]=arr[i-1];
        }
        arr[0]=temp2;
        System.out.println();
        for (int z : arr) {
            System.out.print(z+" ");
        }
    }
}
