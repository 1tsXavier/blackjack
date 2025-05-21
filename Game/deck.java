public class Deck
{
    private Card[][] deck;
    private ArrayList<Card> discard;

    public Deck()
    {
        
        for(int i = 0;i<4;i++)
        {
            deck.add(new Ace());
            for(int i = 2;i<11;i++)
            {
                deck.add(new Number(i));
            }
            for(int i = 0;i<2;i++)
            {
                deck.add(new Face());
            }

        }

    }
}