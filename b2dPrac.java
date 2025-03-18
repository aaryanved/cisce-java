import java.util.*;
public class b2dPrac
{
    int x=-1;
    int b2d(int n)
    {
        if(n==0)
            return 0;
        else
        {
            x++;
            return ((n%10*(int)Math.pow(2,x)+b2d(n/10)));
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Binary No. to Be Converted: ");
        int y=sc.nextInt();
        b2dPrac ob=new b2dPrac();
        int d=ob.b2d(y);
        System.out.println("The Decimal No. is: " + d);
    }
}