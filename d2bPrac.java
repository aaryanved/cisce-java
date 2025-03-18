
import java.util.*;
public class d2bPrac
{
    int d2b(int n)
    {
        if(n==0)
            return 0;
        else
        {
            return n%2+(d2b(n/2)*10);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Decimal No. to Be Converted: ");
        int y=sc.nextInt();
        d2bPrac ob=new d2bPrac();
        int d=ob.d2b(y);
        System.out.println("The Binary No. is: " + d);
    }
}