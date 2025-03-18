import java.util.*;
public class Binary_Search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int flag=0;
        int t=0;
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<=9;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Sorted Array into Ascending Order");
        for(int j=0;j<=9-1;j++)
        {
            for(int r=1; r<=9-j-1; r++)
            if(a[r]>a[r+1])
            {
                t=a[r];
                a[r]=a[r+1];
                a[r+1]=t;
            }
        }
        for(int q=0;q<=9;q++)
        {
            System.out.print(a[q] + " ");
        }
        System.out.println();
        System.out.println("Enter Element to be Searched: ");
        int n=sc.nextInt();
        int l=0;
        int u=9;
        while(l<=u)
        {
            int mid=(l+u)/2;
            if(a[mid]>n)
            {
                u=mid-1;
            }
            if(a[mid]<n)
            {
                l=mid+1;
            }
            if(a[mid]==n)
            {
                flag=1;
            }
            break;
        }
        if(flag==1)
        {
            System.out.println("Element is Present in Array");
            
        }
        else
        {
            System.out.println("Element is not Present in Array");
        }
    }
}
/*
import java.util.*;
public class Binary_Search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int flag=0;
        int t=0;
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<=9;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Sorted Array into Ascending Order");
        for(int j=0;j<9;j++)
        {
            for(int r=1; r<9; r++)
            if(a[r]>a[r+1])
            {
                t=a[r];
                a[r]=a[r+1];
                a[r+1]=t;
            }
        }
        for(int q=0;q<=9;q++)
        {
            System.out.print(a[q] + " ");
        }
        System.out.println();
        System.out.println("Enter Element to be Searched: ");
        int n=sc.nextInt();
        int l=0;
        int u=9;
        while(l<=u)
        {
            int mid=(l+u)/2;
            if(a[mid]>n)
            {
                u=mid-1;
            }
            if(a[mid]<n)
            {
                l=mid+1;
            }
            if(a[mid]==n)
            {
                flag=1;
            }
            break;
        }
        if(flag==1)
        {
            System.out.println("Element is Present in Array");
            
        }
        else
        {
            System.out.println("Element is not Present in Array");
        }
        
    }
}
*/