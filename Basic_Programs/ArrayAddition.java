public class ArrayAddition {
    public static void main(String[] args) {
        int arr1[][]={{3,5,9},{7,6,2},{4,3,5}};
        int arr2[][]={{1,5,2},{6,8,4},{3,9,7}};
        int arr3[][]=new int[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];

            }
        }
        for (int i=0;i<arr3.length;i++){
            for (int j=0;j<arr3[0].length;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println("\n");
        }


    }
}
