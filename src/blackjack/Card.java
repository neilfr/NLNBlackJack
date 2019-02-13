package blackjack;

/**
 *
 * @author Nancy Chen
 */
public class Card {

    public enum Suit {
        Hearts, Spades, Clubs, Diamonds
    };

    public enum Number {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
        TEN, JACK, QUEEN, KING
    };
    
  

    private int value;
    private final Suit suit;
    private final Number number;

    public Card(Suit suit, Number number) {
        this.suit = suit;
        this.number = number;
    }
    
    

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public Number getNumber() {
        return number;
    }
    
    






}
