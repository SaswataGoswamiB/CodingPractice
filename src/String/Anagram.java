package String;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        
        System.out.println("Anagram ?? "+isAnagram("EARTH","RAET"));
    }

    public static boolean isAnagram(String s1,String s2)
    {
        s1=s1.replaceAll("\\s","");
        s2=s2.replaceAll("\\s","");

        if(s1.length() != s2.length())
            return false;

        char [] c1= s1.toCharArray();
        char [] c2=s2.toCharArray();

        //sort them.

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }
    
}
