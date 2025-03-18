import java.util.*;
public class fibSeries
{
    public static void main(String argsp[])
    {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        int c=0;
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        System.out.print(a + "," + b);
        for(int i=3;i<=n;i++)
        {
            c=a+b;
            System.out.print(","+c);
            a=b;
            b=c;
        }
    }
}