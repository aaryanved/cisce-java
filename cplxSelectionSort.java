//Sort Mobile Numbers and Names
import java.util.*;
public class cplxSelectionSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of People: ");
        int n=sc.nextInt();
        String name[]=new String[n+1];
        long no[]=new long[n];
        System.out.println("Enter Names: ");
        for(int i=0;i<=n;i++)
        {
            name[i]=sc.nextLine();
        }
        System.out.println("Enter Mobile Numbers: ");
        for(int i=0;i<n;i++)
        {
            no[i]=sc.nextLong();
        }
        for(int i=0;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                if(name[i].compareTo(name[j])>0)
                {
                    String t=name[i];
                    long temp=no[i];
                    name[i]=name[j];
                    no[i]=no[j];
                    name[j]=t;
                    no[j]=temp;
                }
            }
        }
        System.out.println("Name: " + "\t" + "Mobile Number: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(name[i] + "\t" + no[i]);
        }
    }
}