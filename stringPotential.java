//Potential in Acending Order
import java.util.*;
public class stringPotential
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=in.nextLine();
        Scanner sc=new Scanner(s);
        int n=0,p=0,sum=0,k=0,l=0;
        //char ch=' ';
        String ts="",x="";
        int p1[]=new int[10];
        String s1[]=new String[10];
        while(sc.hasNext())
        {
            s1[k]=sc.next();
            k++;
        }
        System.out.println("Original String: ");
        for(int i=0;i<k;i++)
        {
            System.out.print(s1[i] + " ");
        }
        for(int i=0;i<k;i++)
        {
            l=s1[i].length();
            l=l-1;
            for(int j=0;j<l;j++)
            {
                //ch=s1[i].charAt(j);
                sum=sum+(int)s1[i].charAt(j);
            }
            p1[i]=sum;
            sum=0;
        }
        for(int i=0;i<k;i++)
        {
            for(int j=i+1;j<k;j++)
            {
                if(p1[i]>p1[j])
                {
                    ts=s1[i];
                    s1[i]=s1[j];
                    s1[j]=ts;
                }
            }
        }
        System.out.println();
        System.out.println("New String: ");
        for(int i=0;i<k;i++)
        {
            System.out.print(s1[i] + " ");
        }
    }
}