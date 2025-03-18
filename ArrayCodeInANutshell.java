import java.util.*;
public class ArrayCodeInANutshell
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Elements in Array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements in the Array:");
        for(int q=0;q<n;q++)
        {
            a[q]=sc.nextInt();
        }
        System.out.println("Original Array");
                for(int y=0;y<n;y++)
                {
                    System.out.print(a[y] + ", ");
                }
                System.out.println("");
        System.out.println("Enter 1 for Ascending" + "\t" + "Enter 2 for Descending" + "\t" + "Enter 3 for Searching(Binary)");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
                for(int i=0;i<n;i++)
                {
                    if(a[i]<a[i+1])
                    {
                        int t=a[i];
                        a[i]=a[i+1];
                        a[i+1]=t;
                    }
                }
                System.out.println("Sorted Array");
                for(int j=0;j<n;j++)
                {
                    System.out.print(a[j]+", ");
                }
                break;
                case 2:
                    for(int i=0;i<n;i++)
                {
                    if(a[i]>a[i+1])
                    {
                        int t=a[i];
                        a[i]=a[i+1];
                        a[i+1]=t;
                    }
                }
                System.out.println("Sorted Array");
                for(int j=0;j<n;j++)
                {
                    System.out.print(a[j]+", ");
                }
                break;
                case 3:
                    for(int i=0;i<n;i++)
                {
                    if(a[i]<a[i+1])
                    {
                        int t=a[i];
                        a[i]=a[i+1];
                        a[i+1]=t;
                    }
                }
                    System.out.println("Enter element to be searched: ");
                    int e=sc.nextInt();
                    int l=0;
                    int u=n-1;
                    int f=0;
                    while(l<=u)
                    {
                        int m=(l+u)/2;
                        if(a[m]==e)
                        {
                            f=1;
                            break;
                        }
                        else if(a[m]>n)
                        {
                            u=m-1;
                        }
                        else if(a[m]<e)
                        {
                            l=m+1;
                        }
                        if(f==1)
                        {
                            System.out.println("Search is Succesful "+"\t"+"Position of element is: " + m);
                        }
                        else
                        {
                            System.out.println("Search is Unsuccesful "+"\t"+"Element is Not Present");
                        }
                    }
                    default:
                        System.out.println("Pick a Correct Option ");
        }
    }
}