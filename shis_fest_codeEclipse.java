import java.util.Scanner;
public class shis_fest_codeEclipse
{
    public static void main(String args[])
    {
        char ch;
        int x=97;
        do
        {
            ch=(char)x;
            System.out.print(ch+"");
            if(x%10==0)
            break;
            ++x;
        }
        while(x<=100);
}
}