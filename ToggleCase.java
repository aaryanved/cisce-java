package XII.BoardPracticalPractice;

import java.util.*;
public class ToggleCase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s1=sc.nextLine();
        char c=s1.charAt(s1.length()-1);
        if(c=='.' || c=='?')
        {
            String s="";
            s1=s1.substring(0,s1.length()-1);
            for(int i=s1.length()-1;i>-1;i--)
            {
                s=s+s1.charAt(i);
            }
            
            s=s.toLowerCase() + " ";
            //System.out.println(s);
            String ss=s.toUpperCase();
            for(int i=0;i<s.length()-1;i++)
            {
                System.out.print(ss.charAt(i));
                i++;
                System.out.print(s.charAt(i));
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}