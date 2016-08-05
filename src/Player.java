

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chetan on 6/29/2016.
 */
public class Player {

    private int number;
    private String suite;
    private Card card1;
    private Card card2;

    Player(Card card1, Card card2){
        this.card1 = card1;
        this.card2 = card2;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setSuite(String suite){
        this.suite =suite;
    }

    public int getNumber(){
        return number;
    }

    public String getSuite(){
        return suite;
    }

    public List<Card> getCards(){
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        return cardList;
    }
}
