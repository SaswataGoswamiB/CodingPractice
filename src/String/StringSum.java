package String;

public class StringSum {

    public static void main(String[] args) {

        System.out.println("Sum is : " + stringsum("111","222"));
        
    }
    
    public static int stringsum(String s1,String s2)
    {
        return Integer.parseInt(s1) + Integer.parseInt(s2) ;
    }
}
