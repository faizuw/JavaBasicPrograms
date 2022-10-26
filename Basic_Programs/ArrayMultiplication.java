public class ArrayMultiplication {
    public static void main(String[] args) {
        int arr1[][]={{3,5,9},{7,6,2},{4,3,5}};
        int arr2[][]={{1,0,0},{0,1,0},{0,0,1}};
        int arr3[][]=new int[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr3[i][j]=0;
                for(int k=0;k<3;k++){
                    arr3[i][j]=arr3[i][j]+arr1[i][k]*arr2[k][j];
                }


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
