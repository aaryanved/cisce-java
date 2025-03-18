import java.util.*;
class function_bookfair
{
    String Bname;  //Initializing instance variables 
    double price;
    void input()   //Initializing method to take input from the user 
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the name of the book");
        Bname=Sc.next();
        System.out.println("Enter the price of the book");
        price=Sc.nextDouble();
    }
    void calculate()  //Initializing method to calculate discounted price of the book
    {
        if(price<=1000)
        {
            price = price-((2.0/100)*price);
        }
        else if(price>1000 && price<=3000)
        {
            price = price-((10.0/100)*price);
        }
        else
        {
            price = price-((15.0/100)*price);
        }
    }
    void display()   //Initializing method to display name of the book and the discounted price
    {
        System.out.print(Bname+" "+price);
        System.out.println();
    }
    public static void main(String args[])  //Main method
    {
        function_bookfair fb= new function_bookfair();
        fb.input();
        fb.calculate();
        fb.display();
    }
}