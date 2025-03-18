package XII;

import java.util.*;
public class Quadratic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Equation in Form: ");
        System.out.println("Ax^2+Bx+C");
        String e=sc.nextLine();
        int t=e.indexOf("x^2");
        int a=Integer.parseInt(e.substring(0,t));
        t=e.lastIndexOf('x');
        int b=Integer.parseInt(e.substring(t-2,t));
        int l=e.length();
        int c=Integer.parseInt(e.substring(l-2,l));
        //System.out.println(b);
        /*-----------------------------------------------------------------------------------------------------------*/
        int d= (b*b)-(4*a*c);
        double r1,r2,f,f1;
        //System.out.println(d);
        if(d==0)
        {
            r1= (-b)/(2*a);
            r2=r1;
            System.out.println("1st Root is: " + r1 + "\n2nd Root is: " + r2);
        }
        else if(d>0)
        {
            r1= (-b + Math.sqrt(d))/(2*a);
            r2= (-b - Math.sqrt(d))/(2*a);
            System.out.println("1st Root is: " + r1 + "\n2nd Root is: " + r2);
        }
        else if(d<0)
        {
            d=d*(-1);
            f=(-b);
            f1=2*a;
            f=f/f1;
            double n =Math.sqrt(d)/(2*a);
            System.out.print("1st Root is: ");
            System.out.print(f);
            System.out.println(" + " + n + "i");
            System.out.print("2nd Root is: ");
            System.out.print(f);
            System.out.println(" - " + n + "i");
        }
    }
}