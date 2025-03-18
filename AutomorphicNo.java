//Define a class called AutomorphicNo with the following description:
//Instance variables/data members:
//int n - to store number value
//int x - to store value 0
//int store - to store the value of int n
import java.util.Scanner;
public class AutomorphicNo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");//to take number inout
        int n=sc.nextInt();
        int x=0;
        int store=n;
        while(store>0)
        {
            store=store/10;//to calculate automorphic number
            x++;
        }
        int sq=n*n;
        int y=sq%(int)Math.pow(10,x);
        if(y==n)//to check conditions for automorphic number
        System.out.println("It is an Automorphic Number");
        else
        System.out.println("It is not an Automorphic Number");
    }
}