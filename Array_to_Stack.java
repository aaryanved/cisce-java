

import java.util.*;
public class Array_to_Stack
{
    int m[],st[],cap,top;
    Array_to_Stack(int n)
    {
        cap=n;
        top=-1;
    }
    void input_marks()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks: ");
        for(int i=0;i<cap;i++)
        {
            m[i]=sc.nextInt();
        }
    }
    void pushmarks(int v)
    {
        
    }
}