import java.util.*;
public class MyStr 
{
    String str;
    String arr[];
    int size;
    MyStr(String s)
    {
        str =s;
        size=0;
    } 
    int count(String s)
    {
        int l=0;
        s=s+" ";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                l++;
            }
        }
        return l;
    }
    void setArr()
    {
        size=count(str);
        arr=new String[size];
    }
    void transfer()
    {
        Scanner in=new Scanner(str);
        int k=0;
        while(in.hasNext())
        {
            arr[k]=in.next();
            k++;
        }
        in.close();
    }
    
    String encode(String w)
    {
     
        if (w.isEmpty()) 
        {
            return "";
        }
        char firstChar = w.charAt(0);
        char encodedChar;
        if (Character.isUpperCase(firstChar)) 
        {
            encodedChar = (char) ((firstChar - 'A' + 1) % 26 + 'A');
        }
         else if (Character.isLowerCase(firstChar)) 
        {
            encodedChar = (char) ((firstChar - 'a' - 1 + 26) % 26 + 'a');
        } 
        else 
        {
            encodedChar = '$';
        }
        return encodedChar + encode(w.substring(1));
    }

    void fillArray() 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = encode(arr[i]);
        }
    }

    void print() 
    {
        System.out.println("Original sentence: " + str);
        System.out.println("Encoded words in array:");
        for (String word : arr) 
        {
            System.out.println(word);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        MyStr myStr = new MyStr(s);
        myStr.setArr();
        myStr.transfer();
        myStr.fillArray();
        myStr.print();
    }
    
}

