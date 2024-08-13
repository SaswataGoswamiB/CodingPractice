package String;

public class EvenLenght {

    public static void main(String[] args) {
        

        iseven("Saswata is funny as fuck you know");
    }

    public static void iseven(String s)
    {
        String [] ch= s.split(" ");
        for (int i=0;i<ch.length;i++)
        {
            if(ch[i].length() % 2 == 0)
            {
                System.out.println("The Even Strng is : "+ ch[i]);
            }
        }
    }
    
}
