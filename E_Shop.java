import java.util.Scanner;
//Define a class called E_Shop with the following description:
//Instance variables/data members:
//String n - to store Name
//String a - to store address
//double amount,discount - to store the value 0.0
//String s - to store type of purchase
public class E_Shop
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter name,address,amount and type of purchase");
       String n=sc.nextLine();
       String a=sc.next();
       double amount=0.0,discount=0.0;
       amount=sc.nextDouble();
       String s=sc.next();
       //char ch=sc.next().charAt(0);
       if(s.equalsIgnoreCase("L"))
       {
           if(amount>=0 && amount<=25000)
           {
               System.out.println("No discount");
               discount=0.0;
            }
            else if(amount>=25001 && amount<=57000)
            {
                discount=5.0/100*amount;
            }
            else if(amount>=57001 && amount<=100000)
            {
                discount=7.5/100*amount;
            }
            else
            {
                discount=10.0/100*amount;
            }
               
        }
        else if(s.equalsIgnoreCase("D"))
        {
           if(amount>=0 && amount<=25000)
           {
               discount=5.0/100*amount;
            }
            else if(amount>=25001 && amount<=57000)
            {
                discount=7.6/100*amount;
            }
            else if(amount>=57001 && amount<=100000)
            {
                discount=10.0/100*amount;
            }
            else
            {
                discount=15.0/100*amount;
            } 
        }
        else{
            System.out.println("Invalid Choice");
            System.exit(0);
        }
        amount=amount-discount;
        System.out.println(n+"\t"+a+"\t"+amount);
    }
}