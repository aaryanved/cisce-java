package XII;

import java.util.*;
public class palin extends revr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int nu=sc.nextInt();
        palin ob=new palin();
        int ni=ob.rev(nu);
        if(nu==ni)
        {
            System.out.println("It is Palindrome");
        }
        else
        {
            System.out.println("It is not Palindrome");
        }
    }
}