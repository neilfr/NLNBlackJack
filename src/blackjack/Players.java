package blackjack;

/**
 *
 * @author Nancy Chen
 */
public class Players {

    private String name;
    private int totalPlayersMoney;
    private int bet;

    HandCards card = new HandCards();

    public int getTotalPlayersMoney() {
        return totalPlayersMoney;
    }



    public HandCards getCard() {
        return card;
    }

    public void hit() {

    }

    public void stay() {

    }

    public void bet() {

    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

}
