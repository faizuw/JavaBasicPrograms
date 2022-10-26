package Lambda_Expression;
@FunctionalInterface
interface Addition{
    public int add(int x,int y);
}
public class AdditionLambda {
    public static void main(String[] args) {
//        Addition z=(a,b)->{
//            return a+b;
//        };
        Addition z=(a,b)->a+b;
        int ans=z.add(20,30);
        System.out.println("The sum of two numbers is : "+ans);
    }
}
