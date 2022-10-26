public class ArrayEleSizeInc {
    public static void main(String[] args) {
        int arr[]={8,6,10,9,2};
        int arr1[]=new int[2* arr.length];

        for (int i =0; i< arr.length;i++){
            arr1[i]=arr[i];
        }
            arr=arr1;
        arr1=null;

        for (int x:arr) {
            System.out.print(x+" ");

        }
        System.out.println();
        for (int y:arr1) {
            System.out.print(y+" ");
        }
    }
}
