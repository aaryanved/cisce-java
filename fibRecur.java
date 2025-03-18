import java.util.*;
public class fibRecur
{
    int fib(int n)//n=3
    {
        if(n<=1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        fibRecur ob=new fibRecur();
        System.out.println("The " + n + "th Fibonacci Number is " + ob.fib(n));
    }
}