package XII;


public class Rectangle extends Shape
{
    int height, width;
    Rectangle(String c, int h, int w)
    {
        super(c);
        height=h;
        width=w;
    }
    void Area()
    {
        int a=height*width;
        System.out.println("Area is: "+a);
    }
    void Perimeter()
    {
        int p=2*(height+width);
        System.out.println("Perimeter is: "+p);
    }
}