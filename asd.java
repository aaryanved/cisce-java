import java.util.*;
public class asd
{
    public static void main(String args[])
    {
        int s=0, g;
        int n=6579;
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
}