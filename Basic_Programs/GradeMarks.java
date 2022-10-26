import java.util.*;
public class GradeMarks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double maths, science, english, total, avg,per;
        System.out.print("\nEnter the marks obtained in Maths: ");
        maths = s.nextDouble();
        System.out.print("\nEnter the marks obtained in science: ");
        science = s.nextDouble();
        System.out.print("\nEnter the marks obtained in english: ");
        english = s.nextDouble();
        total = maths + science + english;
        avg = total / 3;
        per=total/300*100;
        if (avg >= 70) {
            System.out.println("Grade obtained is A");
        } else if (avg >= 60 && avg < 70) {
            System.out.println("Grade obtained is B");
        } else if (avg >= 50 && avg < 60) {
            System.out.println("Grade obtained is C");
        } else if (avg >= 40 && avg < 50) {
            System.out.println("Grade obtained is D");
        } else {
            System.out.println("Grade obtained is F");
        }
        System.out.println("Percentage obtained is: "+per);

    }


}
