//Define a class called PatternStar with the following description:
//Instance variables/data members:
//int rc - to store value of 5
//int max - To store value of 1
//int i
//int j
public class PatternStar
{
    public static void main()
    {
        int rc=5,i,j,max=1;
        for(i=1;i<=rc;i++)//LOOP 1
        {
            for(j=1;j<=max;j++)//LOOP 2
            {
                System.out.print("*");
            }
            System.out.println();
            max++;
        }
    }
}