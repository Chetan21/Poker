

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Created by Chetan on 6/29/2016.
 */
public class CardDistribution {
    public Player player1;
    public Player player2;
    private Card player1card1;
    private Card player1card2;
    private Card player2card1;
    private Card player2card2;

    public void distributeCards(Set<Card> cardSet){
        List<Card> cardList = new ArrayList<>();
        cardList = drawCards(cardSet);


        player1 = new Player(cardList.get(0), cardList.get(2));
        player2 = new Player(cardList.get(1), cardList.get(3));



    }

    public List<Card> drawCards(Set<Card> cardSet){
        List<Card> list = new ArrayList<>();
        int index = 0;
        for(Card card:cardSet){
            if(index<9){
                list.add(card);
                cardSet.remove(card);
            }else
                break;
            index++;
        }
        return list;
    }
}
