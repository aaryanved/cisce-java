

import java.util.*;
public class d2h    
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        char h[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String a="";
        int rem=0;
        while(n>0)
        {
            rem=n%16;
            a=h[rem]+a;
            n=n/16;
        }
        System.out.println("Hexa Decimal No is : " + a);
    }
}