import java.util.*;
public class uniqWord
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=in.nextLine();
        s=s.toLowerCase();
        Scanner sc=new Scanner(s);
        String s1[]=new String[10];
        int n=0,l=0,f=0,count=0;
        while(sc.hasNext())
        {
            s1[n]=sc.next();
            n++;
        }
        System.out.println("Total No. of Words: " + n);
        for(int i=0;i<n;i++)
        {
            l=s1[i].length();
            for(int j=0; j<l; j++)
            {
                for(int k=0; k<l; k++)
                {
                    if(s1[i].charAt(j)!=s1[i].charAt(k+1))
                    {
                        f++;
                        break;
                    }
                    else
                    {
                        break;
                    }
                }
                if(f>0)
                {
                    count++;
                    break;
                }
            }
            f=0;
        }
        System.out.println("Total No. of Unique Words: " + count);
    }
}