import java.util.*;
public class ArrayMax
{
    int m;
    int arr[][];
    ArrayMax(int mm)
    {
        m=mm;
        arr= new int[m][m];
    }

    void readarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Elements: ");
        for(int i=0; i<m;i++)
        {
            for(int j=0; j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }

    void large()
    {
        int max=0, i, j;
        for(i=0; i<m;i++)
        {
            max=arr[i][0];
            for(j=0; j<m;j++)
            {
                if(max<arr[i][j])
                {
                    max=arr[i][j];
                }
            }
            System.out.println("Largest Element in row "+ (i+1) + " is " + max);
        }
    }

    void display()
    {
        System.out.println("Array");
        for(int i=0; i<m;i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Range: ");
        int c=sc.nextInt();
        ArrayMax ob=new ArrayMax(c);
        ob.readarray();
        ob.large();
        ob.display();
    }
}