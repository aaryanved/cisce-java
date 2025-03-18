package XII;


import java.util.*;
public class Gold
{
    int n;
    Gold()
    {
        n=0;
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Even Number");
        n=sc.nextInt();
    }

    boolean isPrime(int n)
    {
        int f=0;
        for(int k=2;k<n;k++)
        {
            if(n%k==0)
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

    void display()
    {
        if(n%2!=0)
        {
            System.out.println("Error! Odd No. Entered");
            System.exit(0);
        }
        System.out.println();
        for(int i=1;i<n;i+=2)
        {
            for(int j=1;j<n;j+=2)
            {
                if(isPrime(i) && isPrime(j))
                {
                    if((i+j)==n)
                    {
                            System.out.println(i + "\t" + j);
                    }
                }
            }
        }
    }

    public static void main(String args[])
    {
        Gold ob=new Gold();
        ob.input();
        ob.display();
    }
}

