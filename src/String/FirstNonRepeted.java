package String;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeted {

    public static void main(String[] args) {

        System.out.println("The non repearting string is : "+ getUnuque("He is he who is he"));
        
    }

    public static String getUnuque(String input)
    {
        String[] words = input.split("\\s+");

        // Use LinkedHashMap to store words and their counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Populate the map with words and their counts
        for (String word : words) {
            word = word.toLowerCase();
            wordCountMap.put(word, wordCountMap.getOrDefault(word,0)+1);
        }

        for(Map.Entry<String,Integer> entry : wordCountMap.entrySet())
        {
            if(entry.getValue() == 1)
                return entry.getKey();
        }

        return null;
    }
    
}
