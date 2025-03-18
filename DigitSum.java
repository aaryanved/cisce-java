//Define a class called DigitSum with the following description:
//Instance variables/data members:
//int x - to store number value
//int y - to store value 0
import java.util.Scanner;
public class DigitSum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");//To take number input
        int x=sc.nextInt();
        int y=0;
        do//Exit Control Loop, do loop checks condition while exiting
        {
            int z=x%10;
            y+=z;
            x=x/10;
        }
        while(y>0);
        System.out.println("The sum of all digits of that number is" + y);
    }
}