//Deck class - R. T.
import java.util.Random;
import java.util.ArrayList;

public class Deck {
	//Deck is an array list
	private ArrayList<Card> cards;

    Deck(){
        //Deck constructor 
    	cards = new ArrayList<Card>();
    	
    	//Creates the deck of cards
        cards.add(new Card(0, "Guard", 1, "Guess a player's hand."));
        cards.add(new Card(1, "Guard", 1, "Guess a player's hand."));
        cards.add(new Card(2, "Guard", 1, "Guess a player's hand."));
        cards.add(new Card(3, "Guard", 1, "Guess a player's hand."));
        cards.add(new Card(4, "Guard", 1, "Guess a player's hand."));
        cards.add(new Card(5, "Priest", 2, "Look at a hand."));
        cards.add(new Card(6, "Priest", 2, "Look at a hand."));
        cards.add(new Card(7, "Baron", 3, "Compare Hands; lower hand is out."));
        cards.add(new Card(8, "Baron", 3, "Compare Hands; lower hand is out."));
        cards.add(new Card(9, "Handmaid", 4, "Protection until your next turn."));
        cards.add(new Card(10, "Handmaid", 4, "Protection until your next turn."));
        cards.add(new Card(11, "Prince", 5, "One player discards his or her hand."));
        cards.add(new Card(12, "Prince", 5, "One player discards his or her hand."));
        cards.add(new Card(13, "King", 6, "Trade Hands."));
        cards.add(new Card(14, "Countess", 7, "Discard if caught with King or Prince."));
        cards.add(new Card(15, "Princess", 8, "Lose, if discarded"));
        //Shuffles them
        this.shuffle();
    }
    
    //Shuffle method
    public void shuffle(){
         int index_1, index_2;
         Random generator = new Random();
         Card temp;
    	 
         for (int i=0; i<30; i++){
             index_1 = generator.nextInt(cards.size()-1);
             index_2 = generator.nextInt(cards.size()-1);

             temp = (Card)cards.get(index_2);
             cards.set(index_2, cards.get(index_1));
             cards.set(index_1, temp);
         }
    }   
    //Draw a card method 
    public Card drawFromDeck(){ 
        if (this.getTotalCards() == 0)
            throw new IllegalStateException("No cards are left in the deck.");
        else
        	return cards.remove(0);
    }
    //Returns size of deck
    public int getTotalCards(){
        return cards.size();
    }
    
    
    public static void main(String[] args) {
    	try{
    	Deck playDeck = new Deck();
    		for(int i=0; i<100; i++){
    			Card drew = playDeck.drawFromDeck();
    			System.out.println("You Drew Card #" + (i+1) + " ID:" + drew.getID() + " Name:"  + drew.getName() + " Value:" + drew.getValue() + " Text: " + drew.getText());
    		}
    	}catch(IllegalStateException e){
    		System.out.println("No cards are left in the deck.");
    	}
    }

}
