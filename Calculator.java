//Define a class called AutomorphicNo withe the following description:
//Instance variables/data members:
//double d1 - to store 1st number value
//double d2 - to store 2nd number value
//char ch - to store arethemetic symbol
//double result - to store result number value
import java.util.*;
class Calculator
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numeric values");
        double d1=sc.nextDouble();
        double d2=sc.nextDouble();
        System.out.println("Enter +,-,* or /");
        char ch=sc.next().charAt(0);
        double result=0.0;
        if(ch=='+')
        {
         result=d1+d2;//addition
        }
else if(ch=='-')
{
if(d1>d2)
{
result=d1-d2;//subtraction
}
else{
result=d2-d1;
}
}
else if(ch=='*')
{
result=d1*d2;//multiplication
}
else
{
result=d1/d2;//division
}
System.out.println("The ans is "+ result);
}
}   