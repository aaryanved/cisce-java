//Define a class called PerfectNo with the following description:
//Instance variables/data members:
//int n - to store number value
//int x - to store value 0
import java.util.Scanner;
public class PerfectNo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
        int x=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            x+=i;
        }
        if(x==n)
        System.out.println("The number is a Perfect Number");
        else
        System.out.println("The number is not a Perfect Number");
    }
}