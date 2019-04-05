/**
 * Final Project: Deliverable 3, BlackJack game
 * Group 10: Lara Alferez, Hung-Han Chen, Neil Froggatt, Matthew Nickel
 * Class: SYST17796 Fundamentals of Software Design
 * Instructor: Liz Dancy 
 * File: Hand.java
 * Purpose: A class that models a hand of cards for a multi-player BlackJack game
 */
package game;

public class Hand {

    //maximum possible size of a dealt BlackJack hand is 13 cards
    private Card[] myHand= new Card[13];
    //start all new hands empty; with zero cards
    private int cardsInHand=0;
    //start all new hands as not busted (busted means your hand has a total value of all its cards >21
    private boolean busted = false;

    //calculate and return the total value of the hand's cards
    public int handValue(){
        int value=0;
        for(int i=0;i<cardsInHand;i++){
            // if the current card is an ACE and it will bust the hand... change its value to 1
            if((value+myHand[i].getValue()>21)&& (myHand[i].getValue()==11)){
                myHand[i].setValue(1);
            }
            value+=myHand[i].getValue();
        }
        return value;
    }
    
    public boolean getBusted(){
        return busted;
    }
    
    //add a new card to the hand
    public void addCard(Card newCard){
        myHand[cardsInHand]=newCard;
        cardsInHand++;
        
        //If there is more than 1 card in our hand, slot the card into the hand so the hand is sorted from low to high.
        //Sorting the hand makes it easier to deal with changing the value of an Ace, from 11 to 1, in an otherwise busted hand
        Card tempCard;
        if(cardsInHand>1){
            int i=cardsInHand;
            while(i>1){
                if(myHand[i-1].getValue()<myHand[i-2].getValue()){
                    tempCard=myHand[i-2];
                    myHand[i-2]=myHand[i-1];
                    myHand[i-1]=tempCard;
                }
                i--;
            }    
        }      
        if(handValue()>21)busted=true;
    }
    
    public String toString(){
        String handString="";
        for(int i=0;i<cardsInHand;i++){
            handString=handString+myHand[i]+", ";
        }
        return handString;
    }  
}
