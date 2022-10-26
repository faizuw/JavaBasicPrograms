public class stringChallenge {
    public static void main(String[] args) {
        String str ="programmer@gmail.com";

        /*String firstSub=str.substring(0,10);
        String secondSub=str.substring(11,20);
        System.out.print ("The user name is: "+firstSub);
        System.out.println ("\nThe domain name is: "+secondSub);
        System.out.println(secondSub.matches("gmail.*"));
        */
        int i =str.indexOf("@");
        String firstSub=str.substring(0,i);
        String secondSub=str.substring(i+1,str.length());
        System.out.print ("The user name is: "+firstSub);
        System.out.println ("\nThe domain name is: "+secondSub);
        System.out.println(secondSub.matches("gmail.*"));



    }
}
