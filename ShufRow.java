package XII.BoardPracticalPractice;

import java.util.*;
public class ShufRow
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
        int f[]=new int[n];
        for(int i=0;i<n;i++)
        {
            f[i]=a[0][i];
        }
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i>=0 && i<m-1)
                {
                    a[i][j]=a[i+1][j];
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            a[m-1][i]=f[i];
        }
        System.out.println("New Matrix: ");
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