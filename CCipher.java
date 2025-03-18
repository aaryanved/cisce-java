import java.util.*;
public class CCipher
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String s=sc.nextLine();
        System.out.println("Input: " + s);
        int l=s.length();
        String s1="";
        if(l>3 && l<100)
        {
            for(int i=0;i<l;i++)
            {
                char ch=s.charAt(i);
                int a=(int)ch;
                while(a>96 && a<123)
                {
                    if((a+13)<=122)
                    {
                        s1=s1+(char)(a+13);
                    }
                    else
                    {
                        s1=s1+(char)(a-13);
                    }
                    break;
                }
                while(a>64 && a<91)
                {
                    if((a+13)<=90)
                    {
                        s1=s1+(char)(a+13);
                    }
                    else
                    {
                        s1=s1+(char)(a-13);
                    }
                    break;
                }
                if(Character.isLetter(ch)==false)
                {
                    s1=s1+ch;
                }
            }
            System.out.println("Output: " + s1);
        }
        else
        {
            System.out.println("Invalid Length");
        }
    }
}       