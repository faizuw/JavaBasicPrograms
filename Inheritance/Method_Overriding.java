package Inheritance;

class Tv {
    public void switchOn() {
        System.out.println("Tv is  switched on");
    }

    public void changeChannel() {
        System.out.println("Tv channel is changed");
    }

}

class SmartTv extends Tv {
    @Override
    public void switchOn() {
        System.out.println("Smart Tv is switched on");
    }
@Override
    public void changeChannel() {
        System.out.println("Smart Tv channel is changed ");
    }

    public void browse() {
        System.out.println("Smart tv is  browsing");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Tv t = new SmartTv();
    t.switchOn();
    t.changeChannel();
    }
}
