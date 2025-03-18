import java.util.*;
public class powRecur
{
    int n;
    int pow(int b, int i)
    {
        if(i==0)
            return 1;
        else 
            return b*pow(b,i-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number and Power: ");
        int n=sc.nextInt();
        int p=sc.nextInt();
        powRecur ob=new powRecur();
        int ans=ob.pow(n,p);
        System.out.println(n+" to the power "+p+" = " + ans);    
    }
}