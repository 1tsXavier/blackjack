import java.util.*;

public class Deck
{
    private ArrayList<Card> deck;
    private ArrayList<Card> discard;

    public Deck()
    {    
        for(int i = 0;i<4;i++)
        {
            deck.add(new Ace());
            for(int k = 2;k<11;k++)
            {
                deck.add(new Number(k));
            }
            for(int j = 0;j<3;j++)
            {
                deck.add(new Face());
            }

        }
    }

    public Card draw()
    {
        int rand = (int) (Math.random() * deck.size() + 1);
        return deck.remove(rand);
    }  
}