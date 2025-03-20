import java.util.*;
public class MyString 
{
    String mystr;
    MyString(String s)
    {
        mystr = s;
    }
    boolean checkWord(String w)
    {
        int l=w.length();
        if(Character.isUpperCase(w.charAt(0)) || Character.isUpperCase(w.charAt(l-1)))
        //if((w.charAt(0)>=65 && w.charAt(0)<=90) || (w.charAt(l-1)>=65 && w.charAt(l-1)<=90))      <--- Another way to check
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    String remove(String w)
    {
        int l=w.length();
        if(l<3)
        {
            return "";
        }
        else
        {
            return w.substring(0, 1) + w.substring(l-1, l);
        }
        
    }
    void generate()
    {
        Scanner in = new Scanner(mystr);
        while(in.hasNext())
        {
            String w = in.next();
            if(checkWord(w))
            {
                System.out.print(remove(w) + " ");
            }
            else
            {
                System.out.print("? ");
            }
        }
        in.close();
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        MyString obj = new MyString(s);
        obj.generate();
    }
}
   