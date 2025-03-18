//Define a class called Menu with the following description:
//Instance variables/data members:
//int choice - to store what u want to calculate
//int num - to store number value
//int k - to store the value of int num
import java.util.Scanner;
class Menu
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        do{
        System.out.println("1. Perfect No\n2.Armstrong no\n3. Prime No");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        System.out.println("Enter number");
        int num=sc.nextInt();
        int k=num;
        switch(choice)
        {
            case 1:
            int sum=0;
            for(int i=1;i<6;i++)
            {
                if(num%i==0)
                    sum=sum+i;
            }
            if(sum==k)
                System.out.println("Perfect No");
            else
                System.out.println(" Not a Perfect No");
            break;
            case 2:
            sum=0;
            while(num>0)
            {
                int d=num%10;
                sum=sum+(int)Math.pow(d,3);
                num=num/10;
            }
            if(sum==k)
                System.out.println("Armstrong No");
            else
                System.out.println(" Not an Armstrong No");
            break;
            case 3:
            int count=0;
            for(int i=1;i<=k;i++)
            {
                if(k%i==0)
                    count++;
            }
            if(count==2)
                System.out.println("Prime No");
            else
                System.out.println(" Not a Prime No");
            break; 
            default:
            System.out.println("Invalid input");
        }
        System.out.println("Do you want to continue Yes/No");
        s=sc.next();
    }
    while(s.equalsIgnoreCase("Yes"));
    }
}