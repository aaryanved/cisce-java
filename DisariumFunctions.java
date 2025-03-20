import java.util.*;
public class DisariumFunctions 
{
    int num;
    int count;
    DisariumFunctions(int n) 
    {
        this.num = n;
        this.count = 0;
    }
    int power(int d, int p) 
    {
        return (int) Math.pow(d, p);
    }
    void getCount() 
    {
        int n1 = num;
        while (n1 > 0) 
        {
            count++;
            n1 /= 10;
        }
    }
    void check() 
    {
        getCount();
        int n1 = num;
        int sum = 0;
        for (int i = count; i > 0; i--) 
        {
            int digit = n1 % 10;
            sum += power(digit, i);
            n1 /= 10;
        }
        if (sum == num) {
            System.out.println("Disarium Number");
        } 
            else 
        {
            System.out.println("Not a Disarium Number");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        DisariumFunctions ob = new DisariumFunctions(n);
        ob.check();
    }
}
