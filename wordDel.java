package XII;
import java.util.*;
public class wordDel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s1=sc.nextLine();
        System.out.println("Enter a Word to Delete: ");
        String w=sc.nextLine();
        System.out.println("Enter Index of Word: ");
        int p=sc.nextInt();
        Scanner in=new Scanner(s1);
        int l=0,k=0;
        while(in.hasNext())
        {
            l++;
            in.next();
        }
        Scanner out=new Scanner(s1);
        String s[]=new String[l];
        while(out.hasNext())
        {
            s[k]=out.next();
            k++;
        }
        int q=s[l-1].length();
        if(Character.isLetter(s[l-1].charAt(q-1))==false)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            if(w.equalsIgnoreCase(s[p-1]))
            {
                System.out.println("New Sentece: ");
                for(int i=0;i<l;i++)
                {
                    if(i!=p-1)
                    {
                        System.out.print(s[i]+" ");
                    }
                }
            }
            else
            {
                System.out.println("Word is Not Present");
                System.exit(0);
            }
        }
    }
}