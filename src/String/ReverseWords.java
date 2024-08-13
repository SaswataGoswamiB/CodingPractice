package String;

public class ReverseWords {

    public static void main(String[] args) {
        
        System.out.println("The String is : "+ reverseWords("India is my Country "));
    }

    public static String reverseWords(String s)
    {
        String [] sarr=s.split(" ");
        StringBuffer strbuffer = new StringBuffer();
        for(int i=sarr.length-1;i>=0;i--)
        {
            strbuffer.append(sarr[i]);
            strbuffer.append(" ");
        }

        return strbuffer.toString();
    }
    
}
