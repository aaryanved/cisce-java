import java.util.*;
public class ascendString
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=in.nextLine();
        s=s.toLowerCase();
        Scanner sc=new Scanner(s);
        String s1[]=new String[10];
        int k=0;
        while(sc.hasNext())
        {
            s1[k]=sc.next();
            k++;
        }
        String s2[]=new String[k];
        for(int i=0;i<k;i++)
        {
            s2[i]=s1[i];
        }
        for(int i=0;i<=k;i++)
        {
            for(int j=i+1;j<k;j++)
            {
                if(s2[i].compareTo(s2[j])>0)
                {
                    String t=s2[i];
                    s2[i]=s2[j];
                    s2[j]=t;
                }
            }
        }
        for(int i=0;i<k;i++)
        {
            System.out.print(s2[i]+ " ");
        }
    }
}