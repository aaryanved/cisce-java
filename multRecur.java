import java.util.*;
public class multRecur
{
    int mult(int x, int y)
    {
        if(x==0 || y==0)
        {
            return 0;
        }
        else
        {
            return x+mult(x,y-1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers to be Multiplied: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        multRecur ob=new multRecur();
        System.out.println("The Product is: " + ob.mult(a,b));
    }
}