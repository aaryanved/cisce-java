package XII;

import java.util.*;
public class PalinRec
{
    String rev(String s)
    {
        int l=s.length();
        if(s.length()==0)
        {
            return "";
        }
        else
        {
            return s.charAt(l-1)+rev(s.substring(0,l-1));
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Word: ");
        String s=sc.next();
        PalinRec ob=new PalinRec();
        String s1=ob.rev(s);
        if(s.equals(s1))
        {
            System.out.println("It is Palindrome");
        }
        else
        {
            System.out.println("It is Not Palindrome");
        }
    }
}
