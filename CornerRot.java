
import java.util.*;
public class CornerRot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows and coulmns");
        int m=sc.nextInt();
        int a[][]=new int[m][m];
        if(m<2||m>10)
        {
            System.out.println("Not in Range");
        }
        else
        {
            System.out.println("Enter elements in Array: ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Original Array: ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(a[i][j]+" ");;
                }
                System.out.println();
            }
            int tl=a[0][0];
            int tr=a[0][m-1];
            int bl=a[m-1][0];
            int br=a[m-1][m-1];
            
            a[0][0]=bl;
            a[0][m-1]=tl;
            a[m-1][m-1]=tr;
            a[m-1][0]=br;
            
            int sum = tl+tr+bl+br;
            
            System.out.println("Resultant Array: ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(a[i][j]+" ");;
                }
                System.out.println();
            }
            
            System.out.println("Sum: " +sum);
        }
    }
}