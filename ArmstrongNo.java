//Define a class called ArmstrongNo with the following description:
//Instance variables/data members:
//int x - to store number value
//int y - to store value 0
//int n - to store the value of int x
import java.util.Scanner;
public class ArmstrongNo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int x=sc.nextInt();
        int n=x;
        int y=0;
        while(x>0)
        {
            int z =x%10;
            y+=(int)Math.pow(z,3);
            x=x/10;
        }  
        if(y==n)
        {
            System.out.println("The number is an Armstrong Number");
        }
        else
        {
            System.out.println("The number is not an Armstrong Number");
        }
    }
}