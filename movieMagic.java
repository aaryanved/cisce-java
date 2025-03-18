//Define a class called movieMagic with the following description:
//Instance variables/data members:
//int year - to store movie release year
//String title - to store name of the movie
//float rating - to store rating of the movie

//Member Methods:
//movieMagic() default constructor to initialise the data members
//void input() to input and year, title and rating
//void display() to display the details
//Write a main method to create an object of the class and call the above methods
import java.util.Scanner;
public class movieMagic
{
    int year;
    String title;
    float rating;
    movieMagic()//Costructor to initialise the instance variables
    {
        int year=0;
        String title="";
        float rating=0;
    }
    void accept()//to input year, title and rating
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Movie release year: ");
        year=sc.nextInt();//storing the year
        System.out.println("Enter Movie Title: ");
        title=sc.next();//storing the title
        System.out.println("Enter Movie Rating: ");
        rating=sc.nextFloat();//storing the rating
    }
    void display()//to diplay the details
    {
        System.out.println("Title: " + title);
        System.out.println("Release Year: " + year);
        System.out.println("Rating: " + rating);
        if(rating>0.0 && rating<=2.0)//to check conditions for the rating 
        {
            System.out.println("Movie is a Flop");
        }
        else if(rating>=2.1 &&  rating <=3.4)
        {
            System.out.println("Movie is a Semi-Hit");
        }
        else if(rating>=3.4 && rating<=4.5)
        {
            System.out.println("Movie is a Hit");
        }
        else if(rating>=4.6 && rating<=5.0)
        {
            System.out.println("Movie is a Super-Hit");
        }
        else if(rating>5.0)
        {
            System.out.println("Max Rating is 5.0");
        }
    }
    public static void main(String args[])
    {
            movieMagic obj=new movieMagic();//creating object of class
    obj.accept();//calling accept
    obj.display();//calling display
}
}