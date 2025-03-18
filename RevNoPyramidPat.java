//Define a class called RevNoPyramidPat with the following description:
//Instance variables/data members:
//int i
//int j
public class RevNoPyramidPat
{
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println(); // Prints newline so that each row starts on a new line
        }
    }
}