import java.util.*;
public class randomcard {
public static void main(String[] args){
    for(;;){
    Scanner input = new Scanner(System.in);
    int cards[] = {2,3,4,5,6,7,8,9,10};
    String card[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
    String suit[] = {"Ace","King","Queen","Jack"};
    Random random = new Random();
    System.out.println(cards[random.nextInt(cards.length)] +" "+"of"+" "+card[random.nextInt(card.length)]);
    int n=input.nextInt();
    if(n==1)
    {
        break;
    }
    else
    {
        continue;
    }
}
}
}