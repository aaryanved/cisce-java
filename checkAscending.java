//Write a program to check wether the numbers existing in the array are in ascending order or not.
import java.util.*;
public class checkAscending
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements: ");
        int i=0;
        int flag=0;
        for(i=0; i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0; i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                flag=1;
                break;
            }
            else
            {
                flag=0;
            }
        }
        if(flag==1)
            {
                System.out.println("It is not in Ascending Order");
            }
            else
            {
                System.out.println("It is in Ascending Order");
            }
    }
}