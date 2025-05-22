import java.util.*;

public class House
{
    private ArrayList<Card> houseHand;

    public House(){
        houseHand = new ArrayList<Card>();
    }

    public void recieve(Card card){
        houseHand.add(card);
    }
}