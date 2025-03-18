package XII.BoardPracticalPractice;

import java.util.*;
public class Goldbach
{
    int n;
    Goldbach(int n)
    {
        this.n=n;
    }

    boolean isPrime(int q)
    {
        int t=0;
        for(int i=2;i<q;i++)
        {
            if(q%i==0)
            {
                t=1;
                break;
            }
        }
        if (t==1)
            return false;
        else
            return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Goldbach ob=new Goldbach(num);
        int q=0;
        for(int i=1;i<=num/2;i++)
        {
            q=num-i;
            if(ob.isPrime(i) && i%2!=0 && ob.isPrime(q))
            {
                System.out.println(i + "+" + q);
            }
        }
    }
}