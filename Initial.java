import java.util.*;
public class Initial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        System.out.println("Enter your full name: ");
        s=sc.nextLine();
        s=" "+s;
        int l=s.length();
        char ch;
        String s1="";//Last Name
        String s2="";
        int index=s.lastIndexOf(' ');//_Aaryan_Ved_        s1={Bhalla}
        s1=s.substring(index);
        for(int i=0;i<index;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                s2=s2+" "+s.charAt(i+1)+".";//1st Iteration > s2= A.    &&   7th Iteration> s2=A.V.
            }
        }
        String finalS=s2+s1;
        System.out.println(finalS);
    }
}