package blackjack;

/**
 *
 * @author Nancy Chen
 */
public class DeckCards {

    private int handSize = 52;
    private Card[] cards = new Card[handSize];
    
    


    public void generateHand() {
        int countCards = 0;
        for (Card.Suit s : Card.Suit.values()) {
            for (Card.Number v : Card.Number.values()) {
                cards[countCards] = (new Card(s, v));
                countCards++;
            }
        }//end outter for
    }//end method
    

}
