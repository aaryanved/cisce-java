package XII.BoardPracticalPractice;

import java.util.*;
public class WordFreq
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
        int c=0;
        System.out.println("Enter 1 for freq of all"+ "\n" +" Enter 2 for specific Freq");
        int sw=sc.nextInt();
        switch(sw)
        {
            case 1:
                {
                    for(int i=0;i<s.length;i++)
                    {
                        for(int j=0;j<s.length;j++)
                        {
                            if(s[i].equalsIgnoreCase(s[j]))
                            {
                                c++;
                            }
                        }
                        System.out.println(s[i] +" is present " + c + " times.");
                        c=0;
                    }
                }
            case 2:
                {
                    System.out.println("Enter word for freq check");
                    String w=sc.next();
                    for(int j=0;j<s.length;j++)
                        {
                            if(w.equalsIgnoreCase(s[j]))
                            {
                                c++;
                            }
                        }
                        System.out.println(w +" is present " + c + " times.");
                }
        }

    }
}