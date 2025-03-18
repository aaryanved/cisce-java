import java.util.*;
public class replRepeat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.nextLine();
        s=s+" ";
        s=s.toLowerCase();
        String s3="";
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                continue;
            }
            else
            {
                s3=s3+s.charAt(i);
            }
        }
        System.out.println(s3);
    }
}