package XII;

import java.util.*;
public class TelKey
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Word: ");
        String s=sc.next();
        s=s.toUpperCase();
        int so=0;
        for(int i=0; i<s.length();i++)
        {
            char c=s.charAt(i);
            int co=(int)c-64;
            if(co>3&&co<=6)
                co=co-3;
            else if(co>6&&co<=9)
                co=co-3*2;
            else if(co>9&&co<=12) 
                co=co-3*3;
            else if(co>12&&co<=15)
                co=co-3*4;
            else if(co>15&&co<=18)
                co=co-3*5;
            else if(co>18&&co<=21)
                co=co-3*6;
            else if(co>21&&co<=24)
                co=co-3*7;
            else if(co>24&&co<=27)
                co=co-3*8;
            so=so+co;
        }
        System.out.println("No. of Key Presses Required: " + so);
    }
}