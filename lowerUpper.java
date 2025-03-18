import java.util.*;
public class lowerUpper
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        int l=s.length(), flag=0;
        char lc[]=new char[l];
        char uc[]=new char[l];
        char ch=' ',c=' ', C=' ';
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            for(c='a';c<='z';c++)
            {
                if(ch==c)
                {
                    //flag=1;
                    lc[i]=c;
                }
            }
            for(C='A';C<='Z';C++)
            {
                if(ch==C)
                {
                    //flag=2;
                    uc[i]=C;
                }
            }
            /*if(flag==1)
            {
                System.out.print(c);
            }
            if(flag==2)
            {
                System.out.println(C);
            }*/
        }
        for(int i=0;i<l;i++)
        {
            System.out.print((char)lc[i]);  
            System.out.print((char)uc[i]);  
        }
    }
}