package blackjack;

/**
 *
 * @author Nancy Chen
 */
public class Players {

    private String name;
    private int totalPlayersMoney;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

}
