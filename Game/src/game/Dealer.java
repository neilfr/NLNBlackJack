/**
 * Final Project: Deliverable 3, BlackJack game
 * Group 10: Lara Alferez, Hung-Han Chen, Neil Froggatt, Matthew Nickel
 * Class: SYST17796 Fundamentals of Software Design
 * Instructor: Liz Dancy 
 * File: Dealer.java
 * Purpose: A class that models a dealer for use in a BlackJack game
 */
package game;


public class Dealer extends Actor{
    private Deck myDeck = new Deck();
   
    //shuffle by repeatedly (100 times) selecting a card from a random
    //location in the deck, and then putting it back into the deck in
    //a new random location
    public void shuffle(){
        for (int i=0;i<100;i++){
            int randomPick = (int)(Math.random()*(myDeck.getDeckSize())); 
            Card tempCard=myDeck.getCard(randomPick);
            int randomPlace = (int)(Math.random()*(myDeck.getDeckSize()));
            myDeck.setCard(randomPlace,tempCard);
        }
    }

    public Deck getMyDeck() {
        return this.myDeck;
    }
    
    public void getNewDeck(){
        this.myDeck = new Deck();
    }
    
    public Card dealTopCard(){
        //check if we are at the end of the deck and need a new shuffled deck
        if(myDeck.getDeckSize()==0){
            this.myDeck=new Deck();
            this.shuffle();
        }
        Card topCard=this.myDeck.getCard(0);
        return topCard;
    }
}
