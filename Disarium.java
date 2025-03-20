import java.util.*;
public class Disarium 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        int n1=n;
        int c=0;
        while(n1>0)
        {
            c++;
            n1/=10;
        }
        int s=0;
        n1=n;
        int p=c;
        for(int i=c;i>0;i--)
        {
            int d=n1%10;
            s+=Math.pow(d,i);
            n1/=10;
        }
        if(s==n)
        {
            System.out.println("Disarium Number");
        }
        else
        {
            System.out.println("Not Disarium Number");
        }
    }
}
