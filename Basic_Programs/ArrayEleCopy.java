public class ArrayEleCopy {
    public static void main(String[] args) {
        int arr[]={8,6,10,9,2,15,7,13,14,11};
        int carr[]=new int[10];
        for (int i=0;i< arr.length;i++){
           carr[i]= arr[i];
        }
        for (int x:arr) {
            System.out.print(x+" ");
        }
        System.out.println();
        for (int y:carr) {
            System.out.print(y+" ");
        }



    }
}
