import java.util.*;
public class FindTypeProtocolWebsite {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String url;
        System.out.println("Enter the URL:");
        url=s.nextLine();
        String sub1,sub2;
        int i=url.indexOf(":");
        int j=url.lastIndexOf(".");

        sub1=url.substring(0,i).trim();
        sub2=url.substring(j+1,url.length()).trim();

        if (sub1.equals("http")){
            System.out.println("This website uses Hyper Text Transfer Protocol");

        } else if (sub1.equals("ftp")) {
            System.out.println("This website uses File Transfer Protocol");

        } else if (sub1.equals("https")) {
            System.out.println("This website uses Secured Hyper Text Transfer Protocol");
        }else{
            System.out.println("Not a valid Protocol");
        }
      /*if (sub2.equals("com")){
          System.out.println("This is a Commercial website");
      } else if (sub2.equals("gov")) {
          System.out.println("This is a Government website");
      } else if (sub2.equals("org")) {
          System.out.println("This is a Organizational website");
      } else if (sub2.equals("net")) {
          System.out.println("This is a Network website");
      } else if (sub2.equals("biz")) {
          System.out.println("This is a Business website");
      }else {
          System.out.println("Invalid website ");
      }

       */
        //type using switch
        switch (sub2){
            case "com":
                System.out.println("This is a Commercial website");
                break;
            case "gov":
                System.out.println("This is a Government website");
                break;
            case "org":
                System.out.println("This is a Organizational website");
                break;
            case "net":
                System.out.println("This is a Network website");
                break;
            case "biz":
                System.out.println("This is a Business website");
                break;
            default:
                System.out.println("Invalid website");
        }

    }
}
