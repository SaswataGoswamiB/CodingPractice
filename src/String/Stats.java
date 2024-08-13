package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stats {

    public static void main(String[] args) {
        //Beni is so hansome

        System.out.println("The stats are : "+ getstats("Beni is so Handsome")); 
        
    }

    public static Map<String,Integer> getstats(String s)
    {
        Map<String,Integer> statmap=new HashMap<String,Integer>();
        // Count words//
        //Count vowel //
        // Count UpperCase.
        int vowelcount=0;
        int upppercasecount=0;
         List<Character> vowellist =Arrays.asList('a','e','i','o','u');

         List<String> charlist=Arrays.asList(s.split(" "));
         statmap.put("WordCount",charlist.size());

         for(String sc: charlist)
         {
            for(int i=0;i<sc.length();i++)
            {
                if(Character.isUpperCase(sc.charAt(i)))
                upppercasecount+=1;

                if(vowellist.contains(sc.charAt(i)))
                vowelcount+=1;
            }
         }

        statmap.put("Vowel Count", vowelcount);
        statmap.put("UpperCase Count ", upppercasecount);
        return statmap;

         
    }
    
}
