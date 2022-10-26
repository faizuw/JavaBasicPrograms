package Exception_Handling;
class NegativeValue extends Exception{
    public String toString(){
        return "Measurements should not be negative";
    }
}


public class ThrowThrows  {
    static int area(int l,int b)throws NegativeValue {
        if (l < 0 || b < 0) {
            throw new NegativeValue();}
            return l * b;


    }
    static void meth() throws NegativeValue{
        System.out.println("Area of rectangle is "+area(2,4));
    }


    public static void main(String[] args) {
        try {
            meth();
        }catch(NegativeValue e){
            System.out.println(e);
        }
    }
}
