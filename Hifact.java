package XII;

import java.util.*;
class Hifact
{
    int a, b, hcf, lcm;
    Hifact()
    {
        a=b=hcf=lcm=0;
    }
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    void change()
    {
        if(a>b)
        {
            int t=a;
            a=b;
            b=t;
        }
    }
    int rechcf(int a, int b)
    {
        if(b%a==0)
            return a;
        else
            return rechcf(b%a, a);
    }
    int fn_lcm(int a, int b, int h)
    {
        h=rechcf(a,b);
        return (a*b)/h;
    }
    void result()
    {
        int h=rechcf(a,b);
        System.out.println("HCF: " + h);
        System.out.println("LCM: " + fn_lcm(a,b,h));
    }
    public static void main(String args[])
    {
        Hifact ob=new Hifact();
        ob.getdata();
        ob.result();
    }
}