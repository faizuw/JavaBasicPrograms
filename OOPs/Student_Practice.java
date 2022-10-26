package OOPs;

import java.util.*;

class Student {
    public long rollNo;
    public String name;
    public String course;
    public Double m1, m2, m3;

    public double total() {
        return m1 + m2 + m3;
    }

    public double average() {
        return total() / 3;
    }

    public char grade() {
        if (total() >= 70) {
            return 'A';

        } else if (total() >= 50 || total() <= 69) {
            return 'B';

        } else if (total() >= 30 || total() <= 49) {
            return 'C';
        } else return 'F';
    }
}

public class Student_Practice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Student stu = new Student();
        System.out.println("Enter the Name of Student: ");
        stu.name = s.nextLine();
        System.out.println("Enter the RollNo of Student: ");
        stu.rollNo = s1.nextLong();
        System.out.println("Enter the Course of Student: ");
        stu.course = s.nextLine();

        System.out.println("Enter the marks of English: ");
        stu.m1 = s1.nextDouble();
        System.out.println("Enter the marks of Maths: ");
        stu.m2 = s1.nextDouble();
        System.out.println("Enter the marks of Science: ");
        stu.m3 = s1.nextDouble();

        System.out.println("Name of the student is " + stu.name);
        System.out.println("Rollno. of the student is " + stu.rollNo);
        System.out.println("Course of the student is " + stu.course);
        System.out.println("Total marks obtained is " + stu.total());
        System.out.println("Average marks is " + stu.average());
        System.out.println("Grade obtained is " + stu.grade());

    }
}
