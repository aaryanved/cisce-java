package XII;

import java.util.*;
public class SkewMat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Matrix (Row then Coulmn): ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        int at[][]=new int[n][m];
        if(m==n)
        {
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
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    at[i][j]=a[j][i];
                }
            }
            System.out.println("Transposed Matrix: ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(at[i][j] + " ");
                }
                System.out.println("");
            }
            int c=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(a[i][j]==at[i][j])
                    {
                        c++;
                    }
                }
            }
            if(c==9)
            {
                System.out.println("It is Symmetric.");
                int rd=0,ld=0;
                for(int i=0;i<m;i++)
                {
                    ld+=a[i][i];
                }
                int q=m,p=0;
                for (int i = 0; i <m; i++) 
                {
                    rd+=a[i][m-1-i];
                }
                System.out.println("Sum of Right Diagonal: " + rd);
                System.out.println("Sum of Left Diagonal: " + ld);
            }
            else
            {
                System.out.println("It is not Symmetric.");
            }
        }
        else
        {
            System.out.println("It is not Symmetric.");
        }
    }
}