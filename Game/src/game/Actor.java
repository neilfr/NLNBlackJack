/**
 * Final Project: Deliverable 3, BlackJack game
 * Group 10: Lara Alferez, Hung-Han Chen, Neil Froggatt, Matthew Nickel
 * Class: SYST17796 Fundamentals of Software Design
 * Instructor: Liz Dancy 
 * File: Actor.java
 * Purpose: An abstract class that models people that can play
 * a hand in a BlackJack game - both players and dealer.
 */
package game;


public abstract class Actor {
    private Hand myHand=new Hand();
    private int handsWon=0;
    private int handsLost=0;
    private int pushes=0;
    private boolean busted=false;
    
    public void hit(Card myCard){
        myHand.addCard(myCard);
    }

    public Hand showHand() {
        return myHand;
    }
    
    public int handValue(){
        return myHand.handValue();
    }

    public void setMyHand(Hand myHand) {
        this.myHand = myHand;
    }
    
    // creates a brand new hand; usually for starting a new round of a game
    public void clearHand(){
        this.myHand=new Hand();
        this.busted=false;
    }

    public int getHandsWon() {
        return handsWon;
    }

    public void setHandsWon(int handsWon) {
        this.handsWon = handsWon;
    }

    public int getHandsLost() {
        return handsLost;
    }

    public void setHandsLost(int handsLost) {
        this.handsLost = handsLost;
    }

    public int getPushes() {
        return pushes;
    }

    public void setPushes(int pushes) {
        this.pushes = pushes;
    }

    public boolean getBusted(){
        return myHand.getBusted();
    }
   
}
