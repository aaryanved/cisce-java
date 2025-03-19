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
        int n[]=new int[c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                n[j]=a[i][j];
            }
        }
        for(int i=0;i<c-1;i++)
        {
            for(int j=0;j<c-1;j++)
            {
                if(n[i]>n[j+1])
                {
                    int t=n[i];
                    n[i]=n[j+1];
                    n[j+1]=t;
                }
            }
        }
        for(int i=0;i<c;i++)
        {
            System.out.print(n[i]+" ");
        }
    }
}