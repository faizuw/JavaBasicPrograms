package Inheritance;

class Account {
    private int accNO;
    private String name;
    private double balance;
    private String address;
    private int phNO;
    private String dob;

    Account(int accNO, String name, double balance, String address, int phNO, String dob) {
        this.accNO = accNO;
        this.name = name;
        this.phNO = phNO;
        this.balance = balance;
        this.address = address;
        this.dob = dob;
    }

    public Account() {

    }


    public int getAccNO() {
        return accNO;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAddress() {
        return address;
    }

    public int getPhNO() {
        return phNO;
    }

    public String getDob() {
        return dob;
    }

    public void setBalance(double b) {
        balance += b;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setPhNO(int p) {
        phNO = p;
    }


}


class SavingAccount extends Account {

    public SavingAccount(int accNO, String name, double balance, String address, int phNO, String dob) {
        super(accNO, name, balance, address, phNO, dob);

    }

    public void deposit(double amount) {
        setBalance(amount);

    }

    public void withDraw(double amount) {
        setBalance(-amount);

    }

}


class LoanAccount extends Account {



    public void payEmi(double emi) {
        setBalance(-emi);
    }

}


public class Customer_Account {
    public static void main(String[] args) {
        //Account x = new Account(1010, "faizan", 78, "hawal", 7006, "01-09-1898");
        SavingAccount sav = new SavingAccount(1010, "faizan", 78, "hawal", 7006, "01-09-1898");
        sav.deposit(900);
        sav.withDraw(200);
        System.out.println(sav.getBalance());

    }
}
