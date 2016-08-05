

/**
 * Created by Chetan on 6/29/2016.
 */
class Card{
    private final int number;
    private final String suite;

    Card(int number, String suite){
        this.number = number;
        this.suite = suite;
    }

    public int getNumber(){
        return number;
    }

    public String getSuite(){
        return suite;
    }
}
