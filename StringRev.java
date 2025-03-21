import java.util.*;
public class StringRev 
{
    String mystr, newstr;
    StringRev(String s)
    {
        mystr = s;
        newstr = "";
    }
    String myRev(String w)
    {
        if (w.isEmpty()) {
            return w;
        }
        return myRev(w.substring(1)) + w.charAt(0);
    }
    void reverseStr(int n)
    {
        Scanner in = new Scanner(mystr);
        while(in.hasNext())
        {
            String w = in.next();
            if(w.length()>n)
            {
                newstr += myRev(w) + " ";
            }
            else
            {
                newstr += w + " ";
            }
        }
    }
    void print()
    {
        System.out.println("Original String: " + mystr);
        System.out.println("New String: " + newstr);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.println("Enter a number");
        int n = sc.nextInt();
        StringRev obj = new StringRev(s);
        obj.reverseStr(n);
        obj.print();
    }
}
