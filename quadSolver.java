import java.util.*;
public class quadSolver
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Quadratic Form: ");
        System.out.println("Ax^2 + Bx + C");
        System.out.println("");
        System.out.println("Enter A: ");
        double a=sc.nextDouble();
        System.out.println("Enter B: ");
        double b=sc.nextDouble();
        System.out.println("Enter C: ");
        double c=sc.nextDouble();
        double b2=b*b;
        System.out.println("");
        System.out.println("Your Equation is: ");
        System.out.println((int)a+"x^2 + " +(int)b+"x + "+ (int)c +" = 0");
        System.out.println("");
        double d=b2-(4*a*c);
        double x1=0,x2=0,t=0,t1=0,i=0;
        String xi1="",xi2="";
        if(d>0)//Real
        {
            t=-b + Math.sqrt(d);
            x1=t/2*a;
            t1=-b - Math.sqrt(d);
            x2=t1/2*a;
            System.out.println("Roots of the Equation are: ");
            System.out.println("X1: "+x1+"\n"+"X2: "+x2);
        }
        else//Imaginary
        {
            i=Math.sqrt(d*-1);
            i=i/2*a;
            t=-b/2*a;
            i=(int)(i*100);
            i=i/100;
            //i=Math.round(i*100)/100;
            System.out.println("Roots of the Equation are: ");
            if(i==0.0)
            {
                System.out.print("X1 and X2: "+ -b);
            }
            else
            {
                System.out.print("X1: "+t);
                System.out.println(" + "+"i"+i);
                System.out.print("X2: "+t);
                System.out.println(" - "+"i"+i);
            }
        }
    }
}