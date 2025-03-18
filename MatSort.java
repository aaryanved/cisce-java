package XII;

import java.util.*;
public class MatSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Matrix (Row then Coulmn): ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter input in Matrix: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        int l=m*n;
        int as[]=new int[l];
        int k=0;
        while(k<l)
        {
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    as[k]=a[i][j];
                    k++;
                }
            }
        }
        /*for(int j=0;j<l;j++)
        {
        System.out.print(as[j]+" ");
        }*/
        for(int i=0;i<=l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(as[i]>as[j])
                {
                    int t=as[i];
                    as[i]=as[j];
                    as[j]=t;
                }
            }
        }
        k=0;
        while(k<l)
        {
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j]=as[k];
                    k++;
                }
            }
        }
        System.out.println("");
        System.out.println("Sorted Matrix: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}