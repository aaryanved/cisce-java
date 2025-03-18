package XII;

import java.util.*;
public class Rot13
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String s=sc.nextLine();
        int L=s.length();
        if(L>3 && L<100)
        {
            for(int i=0; i<L;i++)
            {
                char c=s.charAt(i);
                if((c>='A' && c<'N') || (c>='a' && c<'n'))
                {
                    int k=(int)c+13;
                    c=(char)k;
                }
                else if((c>'N' && c<='Z') || (c>'n' && c<='z'))
                {
                    int k=(int)c-13;
                    c=(char)k;
                }
                System.out.print(c);
            }
        }
        else
        {
            System.out.println("Error Dawg");
        }
    }
}