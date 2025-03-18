import java.util.*;
public class Evil
{
    int conv(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return n%2 + (conv(n/2)*10);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No: ");
        int x=sc.nextInt();
        Evil ob=new Evil();
        int y=0;
        y=ob.conv(x);
        String s= Integer.toString(y);
        int l=s.length();
        int count = 0;
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)=='1')
            {
                count++;
            }
        }
        if(count%2==0)
        {
            System.out.println("Number is Evil");
        }
        else
        {
            System.out.println("Number is not Evil");
        }
    }
}