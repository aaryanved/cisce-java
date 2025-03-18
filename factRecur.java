import java.util.*;
public class factRecur
{
    int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        int a=0;
        factRecur ob=new factRecur();
        System.out.println(ob.fact(n));
    }
}

