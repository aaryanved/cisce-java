package XII;

import java.util.*;
public class PalinCon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Scanner in=new Scanner(s);
        int k=0, l=s.length();

        while(in.hasNext())
        {
            k++;
            in.next();
        }
        String s1[]=new String[k];
        in.reset();
        k=0;
        while(in.hasNext())
        {
            s1[k]=in.next();
            k++;
        }
        String rev="";
        for(int i=0;i<s1.length;i++)
        {
            for (int j = s1[i].length(); j >= 0; j--) 
            {
                rev = rev + s1[i].charAt(i);
            }
            if(rev.equals(s1[i]))
            {}
            else
            {
                
            }
        }
    }
}