import java.util.*;
public class d2bRecur
{
    int x;
    int conv(int n)
    {
        if(n==0)
            return 0;
        else 
        {
            x=n%2;
            return x+(conv(n/2)*10);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. to be Converted : ");
        int a =sc.nextInt();
        d2bRecur ob=new d2bRecur();
        System.out.println("Binary No. is: ");
        System.out.println(ob.conv(a));
    }
}