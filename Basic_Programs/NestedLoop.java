public class NestedLoop {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println("");
//        }



//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print(i+" ");
//            }
//            System.out.println("");
//        }

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print((i+j)+" ");
//            }
//            System.out.println("");
//
//        }
//        int count=0;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                ++count;
//                System.out.format("%4d",count);
//            }
//            System.out.println("");
//        }

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println("");
//        }



//int count=0;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                ++count;
//                System.out.print(count+" ");
//            }
//            System.out.println("");
//        }

//        for (int i = 1; i <= 5; i++) {
//               for (int j = 1; j <= 5-i+1; j++) {
//
//                System.out.print(j+" ");
//
//            }
//            System.out.println("");
//        }
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                if(j>=i)
//                {
//                    System.out.print("* ");
//                }else System.out.print("  ");
//            }
//            System.out.println("");
//        }
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                if(j+i>5)
//                {
//                    System.out.print("* ");
//                }else System.out.print("  ");
//            }
//            System.out.println("");
//        }


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(j+i>5)
                {
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            for(int k=i;k<=i;k++){


                    System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
