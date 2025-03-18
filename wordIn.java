package XII;

import java.util.*;
public class wordIn
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String s=sc.nextLine();
        System.out.println("Enter an Index No.: ");
        int n=sc.nextInt();
        System.out.println("Enter Word: ");
        String w=sc.next();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            System.out.print(s.charAt(i));
            if(i==n)
            {
                System.out.print(w);
                continue;
            }
        }
    }
}