package XII;

import java.util.*;
public class Q1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        s=s.toLowerCase();
        Scanner sc1=new Scanner(s);
        int k=0, sl=s.length();
        while(sc1.hasNext())
        {
            k++;
            sc1.next();
        }
        String st[]=new String[k];
        k=0;
        String lo="", so="";
        Scanner in=new Scanner(s);
        while(in.hasNext())
        {
            st[k]=in.next();
            k++;
        }
        char a[]={'a','b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int al=a.length;
        int c=0, ll=st[k-1].length();
        char ch=st[k-1].charAt(ll-1);
        if(ch=='.' || ch=='!' || ch=='?')
        {
            for(int i=0; i<al; i++)
            {
                for(int j=0; j<sl; j++)
                {
                    if(a[i]==s.charAt(j))
                    {
                        c++;
                        break;
                    }
                }
            }
            if(c==26)
            {
                System.out.println("IT IS A PANAGRAM");
            }
            else
            {
                System.out.println("IT IS NOT A PANAGRAM");
            }
            for(int i=0; i<k;i++)
            {
                for(int j=i;j<k;j++)
                {
                    if(st[i].length()>st[j].length())
                    {
                        lo=st[i];
                    }
                    else
                    {
                        so=st[i];
                    }
                }
            }
            in.close();
            System.out.println("Longest Word: " + lo);
            System.out.println("Shortest Word: " + so);
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }
}
