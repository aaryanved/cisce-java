
import java.util.*;
public class Happy 
{
    int n;
    Happy()
    {
        n=0;
    }
    void getnum(int nn)
    {
        n=nn;
    }
    int sum_sq_digits(int x)
    {
        int sum=0;
        while(x>0)
        {
            int d=x%10;
            sum+=d*d;
            x/=10;
        }
        return sum;
    }
    void ishappy()
    {
        int x=n;
        while(x>9)
        {
            x=sum_sq_digits(x);
        }
        if(x==1)
            System.out.println("It is a happy number");
        else
            System.out.println("It is not a happy number");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        Happy ob=new Happy();
        ob.getnum(n);
        ob.ishappy();
    }
}
