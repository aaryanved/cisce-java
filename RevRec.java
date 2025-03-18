package XII;

import java.util.*;
public class RevRec
{
    String s1="";
    String rev(String s)
    {
        int l=s.length();
        if(l==0)
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
        RevRec ob=new RevRec();
        System.out.println("Reverse of Word is: " + ob.rev(s));
    }
}