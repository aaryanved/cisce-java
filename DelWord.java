package XII.BoardPracticalPractice;

import java.util.*;
public class DelWord
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s1=sc.nextLine();
        Scanner in=new Scanner(s1);
        int k=0;
        while(in.hasNext())
        {
            k++;
            in.next();
        }
        Scanner po=new Scanner(s1);
        String s[]=new String[k];
        int o=0;
        while(po.hasNext())
        {
            s[o]=po.next();
            o++;
        }
        System.out.println("Enter Word to Deleted: ");
        String w=sc.next();
        int i=0;
        for(i=0;i<s.length;i++)
        {
            if(s[i].equalsIgnoreCase(w))
            {
                break;
            }
        }
        for(int j=0;j<s.length;j++)
        {
            if(j!=i)
            {
                System.out.print(s[j] + " ");
            }
        }
    }
}