import java.util.*;
public class SwitchCasePattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for BLUEJ");
        System.out.println("Enter 2 for BLUEJ Reverse");
        System.out.println("Enter 3 for Number");
        System.out.println("Enter 4 for George Floyd Triangle");
        System.out.println("Enter 5 for Goofy Ahh Character Pattern");
        int s=sc.nextInt();
        String b="bluej";
        String n="12345";
        int l=b.length();
        switch(s)
        {
            case 1:
                for(int i=0;i<=l;i++)
                {
                    if(i%2==0)
                    {
                        System.out.println((b.substring(0,i)).toUpperCase());
                    }
                    else{
                        System.out.println(b.substring(0,i));
                    }
                    
                }
                break;
            case 2:
                for(int i=l;i>=0;i--)
                {
                    System.out.println(b.substring(0,i));
                }
                break;
            case 3:
                for(int i=0;i<=l;i++)
                {
                    System.out.println(n.substring(0,i));
                }
                break;
            case 4:
                int c=1;
                for(int i=1;i<=5;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(c + " ");
                        c++;
                    }
                    System.out.println();
                }
                break;
                case 5:
                    int y=5;
                    char q='A';
                    char m='A';
                    for(int i=1;i<=y;i++)
                    {
                        if(i%2==0)
                        {
                            q='0';
                        }
                        else
                        {
                            q=m++;
                        }
                        for(int j=1;j<=i;j++)
                        {
                            System.out.print(q + " ");
                        }
                        System.out.println();
                    }
                    
            default:
                System.out.println("Not Valid Case");
                break;
        }
    }
}