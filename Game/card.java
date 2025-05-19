public class Card
{
    private int value;
    private boolean isAce;
    
    public Card(int value, boolean isAce){
        this.value = value;
        this.isAce = isAce;
    }

    public int getValue(){
        return value;
    }

    public boolean getAce(){
        return isAce;
    }
}

class Number extends Card{

    public Number(int value){
        super(value, false);
    }
}

class Face extends Card {

    public Face(){
        super(10, false);
    }
}

class Ace extends Card {

    public Ace(){
        super(1, true);
    }
}