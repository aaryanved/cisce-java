import java.util.*;
public class asclenSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        s=s.toLowerCase();
        Scanner in=new Scanner(s);
        int k=0;
        while(in.hasNext())
        {
            in.next();
            k++;
        }
        Scanner in1=new Scanner(s);
        String a[]=new String[k];
        k=0;
        while(in1.hasNext())
        {
            a[k]=in1.next();
            k++;
        }
        int al=a.length;
        System.out.println("Original Sentence: ");
        for(int i=0;i<al;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<=al;i++)
        {
            for(int j=i+1;j<al;j++)
            {
                if(a[i].length()>a[j].length())
                {
                    String t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
                if(a[i].length()==a[j].length())
                {
                    if(a[i].compareTo(a[j])>0)
                    {
                        String t=a[i];
                        a[i]=a[j];
                        a[j]=t;
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("Sorted Sentence: ");
        for(int i=0;i<al;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}