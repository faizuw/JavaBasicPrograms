import java.util.*;
public class MergingAndMasking {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        byte a,b,c;
        System.out.print("Enter the first number: ");
        a=s.nextByte();
        System.out.print("Enter the second number: ");
        b=s.nextByte();
        c=(byte)(a<<4);
        c=(byte)(c|b);
        System.out.println("The number in the First half of the nibble is: "+((c&0b11110000)>>4));
        System.out.println("The number in the Second half of the nibble is:  "+((c&0b00001111)));

/*int a =14;
int x = a&0b00001000;
System.out.println(Integer.toBinaryString(x));
//if (x != 0){
//    System.out.println(1);
//}

        System.out.println(x>>3);
*/
    }
}
