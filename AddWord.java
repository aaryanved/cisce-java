import java.util.*;
public class AddWord
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s1=sc.nextLine();
        Scanner in=new Scanner(s1);
        int k=0;
        while(in.hasNext())
        {
            k++;
            in.next();
        }
        Scanner po=new Scanner(s1);
        String s[]=new String[k];
        int o=0;
        while(po.hasNext())
        {
            s[o]=po.next();
            o++;
        }
        System.out.println("Enter Word to be added: ");
        String w=sc.next();
        System.out.println("Word position: ");
        int p=sc.nextInt();
        p=p-2;
        System.out.println("Final Sentence:");
        for(int i=0;i<s.length;i++)
        {
            System.out.print(s[i] +" ");
            if(i==p)
            {
                System.out.print(w +" ");
                continue;
            }
        }
    }
}