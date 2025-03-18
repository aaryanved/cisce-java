package XII;

import java.util.*;
public class removeSpace
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String s=sc.nextLine();
        s=s.replaceAll("\\s+"," ");
        System.out.println("\nSentence with Extra Spaces Removed is: ");
        System.out.println(s);
    }
}
