/**
 * Final Project: Deliverable 3, BlackJack game
 * Group 10: Lara Alferez, Hung-Han Chen, Neil Froggatt, Matthew Nickel
 * Class: SYST17796 Fundamentals of Software Design
 * Instructor: Liz Dancy 
 * File: Player.java
 * Purpose: A class that models a player in a multi-player BlackJack game
 */
package game;

public class Player extends Actor {
    //all players start with $300
    private int money=300;
    private int bet=0;
    private boolean fold;
    private String name;
    
    public Player(String name){
        this.name=name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    // returns false if the bet is an invalid bet (IE. less than $1 or greater than the $s the player has)
    public boolean bet(int givenBet){
        if(givenBet>this.money||givenBet<1){
            this.bet=0;
            return false;
        }else{
            this.bet=givenBet;
            this.money-=givenBet;
            return true;
        }
    }
    
    public int getBet(){
        return bet;
    }
    
    public void setFold(boolean fold){
        this.fold=fold;
    }
    
    public boolean getFold(){
        return fold;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
