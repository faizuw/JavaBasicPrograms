public class RegularExpression {
    public static void main(String[] args) {
        /*int x=1010;
        String str= String.valueOf(x);
        System.out.println(str.matches("[0-1]+"));
  String x="23/12/2021";
System.out.println(x.matches("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)"));
                 */
        String str="a!B@c#1&2%3";
        System.out.println(str);
        System.out.println(str.replaceAll("[^ a-z A-Z 0-9]",""));
        String str1="             aa    ab    haa s  ssss f     f  f f f f f                 ffffffff             ";
        System.out.println(str1);
        System.out.println(str1.replaceAll("\\s+"," ").trim());
        str1=(str1.replaceAll("\\s+"," ").trim());
        String array[]=str1.split("\\s");
        System.out.println("The number of words are: "+array.length);


    }
}
