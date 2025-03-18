import java.util.*;
public class LongestWord
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        s=s+"";
        String w="", w1="";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                w+=c;
            }
            else
            {
                if(w.length()>w1.length())
                {
                    w1=w;
                    w="";
                }
            }
        }
        int l1=w1.length();
        System.out.println("Longest word is "+w1);
        System.out.println("Its length is: "+ l1);
    }
}
