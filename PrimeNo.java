//Define a class called PrimeNo with the following description:
//Instance variables/data members:
//int n - to store number value
//int x - to store value 0
import java.util.Scanner;
public class PrimeNo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            x++;
        }
        if (x==2)
        {
            System.out.println("It is not a Prime Number");
        }
        else
        {
            System.out.println("It is a Prime Number");
        }
    }
}