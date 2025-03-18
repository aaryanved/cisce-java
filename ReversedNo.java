//Define a class called ReversedNo with the following description:
//Instance variables/data members:
//int n - to store number value
//int x - to store value 0
import java.util.*;
public class ReversedNo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be reversed: ");//To take number input
        int n=sc.nextInt();
        int x=0;
        while(n>0)//to reverse number digits
        {
            int d=n%10;
            x=x*10+d;
            n=n/10;
        }
        System.out.println("The reversed number is "+ x);
    }
}