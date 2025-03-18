import java.util.*;
class DDABoundarySum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrix Size");
        int n=sc.nextInt();
        int a[][] = new int[n][n];
        int sum=0;
        System.out.println("Enter elements of DDA");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            a[i][j] = sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        //sum of boundary elements
        int u=(n*2)+((n-2)*2);
        int b[]=new int[u];
        int k=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==n-1||i==0||j==n-1||j==0)
                {
                    sum = sum + a[i][j];
                    int m=k++;
                    b[m]=a[i][j];
                }
            }
        }
        for(int i=0; i<u; i++)
        {
            for(int j=i+1; j<u; j++)
            {
                if(b[i]>b[j])
                {
                    int t=b[i];
                    b[i]=b[j];
                    b[j]=t;
                }
            }
        }
        System.out.print("Sorted Bound");
        for(int i=0; i<u; i++)
        {
            System.out.println(b[i] + " ");
        }
        System.out.print("Sum: "+sum);
    }
}