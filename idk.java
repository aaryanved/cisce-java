import java.util.*;
public class idk
{
    void perform(int n)
    {
        int s=0, g;
        while(n>0)
        {
            if(n%2==1)
            {
                n/=10;
                g=n%10;
                System.out.println("\n g = \t" + g);
                s=s+g;
                n=n/5;
            }
            System.out.println("\n s = \t" + s);
        }
    }
    public static void main(String args[])
    {
        idk ob=new idk();
        ob.perform(6759);
    }
}