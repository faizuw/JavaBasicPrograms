package Exception_Handling;
class UserDefined extends Exception{
    public String toString(){
        return "minimum balance should be not less than 1000";
    }

public class UserDefinedException {


    }
    static void function1(){
        try{
            throw new UserDefined();
        }
        catch(UserDefined e){
            System.out.println(e);
        }
    }
    static void function2(){
    function1();
    }
    static void function3(){
    function2();
    }


    public static void main(String[] args) {
        function3();
    }
}
