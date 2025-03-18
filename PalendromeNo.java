//Define a class called PalendromeNo withe the following description:
//Instance variables/data members:
//int n - to store number value
//int x - to store value 0
//int store - to store the value of int n
import java.util.Scanner;
public class PalendromeNo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Palindrome No: ");//To take number input
        int n=sc.nextInt();
        int x=0;
        int store=x;
        while(n>0)//to check conditions for being a palendrome number
        {
            int d=n%10;
            x=x*10+d;
            n=n/10;
        }
        if(x==store)//to print a message after checking conditions
        System.out.println("The number is a Palendrome Number");
        else
        System.out.println("The number is not a Palendrome Number");
    }
}