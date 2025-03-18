import java.util.*;
public class primePalinGen
{
    int start;
    int end;
    int flag;
    primePalinGen (int a, int b)
    {
        start=a;
        end=b;
    }
    int isPrime(int i)
    {
        flag =1;
        for(int j=2; j<i; j++)
        {
            if(i%j==0)
            {
                flag=0;
            }
        }
        return flag;
    }
    int isPalin(int i)
    {
        int temp=i, d=0, r=0, flag=0;
        while(i>0)
        {
            d=temp%10;
            r=(r*10)+d;
            temp=temp/10;
        }
        if(temp==i)
        {
            flag=1;
        }
        return flag;
    }
    void generate()
    {
        for(int j=start; j<=end; j++)
        {
            if(isPalin(j)==1 && isPrime(j)==1)
            {
                System.out.println(j + "is a prime palindrome number");
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start and end values: ");
        int s = sc.nextInt();
        int e = sc.nextInt();
        primePalinGen ob=new primePalinGen(s,e);
        ob.generate();
    }
    }