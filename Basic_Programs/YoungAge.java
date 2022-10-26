import java.util.*;
public class YoungAge {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int age;
        System.out.print("Enter the Age of a person: ");
        age=s.nextInt();
        if(age>=14&&age<=55){
            System.out.println("Person is young ");
        }else{
            System.out.println("Person is old");
        }

        //condition for not young
        //if(age<14 || age>55)
    }
}
