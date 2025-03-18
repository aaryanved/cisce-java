package XII.BoardPracticalPractice;

import java.util.*;
public class Facinating
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input: ");
        int n=sc.nextInt();
        int num=n;
        int d=0;
        while(num>0)
        {
            d++;
            num/=10;
        }
        //System.out.println("Digits: " + d);
        if(d!=3)
        {
            System.out.println("Input digits must be 3");
        }
        else
        {
            int dub=n*2;
            int trip=n*3;
            String n1="" + n + n*2 + n*3;
            System.out.println("Concat: " + n1);
            char di[]={'1','2','3','4','5','6','7','8','9'};
            //System.out.println(n1);
            int t=0;
            for(int i=0;i<di.length;i++)
            {
                for(int j=0;j<n1.length();j++)
                {
                    if(di[i]==n1.charAt(j))
                    {
                        t++;
                        break;
                    }
                }
            }
            //System.out.println(t);
            if(t==9)
            {
                System.out.println("It is a Facinating Number");
            }
            else
            {
                System.out.println("It is not a Facinating Number");
            }
        }
    }
}