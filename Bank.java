import java.util.*;
public class Bank
{
    String name;
    long accno;
    String acct;
    double bal=10000.0;//LETS ASSUME
    String t1="Savings";
    String t2="Current";
    String depwith;
    double dep;
    double with;
    Bank()
    {
        name="";
        accno=0;
        acct="";
        dep=0.0;
        with=0.0;
        depwith="";
    }
    void input_bank()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name: ");
        name=sc.next();
        System.out.println("Enter Acc. No.: ");
        accno=sc.nextLong();
        System.out.println("Deposit or Withdrawal");
        depwith=sc.next();
        System.out.println("Enter Acc Type: ");
        acct=sc.next();
        if(depwith.equalsIgnoreCase("Deposit"))
        {
            System.out.println("Enter Deposit Amt.: ");
            dep=sc.nextDouble();
        }
        else if(depwith.equalsIgnoreCase("Withdrawal"))
        {
            System.out.println("Enter Withdrawal Amt.: ");
            with=sc.nextDouble();
        }
    }
    void depwith_bank()
    {
        if(depwith.equalsIgnoreCase("Deposit"))
        {
            bal+=dep;
        }
        else if(depwith.equalsIgnoreCase("Withdrawal"))
        {
            bal-=with;
        }
    }
    void display_bank()
    {
        System.out.println("Name: " + name);
        System.out.println("Acc. No.: " + accno);
        System.out.println("Acc Type.: " + acct);
        System.out.println("Current Balance: " + bal);
    }
    public static void main(String args[])
    {
        Bank obj=new Bank();
        obj.input_bank();
        obj.depwith_bank();
        obj.display_bank();
    }
}