package String;

import java.util.Stack;

public class BalancedString {

    public static void main(String[] args) {

        System.out.println("Balanced ?? : "+ isbalanced("{[]}"));
        
    }
    

    public static boolean isbalanced(String s)
    {
    
        Stack<Character> stackchar=new Stack<>();

        if(s.length()%2 !=0){
        System.out.println("Came for lenght check");
        return false;
        }

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            char topch='\u0000';
            if(ch == '{' || ch == '[' || ch == '(' )
            {
                stackchar.push(ch);
            }

            else if(ch == '}' || ch == ']' || ch == ')' )
            {
                if(stackchar.isEmpty())
                    return false;

                topch=stackchar.pop();

            }

            if(ch != topch)
                return false;
        }

        

        return true;
    }
}
