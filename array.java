import java.util.*;
public class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i; 
        int sum=0;
        int a[]=new int[3];
        for(i=0;i<=2;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println("Sum: " + sum);
    }
}