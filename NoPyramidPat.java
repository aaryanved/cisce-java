//Define a class called NoPyramidPat with the following description:
//Instance variables/data members:
//int i 
//int j 
public class NoPyramidPat
{
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(); // Prints newline so that each row starts on a new line
        }
    }
}