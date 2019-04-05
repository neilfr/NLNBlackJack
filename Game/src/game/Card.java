/**
 * Final Project: Deliverable 3, BlackJack game
 * Group 10: Lara Alferez, Hung-Han Chen, Neil Froggatt, Matthew Nickel
 * Class: SYST17796 Fundamentals of Software Design
 * Instructor: Liz Dancy 
 * File: Card.java
 * Purpose: A class that models a card for use in a BlackJack game
 */
package game;

public class Card {

    private int value;
    private Suit suit;
    private Rank rank;

    // initialize the value of the cards based on their rank
    public Card(Rank rank, Suit suit){
        this.rank=rank;
        this.suit=suit;
        switch (rank){
            case ACE:
                this.value=11;
                break;
            case TWO:
                this.value=2;
                break;
            case THREE:
                this.value=3;
                break;
            case FOUR:
                this.value=4;
                break;
            case FIVE:
                this.value=5;
                break;
            case SIX:
                this.value=6;
                break;
            case SEVEN:
                this.value=7;
                break;
            case EIGHT:
                this.value=8;
                break;
            case NINE:
                this.value=9;
                break;
            case TEN:
                this.value=10;
                break;
            case JACK:
                this.value=10;
                break;
            case QUEEN:
                this.value=10;
                break;
            case KING:
                this.value=10;
                break;
            default:
                break;
        }
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

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
    
    public String toString(){
        return rank+" of "+suit;
    }
}