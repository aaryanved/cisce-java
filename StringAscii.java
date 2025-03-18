package XII;
import java.util.*;
public class StringAscii
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Word: ");
        String s1=sc.next();
        int l=s1.length();
        char s[]=new char[l];
        int a[]=new int[l];
        for(int i=0;i<l;i++)
        {
            s[i]=s1.charAt(i);
            a[i]=(int)s[i];
        }
        int temp=0;
        char t=' ';
        for(int i=0; i < l; i++)
        {  
            for(int j=1; j < (l-i); j++)
            {  
                if(a[j-1] > a[j])
                {    
                    temp = a[j-1];  
                    t=s[j-1];
                    a[j-1] = a[j];  
                    s[j-1]=s[j];
                    a[j] = temp;
                    s[j]=t;
                }  
            }
        }
        for(int i=0;i<l;i++)
        {
            System.out.println("Ascii Value of '" + s[i] + "' is " + a[i]);
        }
        System.out.println();
        System.out.println("Min Ascii Value is: " +  a[0] + " of character " + s[0]);
        System.out.println("Max Ascii Value is: " +  a[l-1]+ " of character " + s[l-1]);
    }
}
