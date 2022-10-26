package Static_Final;

class CoffeeMachine {
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;

    static private CoffeeMachine m = null;

    private CoffeeMachine() {
        coffeeQty = 1;
        milkQty = 1;
        waterQty = 1;
        sugarQty = 1;
    }

    public void fillWater(float waterQty) {
        this.waterQty = waterQty;
    }

    public void fillSugar(float sugarQty) {
        this.sugarQty = sugarQty;
    }

    public void getCoffee() {
        System.out.println("Coffee is ready to serve!");
    }
   static  CoffeeMachine getInstance(){
        if (m==null){
            m=new CoffeeMachine();

        }return m;
   }

}

public class SingletonClass {
    public static void main(String[] args) {
    CoffeeMachine m1= CoffeeMachine.getInstance();
    m1.getCoffee();
    }
}
