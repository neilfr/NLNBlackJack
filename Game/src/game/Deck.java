/**
 * Final Project: Deliverable 3, BlackJack game
 * Group 10: Lara Alferez, Hung-Han Chen, Neil Froggatt, Matthew Nickel
 * Class: SYST17796 Fundamentals of Software Design
 * Instructor: Liz Dancy 
 * File: Deck.java
 * Purpose: A class that models a deck of cards for use in a BlackJack game
 */
package game;

public class Deck{
    
    //initial size of a BlackJack deck is 52 cards
    private int deckSize=52;
    Card[] myDeck=new Card[deckSize];

    //initialize a sorted deck
    public Deck() {
        int i=0;
        for(Rank r:Rank.values()){
            for (Suit s:Suit.values()){
                this.myDeck[i++]=new Card(r,s);
            }
        }
    }
    
    public String toString(){
        String deckString="";
        for(int i=0;i<deckSize;i++){
            deckString=deckString+myDeck[i]+"\n";
        }
        return deckString;
    }  

    // remove a card from the deck, then bring all the cards behind it forwards to fill the spot it vacated
    public Card getCard(int index){
        Card selectedCard=myDeck[index];
        deckSize--;
        for(int i=index;i<deckSize;i++){
            myDeck[i]=myDeck[i+1];
        }
        return selectedCard;
    }
    
    // move all the cards behind the selected index back 1, to make a spot to insert the card being added to the deck
    public void setCard(int index, Card card){
        for(int i=deckSize;i>index;i--){
            myDeck[i]=myDeck[i-1];
        }
        this.myDeck[index]=card;
        deckSize++;
    }
    
    public int getDeckSize(){
        return deckSize;
    }
}
