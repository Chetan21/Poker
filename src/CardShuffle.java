

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Chetan on 6/29/2016.
 */


public class CardShuffle {

    public Set<Card> createDeck(){
        Set<Card> cardSet = new HashSet<>();
        String[] suites = {"Hearts", "Spades", "Diamonds", "Clubs"};
        for(String s: suites){
            for(int i=1; i<=13; i++){
                Card c = new Card(i, s);
                cardSet.add(c);
            }
        }
        return cardSet;
    }
}
