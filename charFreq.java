//frequency of each and every character in string including spaces
import java.util.*;
public class charFreq
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=in.nextLine();
        int i=0,count=0,counts=0;
        int l=s.length();
        char ch=' ',c=' ';
        s=s.toLowerCase();
        for(c='a'; c<='z'; c++)
        {
            for(i=0;i<l;i++)
            {
                ch=s.charAt(i);
                if(ch==c)
                {
                    count++;
                }
                else if(ch==' ')
                {
                    counts++;
                }
            }
            if(count>0)
            {
                System.out.println(c+" appears " + count + " times.");
            }
            count=0;
        }
        System.out.println("Spaces appear " + (counts/26)+ " times.");
    }
}
