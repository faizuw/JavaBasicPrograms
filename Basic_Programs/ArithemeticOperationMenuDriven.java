import java.util.*;
public class ArithemeticOperationMenuDriven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double first,second;
        String option;
        System.out.println("MENU");
        System.out.println("1.ADD");
        System.out.println("2.SUB");
        System.out.println("3.DIV");
        System.out.println("4.MUl");

        System.out.print("Enter the first number: ");
        first=s.nextDouble();
        System.out.print("Enter the second number: ");
        second=s.nextDouble();
        s.nextLine();
        System.out.println("Enter your option in words :\nFor Addition enter ADD \nFor Subtraction enter SUB \nFor Division enter DIV\nFor Multiplication enter MUL ");
        option=s.nextLine();
        switch (option){
            case "ADD":
                System.out.println("The Addition of number "+first+ " and "+second+" is: "+(first+second));
                  break;
            case "SUB":
                System.out.println("The Subtraction of number "+first+ " and "+second+" is: "+(first-second));
                break;
            case "DIV":
                System.out.println("The Division of number "+first+ " and "+second+" is: "+(first/second));
                break;
            case "MUL":
                System.out.println("The Multiplication of number "+first+ " and "+second+" is: "+(first*second));
                break;
            default:
                System.out.println("Invalid option ");
        }
    }
}
