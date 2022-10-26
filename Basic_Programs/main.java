public class main {
    public static void main(String[] args) {


       int  x =10, y=3;
       float a=12.89f, b=8.9f;  // default is double
        int c= x/y;
        int z=x%y;
        double d= x/(double)y; //type cast
        float f=a/b;

        System.out.println("The division is "+c);
        System.out.println("The mod is "+z);
        System.out.println("The mod in double point is "+d);
        System.out.println("The mod in floating point is "+f);
    }


}
