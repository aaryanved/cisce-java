//Aaryan Ved Bhalla, XI-A, Spiral DDA Natural Number
import java.util.*;
public class spiralDDA
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int r1=0, r2=n-1, c1=0, c2=n-1, k=1;
        while(k<=(n*n))
        {
            for(int i=r1; i<=r2; i++)
            {
                a[r1][i]=k++;
            }
            for(int i=c1+1; i<=c2; i++)
            {
                a[i][c2]=k++;
            }
            for(int i=r2-1; i>=r1; i--)
            {
                a[r2][i]=k++;
            }
            for(int i=c2-1; i>=c1+1; i--)
            {
                a[i][c1]=k++;
            }
            r1++; r2--; c1++; c2--;
        }
        System.out.println("Final Array: ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }  
}
