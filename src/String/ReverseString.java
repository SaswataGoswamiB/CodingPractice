package String;


public class ReverseString {

    public static void main(String[] args) {

        System.out.println("The reversed String is : " + getreverse("Beni is fucking handsome"));

        System.out.println("The Palindrome is ???? " + ispalindrome("saswata"));
        
    }

    public static  String getreverse(String s)
    {
        return new StringBuffer(s).reverse().toString();
    }

    public static boolean ispalindrome(String s1)
    {
        String reversed=new StringBuffer(s1).reverse().toString();
        return s1.equals(reversed);
    }
    
}
