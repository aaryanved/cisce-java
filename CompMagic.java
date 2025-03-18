package XII;

import java.util.*;
public class CompMagic
{
    int n, sum;
    CompMagic()
    {
        n=0;
        sum=0;
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        n=sc.nextInt();
    }

    boolean isPrime(int n)
    {
        int f=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    boolean isMagic(int n)
    {
        int n1=n;
        while(n1>9)
        {
            n1=sum;
            sum=0;
            while(n1>0)
            {
                sum+=n1%10;
                n1=n1/10;
            }
        }
        if(n1==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    void display()
    {
        if(isPrime(n)==false && isMagic(n)==true)
        {
            System.out.println("The Number is CompMagic");
        }
        else
        {
            System.out.println("The Number is not CompMagic");
        }
    }
    public static void main(String args[])
    {
        CompMagic ob=new CompMagic();
        ob.input();
        ob.display();
    }
}
