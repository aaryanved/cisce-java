//Define a class called DigitSep with the following description:
//Instance variables/data members:
//int x - to store number value
//int y - to store value 0
//int z - to calcualte x%10
import java.util.Scanner;
public class DigitSep
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int x=sc.nextInt();
        int y=0;
        while(x>0)//Entry Control Loop. while loop checks condition while entering
        {
            int z=x%10;
            y+=z;
            x=x/10;
        }
        System.out.println("The sum of all digits of that number is" + y);
    }
}