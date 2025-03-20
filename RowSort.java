import java.util.*;
public class RowSort
{
        public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Rows and Coulmns: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enter No. in Matrix: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c-1;j++)
            {
                for(int k=0;k<c-1;k++)
                {
                    if(a[i][k]>a[i][k+1])
                    {
                        int t=a[i][k];
                        a[i][k]=a[i][k+1];
                        a[i][k+1]=t;
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("New Matrix: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}