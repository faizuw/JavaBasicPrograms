/**
 * @author Faizan Wani
 * @version 1.0
 * @since 2022
 **/
package Static_Final;
/**
 * @author Faizan Wani
 * package for Static and final Keyword
 */

import java.util.*;
class Student{
    /**
     * string variable rollNo
     */
    private String rollNo;
    /**
     * @value 1 default value
     */
    private static int count=1;
    private String assignRollNo(){
        Date d=new Date();
        String rN="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rN;
    }
    Student(){
        rollNo=assignRollNo();
    }
    public String getRollNo(){
        return rollNo;
    }
}
public class Challenge {
    public static void main(String[] args) {
       Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s2.getRollNo());
    }
}
