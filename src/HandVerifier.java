
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Chetan on 8/4/2016.
 */
public class HandVerifier {

    public boolean isOnePair(List<Card> fiveCards){
        Set<Integer> onePairSet = new HashSet<>();
        for(Card card:fiveCards){
            if(!onePairSet.contains(card.getNumber()))
                onePairSet.add(card.getNumber());
            else{
                return true;
            }
        }
        return false;
    }

    public boolean isTwoPair(List<Card> fiveCards){
        Set<Integer> twoPairSet = new HashSet<>();
        int temp=0;
        for(Card card:fiveCards){
            if(!twoPairSet.contains(card.getNumber())){
                twoPairSet.add(card.getNumber());
            }else {
                if(temp==0){
                    temp++;
                }else{
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isThreeOfAKind(List<Card> fiveCards){
        Set<Integer> threePairSet = new HashSet<>();
        int temp=0;
        for(Card card:fiveCards){
            if(!threePairSet.contains(card.getNumber())){
                threePairSet.add(card.getNumber());
            }else {
                if(temp<=1){
                    temp++;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}
