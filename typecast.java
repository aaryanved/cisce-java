import java.util.Scanner;
public class typecast
{
    public static void main(String args[])
    {
        char a;
        for(a='A'; a<='Z'; a=(char)(a+22))
        {
            System.out.println(a);
        }
    }
}