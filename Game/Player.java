
import java.util.*;

public class Player
{
    private int cash;
    private ArrayList<Card> pHand;

    public Player(){
        cash = 800;
        pHand = new ArrayList<Card>();
    }

    public void addCard(Card card){
        pHand.add(card);
    }

    public int getValue(){
        int total = 0;
        int ace = 0;
        for(int i = 0; i < pHand.size(); i++){
            if(!pHand.get(i).getAce()){
                total += pHand.get(i).getValue();
                ace += 1;
            }
        }
        if(total < 11 && ace == 1){
            total += 10;
        }
        return total;
    }

    public void recieve(Card card){
        pHand.add(card);
    }
}