import java.util.*;
public class magiSq
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println("HAPPY BIRTHDAY AARYAN!!");
        System.out.println("Given Matrix");
        int a[][]={{2,7,6},{9,5,1},{4,3,8}};
        int sumr=0, sumc=0, sumd=0,temp=0, flag=0;
        System.out.println("Array:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sumr=+a[i][j];
                sumc=+a[j][i];
            }
        }
        for(int i=0;i<3;i++)
        {
            sumd=+a[i][i];
        }
        if(sumd==sumc && sumc==sumr)
        {
            System.out.println("It is a Magic Square");
        }
        else
        {
            System.out.println("It is not a Magic Square");
        }
    }
}