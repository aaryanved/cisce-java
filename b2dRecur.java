import java.util.*;

public class b2dRecur
{
    int x=0;
    int conv(int n)
    {
        if(n==0)
            return 0;
        else
        {
            x++;
            return ((n%10* (int)Math.pow(2,x))+ conv(n/10));
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a No. to be Converted: ");
        int l=sc.nextInt();
        b2dRecur ob = new b2dRecur();
        int y=ob.conv(l);
        System.out.println("Decimal Number is: "+ y/2);
    }
}