package XII;
import java.util.*;
public class splitS
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s1=in.nextLine();
        Scanner sc=new Scanner(s1);
        String s[]=new String[4];
        int k=0;
        System.out.println("Words are: ");
        while(sc.hasNext())
        {
            s[k]=sc.next();
            k++;
        }
        int l=s.length;
        for(int i=0;i<l;i++)
        {
            System.out.println(s[i]);
        }
        
        sc.close();
        System.out.println();
        
        System.out.println("Enter word to Search: ");
        String w=in.next();
        int f=0;
        for(int i=0;i<l;i++)
        {
            if(s[i].equalsIgnoreCase(w))
            {
                f=1;
                break;
            }
            else
            {
                f=0;
            }
        }
        if(f==1)
        {
            System.out.println(w + " is present");
        }
        else
        {
            System.out.println("It isn't present");
        }
    }
}