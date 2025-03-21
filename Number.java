import java.util.*;
public class Number 
{
    int num[];
    int size;
    Number(int n)
    {
        size=n;
        num=new int[size];
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the Array: ");
        for(int i=0;i<size;i++)
        {
            num[i]=sc.nextInt();
        }
    }
    boolean check(int n)
    {
        int l=0;
        int d=n;
        while(d>0)
        {
            l++;
            d=d/10;
        }
        int n1=n%10;
        int n2=n/(int)Math.pow(10,l-1);
        if(n1==n2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void BegEnd()
    {
        for(int i=0;i<size;i++)
        {
            if(check(num[i])==true)
            {
                System.out.print(num[i] + " ");
            }
        }
    }
    void print()
    {
        System.out.println("Original Array: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println("Numbers with same first and last digit: ");
        BegEnd();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n=sc.nextInt();
        Number ob=new Number(n);
        ob.accept();
        ob.print();
    }
}
