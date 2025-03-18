//Define a class called NivenNo with the following description:
//Instance variables/data members:
//int x - to store number value
//int y - to store value 0
//int k - to store the value of int x
import java.util.Scanner;
public class NivenNo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int x=sc.nextInt();
        int y=0;
        int k=x;
        while(x>0)
        {
            int z=x%10;
            y+=z;
            x=x/10;
        }
        if(y%k==0)
        System.out.println("It is a Niven Number");
        else
        System.out.println("It is not a Niven Number");
    }
}