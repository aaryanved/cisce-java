package XII;

import java.util.*;
public class ArmRecur
{
    int num;
    ArmRecur()
    {
        num=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to Check for Armstrong: ");
        num=sc.nextInt();
    }
    int count(int n)//Number of Digits
    {
        int c=0;
        while(n>0)
        {
            c++;
            n/=10;
        }
        return c;
    }
    int powerSum(int n)
    {
        int s=0;
        int p=count(n);
        while(n>0)
        {
            s+=Math.pow(n%10,p);
            n/=10;
        }
        return s;
    }
    boolean Armstrong()
    {
        if(num==powerSum(num))
        {
            return true;
        }
        else
            return false;
    }
    public static void main(String args[])
    {
        ArmRecur ob=new ArmRecur();
        ob.input();
        if(ob.Armstrong())
        {
            System.out.println("It is Armstrong");
        }
        else
        {
            System.out.println("It is not Armstrong");
        }
    }
}