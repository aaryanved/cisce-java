import java.util.*;
public class CopyOfBoundSortDDA
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Square Matrix: ");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter Elements: ");
        for(int i=0; i<n;i++)
        {
            for(int j=0; j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }System.out.println();
        System.out.println("Original Matrix: ");
        for(int i=0; i<n;i++)
        {
            for(int j=0; j<n;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }System.out.println();
        int u=(n*2)+((n-2)*2);
        int b[]=new int[u];
        int k=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==n-1||i==0||j==n-1||j==0)
                {
                    int m=k++;
                    b[m]=a[i][j];
                }
            }
        }
        System.out.println("Original Boundary: ");
        for(int i=0; i<u;i++)
        {
            System.out.print(b[i] + " ");
        }
        System.out.println();System.out.println();
        for(int i=0; i<u;i++)
        {
            for(int j=i+1; j<u;j++)
            {
                if(b[i]>b[j])
                {
                    int t=b[i];
                    b[i]=b[j];
                    b[j]=t;
                }
            }
        }
        System.out.println("Sorted Boundary: ");
        for(int i=0; i<u;i++)
        {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        System.out.println();
        k=0;
        int r1=0, r2=n-1, c1=0, c2=n-1;
        for(int i=r1; i<=r2; i++)
        {
            a[r1][i]=b[k++];
        }
        for(int i=c1+1; i<=c2; i++)
        {
            a[i][c2]=b[k++];
        }
        for(int i=r2-1; i>=r1; i--)
        {
            a[r2][i]=b[k++];
        }
        for(int i=c2-1; i>=c1+1; i--)
        {
            a[i][c1]=b[k++];
        }
        r1++; r2--; c1++; c2--;
        System.out.println("Sorted Matrix: ");
        for(int i=0; i<n;i++)
        {
            for(int j=0; j<n;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
