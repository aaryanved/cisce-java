import java.util.*;
public class Anagram
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Word: ");
        String w=sc.next();
        System.out.println("Enter Anagram Word to be checked: ");
        String w1=sc.next();
        w=w.toLowerCase();
        w1=w1.toLowerCase();
        int f=0;
        if(w.length()==w1.length())
        {
            f=1;
            int l=w.length();
            for(int i=0;i<l;i++)
            {   
                for(int j=0;j<l;j++)
                {
                    if(w.charAt(i)==w1.charAt(j))
                    {
                        f=1;
                        break;
                    }
                    else
                    {
                        f=0;    
                    }
                }
            }
            if(f==1)
            {
                System.out.println("Word is Anagram");
            }
            else
            {
                System.out.println("Word is not Anagram");
            }
        }
        else
        {
            System.out.println("Word is not Anagram");
        }
    }
}
