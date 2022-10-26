public class ArrayPractice {
    public static void main(String[] args) {
//        int a[]=new int[5];
//        int b[]={1,4,5,6,7};
//        int c[];
//        c=new int[10];
//        b[2]=13;
//        a[0]=12;
//        a[2]=65;
//        for (int i=0;i<b.length;i++){
//            System.out.println(b[i]);
//        }
//
//
//        //resverse printing
//        for (int i=b.length-1;i>=0;i--){
//            System.out.println(b[i]);
//        }
////foreach
//        for(int x:b){
//            System.out.print(x+" ");
//        }
int a[][]={{1,2,3,4},{2,4,6,80},{3,5,7,9}};
for(int i=0;i<a.length;i++){
    for (int j=0;j<a[0].length;j++){
        System.out.print(a[i][j]);
    }
    System.out.println("\n");
}




    }
}
